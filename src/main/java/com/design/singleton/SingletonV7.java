package com.design.singleton;

/**
 * 可以防止反射和序列化破环单例
 * 反射：JDK反射机制内部完全禁止了用反射创建枚举实例的可能性
 * 序列化：ObjectInputStream类中，对枚举类型有一个专门的readEnum()方法来处理，这种处理方法与readResolve()方法大同小异，
 *      都是以绕过反射直接获取单例为目标。不同的是，枚举对序列化的防御仍然是JDK内部实现的。
 */
public enum SingletonV7 {
    INSTANCE;

    public static SingletonV7 getInstance() {
        return SingletonV7.INSTANCE;
    }
}
