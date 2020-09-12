package com.design.proxy.v6;

import java.lang.reflect.Proxy;


/**
 * 内部是怎么调用到代理的方法的
 */
public class ProxyClient {
    public static void main(String[] args) {
        Movable movable = new Car();
        // 产生的代理类保存下来
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        Movable proxyInstance = (Movable)Proxy.newProxyInstance(movable.getClass().getClassLoader(), new Class[]{Movable.class}, new ProxyHandler(movable));
        proxyInstance.move();
    }
}
