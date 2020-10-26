package com.mdm.design.proxy.v4;

public class TimeProxyCar implements Movable {
    private Car car;

    public TimeProxyCar(Car car) {
        this.car = car;
    }

    @Override
    public void move() {
        long startTime = System.currentTimeMillis();
        car.move();
        long endTime = System.currentTimeMillis();
        System.out.println("运行了:" + (endTime - startTime));
    }
}
