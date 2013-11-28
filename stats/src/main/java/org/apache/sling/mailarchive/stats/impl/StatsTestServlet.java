package org.apache.sling.mailarchive.stats.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.sling.SlingServlet;
import org.apache.james.mime4j.dom.Message;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.request.RequestParameter;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
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

    @Reference
    private MboxParser parser;

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
                counter++;
            }
            pw.println(counter + " messages parsed");
        } finally {
            pw.flush();
            if(is != null) {
                is.close();
            }
        }
    }

}

