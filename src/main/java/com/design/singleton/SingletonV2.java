package com.design.singleton;

/**
 * 懒汉
 * 优点：一开始不进行实例化
 * 缺点：非线程安全
 */
public class SingletonV2 {
    private static SingletonV2 singletonV2;

    private SingletonV2() {
    }

    public static SingletonV2 getInstance() {
        if (singletonV2 == null) {
            singletonV2 = new SingletonV2();
        }
        return singletonV2;
    }
}
