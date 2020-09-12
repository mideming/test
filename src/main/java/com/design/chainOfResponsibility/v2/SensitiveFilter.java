package com.design.chainOfResponsibility.v2;

public class SensitiveFilter implements Filter {
    @Override
    public void doFilter(Message message) {
        String msg = message.getMsg();
        msg = msg.replace("996", "955");
        message.setMsg(msg);
    }
}
