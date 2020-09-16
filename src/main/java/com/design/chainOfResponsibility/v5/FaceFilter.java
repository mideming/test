package com.design.chainOfResponsibility.v5;

/**
 * 表情处理类
 */
public class FaceFilter implements Filter {
    @Override
    public void doFilter(FilterRequest request, FilterResponse response, FilterChain filterChain) {
        String msg = request.getMsg();
        msg = msg.replace(":(", ":)");
        request.setMsg(msg);
        request.setOrder(request.getOrder() + "--FaceFilter()");
        filterChain.doFilter(request, response, filterChain);
        response.setOrder(response.getOrder() + "--FaceFilter()");
    }
}
