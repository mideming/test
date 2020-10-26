package com.mdm.tomcat;

import java.io.IOException;

public class FaviconServlet extends MyServlet{
    protected void doGet(MyRequest myRequest, MyResponse myResponse) {
        try {
            myResponse.write("Favicon");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void doPost(MyRequest myRequest, MyResponse myResponse) {
        try {
            myResponse.write("Favicon");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
