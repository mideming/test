package com.design.chainOfResponsibility.v5;

public class FilterResponse {
    private String msg = "response的执行顺序";

    @Override
    public String toString() {
        return "FilterResponse{" +
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
