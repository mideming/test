package com.design.proxy.v3;

/**
 * 问题3：新加一个日志功能
 * 可以新加一个代理对象
 */
public class ProxyClient {
    public static void main(String[] args) {
        TimeProxyCar timeProxyCar = new TimeProxyCar(new Car());
        timeProxyCar.move();
    }
}
