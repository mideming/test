package com.design.chainOfResponsibility.v3;

import java.util.ArrayList;
import java.util.List;

/**
 * 责任链模式：将Filter们构成链条执行
 */
public class CORClient3 {
    public static void main(String[] args) {
        Message message = new Message();
        message.setMsg("大家好:( <script>,欢迎访问weimob.com,大家都是996");
        System.out.println(message);
        List<Filter> filters = new ArrayList<>();
        filters.add(new HTMLFilter());
        filters.add(new SensitiveFilter());
        // 处理message
        for (Filter filter : filters) {
            filter.doFilter(message);
        }
        System.out.println(message);
    }
}
