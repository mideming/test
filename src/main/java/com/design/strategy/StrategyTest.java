package com.design.strategy;

public class StrategyTest {
    public static void main(String[] args) {
        // 策略1
        Content oneStrategy = new Content(new OneStrategy());
        oneStrategy.operate();
        // 策略2
        Content twoStrategy = new Content(new TwoStrategy());
        twoStrategy.operate();
        // 策略3
        Content threeStrategy = new Content(new ThreeStrategy());
        threeStrategy.operate();
    }
}
