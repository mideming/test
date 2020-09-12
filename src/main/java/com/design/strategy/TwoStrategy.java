package com.design.strategy;

public class TwoStrategy implements IStrategy {
    @Override
    public void operate() {
        System.out.println("执行第二个策略");
    }
}
