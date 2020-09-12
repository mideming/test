package com.design.singleton;

/**
 * 优点: 一开始不用实例化、线程安全
 * 一个类的静态属性只会在第一次加载类时初始化，这是JVM帮我们保证的，所以我们无需担心并发访问的问题。
 * 并且JVM会帮我们强行同步这个过程，所以在初始化进行一半的时候，别的线程是无法使用的。另外由于静态变量只初始化一次，所以INSTANCE仍然是单例的。
 */
public class SingletonV5 {
    private SingletonV5() {
    }

    private static class SingletonL4Inner {
        public static final SingletonV5 INSTANCE = new SingletonV5();
    }

    public static SingletonV5 getInstance() {
        return SingletonL4Inner.INSTANCE;
    }
}
