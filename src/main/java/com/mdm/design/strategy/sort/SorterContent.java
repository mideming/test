package com.mdm.design.strategy.sort;

/**
 * 环境角色：持有抽象策略角色的引用
 */
public class SorterContent<T> {
    private Comparator<T> comparator;

    public SorterContent(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    public void sort(T[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for(int j = i + 1; j < arr.length; j++) {
                minIndex = this.comparator.compareTo(arr[j], arr[minIndex]) == -1 ? j : minIndex;
            }
            T temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

}
