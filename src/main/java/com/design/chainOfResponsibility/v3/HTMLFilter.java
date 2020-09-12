package com.design.chainOfResponsibility.v3;

public class HTMLFilter implements Filter {
    @Override
    public void doFilter(Message message) {
        String msg = message.getMsg();
        msg = msg.replace("<", "[");
        msg = msg.replace(">", "]");
        message.setMsg(msg);
    }
}
