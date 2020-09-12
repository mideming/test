package com.design.singleton;

/**
 * 优点: 一开始不用实例化、线程安全、
 * 缺点：基本上没缺点，除了第一次实例化的时候可能会线程阻塞。
 */
public class SingletonV4 {
    /**
     * 这里为何要加volatile？
     * 因为在第四步实例化对象时，会有以下三个步骤：
     * 1.分配内存空间 memory=allocate()
     * 2.初始化对象 ctorInstance()
     * 3.设置singleton指向刚分配的内存空间 singleton=memory
     * 当线程A在执行上面的流程时，2和3可能会发生重排序，因为重排序不影响结果，还可以提升性能，所以JVM是允许的。如果此时发生了重排序，1->2->3变成1—>3->2
     * 线程A在执行到第3步后，线程B调用getInstance()方法，判断singletonV4!=null，判断singletonV4，此时singletonV4还没初始化完毕，线程B访问的是一个
     * 还没初始化完毕的对象。volatile可以禁止指令重排保证线程安全
     */
    private static volatile SingletonV4 singletonV4;

    private SingletonV4() {
    }

    public static SingletonV4 getInstance() {
        if (singletonV4 == null) {// 1.减少没必要的同步等待
            synchronized (SingletonV4.class) {// 2.同步，线程安全
                if (singletonV4 == null) {// 3.过滤1和2之间的线程
                    singletonV4 = new SingletonV4();// 4.实例化对象
                }
            }
        }
        return singletonV4;
    }
}
