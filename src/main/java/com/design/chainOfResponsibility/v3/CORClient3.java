package com.design.chainOfResponsibility.v3;

import java.util.ArrayList;
import java.util.List;

/**
 * 责任链模式：将Filter们构成链条执行
 */
public class CORClient3 {
    public static void main(String[] args) {
        Message message = new Message();
        List<Filter> filters = new ArrayList<>();
        filters.add(new HTMLFilter());
        filters.add(new SensitiveFilter());
        // 处理message
        filters.forEach(filter -> filter.doFilter(message));
        System.out.println(message);
    }
}
