package com.design.factory.v2;

/**
 * 具体产品
 */
public class DellMouse implements Mouse {
    @Override
    public void run() {
        System.out.println("DellMouse");
    }
}
