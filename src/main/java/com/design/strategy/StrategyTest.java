package com.design.strategy;

public class StrategyTest {
    public static void main(String[] args) {
        Content oneStrategy = new Content(new OneStrategy());
        oneStrategy.operate();
        Content twoStrategy = new Content(new TwoStrategy());
        twoStrategy.operate();
        Content threeStrategy = new Content(new ThreeStrategy());
        threeStrategy.operate();
    }
}
