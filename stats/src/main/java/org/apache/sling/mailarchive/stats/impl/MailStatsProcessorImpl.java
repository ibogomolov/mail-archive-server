package org.apache.sling.mailarchive.stats.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.Service;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ResourceResolverFactory;
import org.apache.sling.api.resource.ResourceUtil;
import org.apache.sling.mailarchive.stats.MailStatsProcessor;
import org.apache.sling.mailarchive.stats.OrgMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
@Service
/** Computes stats of how often a given organization writes to
 *  another one in a given time period which is defined by
 *  a Date formatter. Using a formatter that uses only year and
 *  month, for example, yields per-month data.
 */
public class MailStatsProcessorImpl implements MailStatsProcessor {
    private final Logger log = LoggerFactory.getLogger(getClass());
    
    @Reference
    private OrgMapper orgMapper;
    
    @Reference
    private ResourceResolverFactory resourceResolverFactory;
    
    // TODO configurable format
    final DateFormat dateFormat = new SimpleDateFormat("YYYY/MM");
    
    // TODO configurable root path
    private static final String ROOT_PATH = "/content/mailarchiveserver/stats"; 
    
    public static final String DEFAULT_RESOURCE_TYPE = "nt:unstructured";
    public static final String ORG_RESOURCE_TYPE = "mailserver/stats/org";
    public static final String DATA_RESOURCE_TYPE = "mailserver/stats/data";
    
    // We need to count the number of messages to a destination, 
    // per formatted timestamp and source
    private final Map<String, DataRecord> data = new HashMap<String, DataRecord>();
    
    class DataRecord {
        final String destination;
        final Map<String, Integer> sourceCounts = new HashMap<String, Integer>();
        final String timestampPath;
        
        DataRecord(Date d, String destination) {
            this.destination = orgMapper.mapToOrg(destination);
            synchronized (dateFormat) {
                this.timestampPath = dateFormat.format(d); 
            }
        }
        
        Map<String, Integer> getSourceCounts() {
            return sourceCounts;
        }
        
        void increment(String source) {
            source = orgMapper.mapToOrg(source);
            Integer count = sourceCounts.get(source);
            if(count == null) {
                count = 1;
            } else {
                count = count.intValue() + 1;
            }
            sourceCounts.put(source, count);
        }
        
        public String getOrgPath() {
            return ROOT_PATH + "/" + destination;
        }
        
        public String getPath() {
            return getOrgPath() + "/" + timestampPath;
        }
        
        @Override
        public String toString() {
            return new StringBuilder()
            .append(getClass().getSimpleName())
            .append(' ')
            .append(timestampPath)
            .append(' ')
            .append(destination)
            .append(' ')
            .append(sourceCounts)
            .toString();
        }
        
        String getKey() {
            return new StringBuilder()
            .append(timestampPath)
            .append('#')
            .append(destination)
            .toString();
        }
    }
    
    public void computeStats(Date d, String from, String [] to, String [] cc) {
        if(to != null) {
            for(String dest : to) {
                addRecord(d, from, dest);
            }
        }
        if(cc != null) {
            for(String dest : cc) {
                addRecord(d, from, dest);
            }
        }
    }
    
    private void addRecord(Date d, String from, String to) {
        final DataRecord r = new DataRecord(d, to);
        synchronized (data) {
            final DataRecord existing = data.get(r.getKey());
            if(existing == null) {
                r.increment(from);
                data.put(r.getKey(), r);
            } else {
                existing.increment(from);
            }
        }
    }
    
    /** Flush in-memory data to permanent storage */
    public void flush() {
        try {
            ResourceResolver resolver = null;
            try {
                resolver = resourceResolverFactory.getAdministrativeResourceResolver(null);
                for(DataRecord r : data.values()) {
                    // Each org gets its own resource under our root
                    log.info("Storing {} at path {}", r, r.getPath());
                    ResourceUtil.getOrCreateResource(resolver, ROOT_PATH, DEFAULT_RESOURCE_TYPE, DEFAULT_RESOURCE_TYPE, false);
                    ResourceUtil.getOrCreateResource(resolver, r.getOrgPath(), ORG_RESOURCE_TYPE, DEFAULT_RESOURCE_TYPE, false);
                    
                    // Properties are the message counts per source for this destination
                    final Map<String, Object> data = new HashMap<String, Object>();
                    for(Map.Entry<String, Integer> e : r.getSourceCounts().entrySet()) {
                        data.put(e.getKey(), e.getValue());
                    }
                    data.put("sling:resourceType", DATA_RESOURCE_TYPE);
                    ResourceUtil.getOrCreateResource(resolver, r.getPath(), data, DEFAULT_RESOURCE_TYPE, false);
                    
                }
                data.clear();
            } finally {
                if(resolver != null) {
                    resolver.commit();
                    resolver.close();
                }
            }
        } catch(Exception e) {
            log.warn("Exception in flush()", e);
        }
    }
    
    // TODO don't we have a utility for that?
    static String makeJcrFriendly(String s) {
        return s.replaceAll("[\\s\\.-]", "_").replaceAll("\\W", "").replaceAll("\\_", " ").trim().replaceAll(" ", "_");
    }

}