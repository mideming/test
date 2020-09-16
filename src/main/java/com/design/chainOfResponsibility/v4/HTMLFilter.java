package com.design.chainOfResponsibility.v4;

/**
 * 特殊字符处理类
 */
public class HTMLFilter implements Filter {
    @Override
    public void doFilter(FilterRequest request, FilterResponse response, FilterChain filterChain) {
        String msg = request.getMsg();
        msg = msg.replace("<", "[");
        msg = msg.replace(">", "]");
        request.setMsg(msg);
        request.setOrder(request.getOrder() + "--HTMLFilter()");
        filterChain.doFilter(request, response, filterChain);
        response.setOrder(response.getOrder() + "--HTMLFilter()");
    }
}
