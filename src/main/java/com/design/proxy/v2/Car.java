package com.design.proxy.v2;

import java.util.Random;


public class Car implements Movable {
    @Override
    public void move() {
        long startTime = System.currentTimeMillis();
        System.out.println("the car moving...");
        try {
            Thread.sleep(new Random().nextInt(5000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("运行了:" + (endTime - startTime));
    }
}
