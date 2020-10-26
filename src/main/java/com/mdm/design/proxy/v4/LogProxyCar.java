package com.mdm.design.proxy.v4;

public class LogProxyCar implements Movable {
    private Car car;

    public LogProxyCar(Car car) {
        this.car = car;
    }

    @Override
    public void move() {
        System.out.println("begin!");
        car.move();
        System.out.println("end!");
    }
}
