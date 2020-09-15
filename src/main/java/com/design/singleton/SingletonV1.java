package com.design.singleton;

/**
 * 饿汉
 * 优点：线程安全的
 * 缺点：直接实例化，资源会浪费。
 * 丢失了延迟实例化的性能好处
 */
public class SingletonV1 {
    private SingletonV1() {
    }

    private static SingletonV1 singletonV1 = new SingletonV1();

    public static SingletonV1 getInstance() {
        return singletonV1;
    }
}
