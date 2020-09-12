package com.design.chainOfResponsibility.v2;

public class Message {
    private String name;
    private String msg = "大家好:( <script>,欢迎访问weimob.com,大家都是996";

    @Override
    public String toString() {
        return "Message{" +
                "msg='" + msg + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
