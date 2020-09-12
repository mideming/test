package com.design.chainOfResponsibility.v5;


public interface Filter {
    void doFilter(FilterRequest request, FilterResponse response, FilterChain filterChain);
}
