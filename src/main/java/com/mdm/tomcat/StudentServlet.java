package com.mdm.tomcat;

import java.io.IOException;

public class StudentServlet extends MyServlet{
    protected void doGet(MyRequest myRequest, MyResponse myResponse) {
        try {
            myResponse.write("I am a student");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void doPost(MyRequest myRequest, MyResponse myResponse) {
        try {
            myResponse.write("I am a student");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
