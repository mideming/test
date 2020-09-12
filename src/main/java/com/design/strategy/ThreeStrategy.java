package com.design.strategy;

public class ThreeStrategy implements IStrategy {
    @Override
    public void operate() {
        System.out.println("执行第三个策略");
    }
}
