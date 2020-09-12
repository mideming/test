package com.design.strategy;

public class Content {
    private IStrategy iStrategy;
    public Content (IStrategy iStrategy) {
        this.iStrategy = iStrategy;
    }
    void operate() {
        iStrategy.operate();
    }
}
