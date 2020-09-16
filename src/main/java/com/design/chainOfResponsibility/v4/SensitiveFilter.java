package com.design.chainOfResponsibility.v4;

/**
 * 敏感字符处理类
 */
public class SensitiveFilter implements Filter {
    @Override
    public void doFilter(FilterRequest request, FilterResponse response, FilterChain filterChain) {
        String msg = request.getMsg();
        msg = msg.replace("996", "955");
        request.setMsg(msg);
        request.setOrder(request.getOrder() + "--SensitiveFilter()");
        filterChain.doFilter(request, response, filterChain);
        response.setOrder(response.getOrder() + "--SensitiveFilter()");
    }
}
