package com.design.chainOfResponsibility.v4;

/**
 * 表情处理类
 */
public class FaceFilter implements Filter {
    @Override
    public boolean doFilter(Message message) {
        String msg = message.getMsg();
        msg = msg.replace(":(", ":)");
        message.setMsg(msg);
        return true;
    }
}
