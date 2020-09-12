package com.design.factory.v3;

/**
 * 具体产品
 */
public class DellMouse implements Mouse {
    @Override
    public void run() {
        System.out.println("DellMouse");
    }
}
