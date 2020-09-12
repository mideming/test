package com.design.chainOfResponsibility.v4;

public class HTMLFilter implements Filter {
    @Override
    public boolean doFilter(Message message) {
        String msg = message.getMsg();
        msg = msg.replace("<", "[");
        msg = msg.replace(">", "]");
        message.setMsg(msg);
        return true;
    }
}
