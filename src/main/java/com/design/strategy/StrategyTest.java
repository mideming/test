package com.design.strategy;

/**
 * 定义一系列算法，将每个算法封装到具有公共接口的一系列策略类中，从而使它们可以相互替换 & 让算法可在不影响客户端的情况下发生变化
 */
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
