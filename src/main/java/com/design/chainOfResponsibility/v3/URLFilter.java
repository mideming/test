package com.design.chainOfResponsibility.v3;

/**
 * url处理类
 */
public class URLFilter implements Filter {
    @Override
    public void doFilter(Message message) {
        String msg = message.getMsg();
        msg = msg.replace("weimob.com", "http://www.weimob.com");
        message.setMsg(msg);
    }
}
