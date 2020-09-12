package com.design.strategy;

public class OneStrategy implements IStrategy {
    @Override
    public void operate() {
        System.out.println("执行第一个策略");
    }
}
