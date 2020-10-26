package com.mdm.design.proxy.v3;

import java.util.Random;


public class Car implements Movable {
    @Override
    public void move() {
        System.out.println("the car moving...");
        try {
            Thread.sleep(new Random().nextInt(5000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
