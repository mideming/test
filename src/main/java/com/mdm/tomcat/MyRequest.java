package com.mdm.tomcat;

import java.io.IOException;
import java.io.InputStream;

public class MyRequest {

    private String url;

    private String method;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public MyRequest(InputStream inputStream) throws IOException {
        StringBuilder sb = new StringBuilder();
        byte[] httpRequestByte = new byte[1024];
        int length = 0;
        if ((length = inputStream.read(httpRequestByte)) > 0) {
            sb.append(new String(httpRequestByte, 0, length));
        }
        System.out.println("httpRequest:" + sb);
        String httpHead = sb.toString().split("\n")[0];
        method = httpHead.split("\\s")[0];
        url = httpHead.split("\\s")[1];
    }
}
