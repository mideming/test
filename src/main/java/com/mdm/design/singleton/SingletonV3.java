package com.mdm.design.singleton;

/**
 * 优点:一开始不用创建实例、线程安全
 * 缺点：高并发下多线程会存在线程阻塞问题
 * 不推荐
 */
public class SingletonV3 {
    private static SingletonV3 singletonV3;

    private SingletonV3() {
    }

    public synchronized static SingletonV3 getInstance() {
        if (singletonV3 == null) {
            singletonV3 = new SingletonV3();
        }
        return singletonV3;
    }
}
