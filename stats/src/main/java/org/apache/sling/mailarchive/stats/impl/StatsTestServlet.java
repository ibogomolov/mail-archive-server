package org.apache.sling.mailarchive.stats.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.sling.SlingServlet;
import org.apache.james.mime4j.dom.Message;
import org.apache.james.mime4j.dom.address.Address;
import org.apache.james.mime4j.dom.address.AddressList;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.request.RequestParameter;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.mailarchive.stats.MailStatsProcessor;
import org.apache.sling.mailarchiveserver.api.MboxParser;

@SuppressWarnings("serial")
@SlingServlet(
        resourceTypes = "mailarchiveserver/import",
        methods = {"POST", "PUT"},
        selectors="stats")
/** Test the stats import with
 *   curl -u admin:admin -XPOST -Fmboxfile=@jackrabbit-dev-201201.mbox http://localhost:8080/content/mailarchiveserver/import.stats.txt
 */
public class StatsTestServlet extends SlingAllMethodsServlet {

    private static final String IMPORT_FILE_ATTRIB_NAME = "mboxfile";
    private static final String [] EMPTY_STRING_ARRAY = new String[]{};

    @Reference
    private MboxParser parser;
    
    @Reference
    private MailStatsProcessor processor;

    @Override
    protected void doPost(SlingHttpServletRequest request, SlingHttpServletResponse response) 
            throws ServletException, IOException {
        final RequestParameter param = request.getRequestParameter(IMPORT_FILE_ATTRIB_NAME);
        if(param == null) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Missing required parameter " + IMPORT_FILE_ATTRIB_NAME);
            return;
        }
        
        InputStream is = null;
        final PrintWriter pw = response.getWriter();
        response.setContentType("text/plain");
        response.setCharacterEncoding("UTF-8");
        
        try {
            is = param.getInputStream();
            pw.println("Creating stats from supplied mbox file...");
            int counter=0;
            final Iterator<Message> it = parser.parse(is);
            while(it.hasNext()) {
                final Message m = it.next();
                final String [] to = toArray(m.getTo());
                final String [] cc = toArray(m.getCc());
                processor.computeStats(m.getDate(), m.getFrom().toString(), to, cc);
                counter++;
            }
            pw.println(counter + " messages parsed");
        } finally {
            processor.flush();
            pw.flush();
            if(is != null) {
                is.close();
            }
        }
    }
    
    private String [] toArray(AddressList list) {
        if(list == null) {
            return null;
        }
        final List<String> result = new ArrayList<String>();
        final Iterator<Address> it = list.iterator();
        while(it.hasNext()) {
            result.add(it.next().toString());
        }
        return result.toArray(EMPTY_STRING_ARRAY);
    }

}