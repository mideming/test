package com.design.chainOfResponsibility.v1;

/**
 * 责任链模式：原始代码
 */
public class CORClient1 {
    public static void main(String[] args) {
        Message message = new Message();
        String msg = message.getMsg();
        // 处理特殊字符
        msg = msg.replace("<", "[");
        msg = msg.replace(">", "]");
        // 处理敏感字符
        msg = msg.replace("996", "955");
        message.setMsg(msg);
        System.out.println(message);
    }
}
