package com.design.proxy.v4;

/**
 * 问题4：如何实现代理嵌套
 * 通过代理接口
 */
public class ProxyClient {
    public static void main(String[] args) {
        TimeProxyCar timeProxyCar = new TimeProxyCar(new Car());
        timeProxyCar.move();

        LogProxyCar logProxyCar = new LogProxyCar(new Car());
        logProxyCar.move();
    }
}
