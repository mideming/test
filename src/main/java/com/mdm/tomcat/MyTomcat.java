package com.mdm.tomcat;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class MyTomcat {
    private int port;
    private Map<String, String> urlServletMap = new HashMap<String, String>();
    public MyTomcat (int port) {
        this.port = port;
    }
    public void start () {
        initServletMapping();
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(port);
            System.out.println("my tomcat begin start");
            while (true){
                Socket socket = serverSocket.accept();
                InputStream inputStream = socket.getInputStream();
                OutputStream outputStream = socket.getOutputStream();
                MyRequest myRequest = new MyRequest(inputStream);
                MyResponse myResponse = new MyResponse(outputStream);
                String clazz = urlServletMap.get(myRequest.getUrl());
                try {
                    Class<MyServlet> servletClass = (Class<MyServlet>)Class.forName(clazz);
                    try {
                        MyServlet myServlet = servletClass.newInstance();
                        try {
                            myServlet.service(myRequest, myResponse);
                        } catch (NoSuchMethodException e) {
                            e.printStackTrace();
                        }
                    } catch (InstantiationException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void initServletMapping() {
        for (ServletMapping servletMapping : ServletMappingConfig.servletMappingList) {
            urlServletMap.put(servletMapping.getUrl(), servletMapping.getClazz());
        }
    }

    public static void main(String[] args) {
        new MyTomcat(8080).start();
    }
}
