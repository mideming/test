package com.design.chainOfResponsibility.v5;


public class SensitiveFilter implements Filter {
    @Override
    public void doFilter(FilterRequest request, FilterResponse response, FilterChain filterChain) {
        String msg = request.getMsg();
        msg = msg.replace("996", "955");
        request.setMsg(msg);
        filterChain.doFilter(request, response, filterChain);
        response.setMsg(response.getMsg() + "--SensitiveFilter()");
    }
}
