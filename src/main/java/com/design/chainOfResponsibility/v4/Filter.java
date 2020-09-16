package com.design.chainOfResponsibility.v4;


public interface Filter {
    void doFilter(FilterRequest request, FilterResponse response, FilterChain filterChain);
}
