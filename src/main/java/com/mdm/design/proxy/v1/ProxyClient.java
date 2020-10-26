package com.mdm.design.proxy.v1;
/**
 * 问题1：我想记录汽车移动的时间
 * 最简单的方法：修改代码，记录时间
 */
public class ProxyClient {
    public static void main(String[] args) {
        Car car = new Car();
        car.move();
    }
}
