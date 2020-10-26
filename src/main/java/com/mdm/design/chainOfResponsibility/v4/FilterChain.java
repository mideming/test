package com.mdm.design.chainOfResponsibility.v4;


import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter{
    private List<Filter> filters = new ArrayList<>();
    private int index = 0;
    public FilterChain add(Filter filter) {
        filters.add(filter);
        return this;
    }

    public void doFilter(FilterRequest request, FilterResponse response, FilterChain filterChain) {
        if(index == filters.size()) {
            return;
        }
        Filter filter = filters.get(index);
        index++;
        filter.doFilter(request, response,this);
    }
}
