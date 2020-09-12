package com.design.proxy.v2;

/**
 * 问题2：如果无法修改源码
 * 可以通过简单的静态代理
 */
public class ProxyClient {
    public static void main(String[] args) {
        Car car = new Car();
        car.move();
    }
}
