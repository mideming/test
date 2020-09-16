package com.design.chainOfResponsibility.v3;

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
                // 出现一个false，则不再往下执行了
                return false;
            }
        }
        return true;
    }
}
