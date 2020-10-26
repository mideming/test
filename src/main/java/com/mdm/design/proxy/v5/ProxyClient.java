package com.mdm.design.proxy.v5;

/**
 * 问题5：我想代理任何类
 */
public class ProxyClient {
    public static void main(String[] args) {
        LogProxyCar logTimeProxyCar = new LogProxyCar(new TimeProxyCar(new Car()));
        logTimeProxyCar.move();
    }
}
