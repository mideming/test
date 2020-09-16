package com.design.chainOfResponsibility.v3;

/**
 * 表情处理类
 */
public class FaceFilter implements Filter {
    @Override
    public void doFilter(Message message) {
        String msg = message.getMsg();
        msg = msg.replace(":(", ":)");
        message.setMsg(msg);
    }
}
