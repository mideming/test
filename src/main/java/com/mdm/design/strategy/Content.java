package com.mdm.design.strategy;

/**
 * 环境角色：持有抽象策略角色的引用
 */
public class Content {

    private IStrategy iStrategy;

    public Content (IStrategy iStrategy) {
        this.iStrategy = iStrategy;
    }

    public void operate() {
        iStrategy.operate();
    }
}
