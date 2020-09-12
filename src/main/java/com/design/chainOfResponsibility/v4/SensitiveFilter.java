package com.design.chainOfResponsibility.v4;

public class SensitiveFilter implements Filter {
    @Override
    public boolean doFilter(Message message) {
        String msg = message.getMsg();
        msg = msg.replace("996", "955");
        message.setMsg(msg);
        return true;
    }
}
