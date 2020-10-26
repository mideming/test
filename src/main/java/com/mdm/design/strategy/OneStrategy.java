package com.mdm.design.strategy;

/**
 * 具体策略角色
 */
public class OneStrategy implements IStrategy {
    @Override
    public void operate() {
        System.out.println("执行第一个策略");
    }
}
