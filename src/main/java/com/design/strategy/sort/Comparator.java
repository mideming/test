package com.design.strategy.sort;

/**
 * 比较器接口（抽象策略角色）
 * @param <T>
 */
public interface Comparator<T> {
    int compareTo(T t1,T t2);
}
