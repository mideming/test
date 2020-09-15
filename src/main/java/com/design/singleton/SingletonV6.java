package com.design.singleton;

/**
 * 优点: 一开始不用实例化、线程安全
 * Java静态内部类的特性：加载的时候不会加载内部静态类，使用的时候才会进行加载，而使用到的时候，类加载又是线程安全的。
 * 一个类的静态属性只会在第一次加载类时初始化，这是JVM帮我们保证的，所以我们无需担心并发访问的问题。
 * 并且JVM会帮我们强行同步这个过程，所以在初始化进行一半的时候，别的线程是无法使用的。
 */
public class SingletonV6 {
    private SingletonV6() {
    }

    private static class SingletonV6Inner {
        public static final SingletonV6 INSTANCE = new SingletonV6();
    }

    public static SingletonV6 getInstance() {
        return SingletonV6Inner.INSTANCE;
    }
}
