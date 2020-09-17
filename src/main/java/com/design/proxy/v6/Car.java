package com.design.proxy.v6;

import java.util.Random;

/**
 * 问题2：如果无法修改源码
 * 可以通过静态代理
 */
public class Car implements Movable, Movable2{
    @Override
    public void move() {
        System.out.println("the car moving...");
        try {
            Thread.sleep(new Random().nextInt(5000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void move2() {
        System.out.println("move 2.....");
    }
}
