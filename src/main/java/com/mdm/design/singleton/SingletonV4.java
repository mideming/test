package com.mdm.design.singleton;

/**
 * 优点: 一开始不用实例化、线程安全、
 * 缺点：存在线程不安全的情况
 */
public class SingletonV4 {

    private static SingletonV4 singletonV4;

    private SingletonV4() {
    }

    public static SingletonV4 getInstance() {
        if (singletonV4 == null) {// 1.减少没必要的同步等待
            synchronized (SingletonV4.class) {// 2.同步，线程安全
                if (singletonV4 == null) {// 3.过滤1和2之间并发进来的线程
                    singletonV4 = new SingletonV4();// 4.实例化对象
                }
            }
        }
        return singletonV4;
    }
}
