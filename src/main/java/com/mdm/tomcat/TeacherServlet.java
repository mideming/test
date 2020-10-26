package com.mdm.tomcat;

import java.io.IOException;

public class TeacherServlet extends MyServlet{
    protected void doGet(MyRequest myRequest, MyResponse myResponse) {
        try {
            myResponse.write("I am a teacher");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void doPost(MyRequest myRequest, MyResponse myResponse) {
        try {
            myResponse.write("I am a teacher");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
