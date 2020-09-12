package com.design.chainOfResponsibility.v4;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter{
    private List<Filter> filters = new ArrayList<>();

    public FilterChain add(Filter filter) {
        filters.add(filter);
        return this;
    }

    public boolean doFilter(Message message) {
        for (Filter filter : filters) {
            if(!filter.doFilter(message)){
                return false;
            }
        }
        return true;
    }
}
