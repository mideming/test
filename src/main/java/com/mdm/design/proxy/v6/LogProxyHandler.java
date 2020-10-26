package com.mdm.design.proxy.v6;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogProxyHandler implements InvocationHandler {
    private Object object;

    public LogProxyHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("begin!");
        Object invoke = method.invoke(object, args);
        System.out.println("end!");
        return invoke;
    }
}
