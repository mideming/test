package com.design.chainOfResponsibility.v4;

/**
 * 责任链模式：链式编程，把FilterChain定义成Filter；并且FilterChain中的某个Filter决定链条是否继续
 */
public class CORClient4 {
    public static void main(String[] args) {
        Message message = new Message();
        // 第一个链条
        FilterChain filterChain1 = new FilterChain();
        filterChain1.add(new HTMLFilter())
                .add(new SensitiveFilter());
        // 第二个链条
        FilterChain filterChain2 = new FilterChain();
        filterChain2.add(new FaceFilter())
                .add(new URLFilter());
        // 把第二个链条加到第一个链条上
        filterChain1.add(filterChain2);
        // 处理message
        filterChain1.doFilter(message);
        System.out.println(message);
    }
}
