package com.design.proxy.v5;

public class LogProxyCar implements Movable {
    private Movable movable;

    public LogProxyCar(Movable movable) {
        this.movable = movable;
    }

    @Override
    public void move() {
        System.out.println("begin!");
        movable.move();
        System.out.println("end!");
    }
}
