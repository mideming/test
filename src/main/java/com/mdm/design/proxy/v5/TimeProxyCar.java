package com.mdm.design.proxy.v5;

public class TimeProxyCar implements Movable {
    private Movable movable;

    public TimeProxyCar(Movable movable) {
        this.movable = movable;
    }

    @Override
    public void move() {
        long startTime = System.currentTimeMillis();
        movable.move();
        long endTime = System.currentTimeMillis();
        System.out.println("运行了:" + (endTime - startTime));
    }
}
