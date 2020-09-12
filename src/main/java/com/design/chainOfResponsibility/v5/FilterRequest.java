package com.design.chainOfResponsibility.v5;

public class FilterRequest {
    private String msg = "大家好:( <script>,欢迎访问weimob.com,大家都是996";

    @Override
    public String toString() {
        return "FilterRequest{" +
                "msg='" + msg + '\'' +
                '}';
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
