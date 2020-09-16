package com.design.strategy.sort;

/**
 * 重量比较器（具体策略角色）
 */
public class CatWeightComparator implements Comparator<Cat> {

    @Override
    public int compareTo(Cat t1, Cat t2) {
        if(t1.getWeight() > t2.getWeight()) {
            return 1;
        }else if(t1.getWeight() < t2.getWeight()) {
            return -1;
        }
        return 0;
    }
}
