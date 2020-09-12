package com.design.chainOfResponsibility.v5;

/**
 * 责任链模式：终极形态，模仿Servlet的Filter
 */
public class CORClient5 {
    public static void main(String[] args) {
        FilterRequest request = new FilterRequest();
        FilterResponse response = new FilterResponse();
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
        filterChain1.doFilter(request, response, filterChain1);
        System.out.println(request);
        System.out.println(response);
    }
}
