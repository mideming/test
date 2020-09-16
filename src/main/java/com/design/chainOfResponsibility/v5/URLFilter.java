package com.design.chainOfResponsibility.v5;

/**
 * url处理类
 */
public class URLFilter implements Filter {
    @Override
    public void doFilter(FilterRequest request, FilterResponse response, FilterChain filterChain) {
        String msg = request.getMsg();
        msg = msg.replace("weimob.com", "http://www.weimob.com");
        request.setMsg(msg);
        request.setOrder(request.getOrder() + "--URLFilter()");
        filterChain.doFilter(request, response, filterChain);
        response.setOrder(response.getOrder() + "--URLFilter()");
    }
}
