package com.design.chainOfResponsibility.v5;


public class HTMLFilter implements Filter {
    @Override
    public void doFilter(FilterRequest request, FilterResponse response, FilterChain filterChain) {
        String msg = request.getMsg();
        msg = msg.replace("<", "[");
        msg = msg.replace(">", "]");
        request.setMsg(msg);
        filterChain.doFilter(request, response, filterChain);
        response.setMsg(response.getMsg() + "--HTMLFilter()");
    }
}
