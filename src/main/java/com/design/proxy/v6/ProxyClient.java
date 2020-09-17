package com.design.proxy.v6;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


/**
 * 内部是怎么调用到代理的方法的
 */
public class ProxyClient {
    public static void main(String[] args) {
        Movable movable = new Car();
        // 产生的代理类保存下来
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        Object object =Proxy.newProxyInstance(movable.getClass().getClassLoader(), new Class[]{Movable.class, Movable2.class}, new LogProxyHandler(movable));
        Movable proxyInstance1 = (Movable)object;
        Movable2 proxyInstance2 = (Movable2)object;
        proxyInstance1.move();
        proxyInstance2.move2();
    }
}
