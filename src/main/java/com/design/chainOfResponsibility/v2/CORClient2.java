package com.design.chainOfResponsibility.v2;

/**
 * 责任链模式：更好的拓展性（定义不同的Filter，将处理逻辑进行封装）
 */
public class CORClient2 {
    public static void main(String[] args) {
        Message message = new Message();
        // 处理特殊字符
        Filter htmlFilter = new HTMLFilter();
        htmlFilter.doFilter(message);
        // 处理敏感字符
        Filter sensitiveFilter = new SensitiveFilter();
        sensitiveFilter.doFilter(message);
        System.out.println(message);
    }
}
