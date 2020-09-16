package com.design.chainOfResponsibility.v3;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter{
    private List<Filter> filters = new ArrayList<>();

    public FilterChain add(Filter filter) {
        filters.add(filter);
        return this;
    }

    public void doFilter(Message message) {
        for (Filter filter : filters) {
            filter.doFilter(message);
        }
    }
}
