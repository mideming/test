package com.mdm.tomcat;

import java.util.ArrayList;
import java.util.List;

public class ServletMappingConfig {
    public static List<ServletMapping> servletMappingList = new ArrayList<ServletMapping>();
    static {
        servletMappingList.add(new ServletMapping("student", "/student", "com.mdm.tomcat.StudentServlet"));
        servletMappingList.add(new ServletMapping("teacher", "/teacher", "com.mdm.tomcat.TeacherServlet"));
        servletMappingList.add(new ServletMapping("Favicon", "/favicon.ico", "com.mdm.tomcat.FaviconServlet"));
    }
}
