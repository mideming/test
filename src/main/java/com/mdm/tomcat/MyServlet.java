package com.mdm.tomcat;

public abstract class MyServlet {
    protected abstract void doGet(MyRequest myRequest, MyResponse myResponse);

    protected abstract void doPost(MyRequest myRequest, MyResponse myResponse);

    public void service(MyRequest myRequest, MyResponse myResponse) throws NoSuchMethodException {
        if ("GET".equalsIgnoreCase(myRequest.getMethod())) {
            doGet(myRequest, myResponse);
        } else if ("POST".equalsIgnoreCase(myRequest.getMethod())) {
            doPost(myRequest, myResponse);
        } else {
            throw new NoSuchMethodException("not support");
        }
    }

}
