package com.mdm.design.strategy.sort;

/**
 * 高度比较器（具体策略角色）
 */
public class CatHeightComparator implements Comparator<Cat> {

    @Override
    public int compareTo(Cat t1, Cat t2) {
        if(t1.getHeight() > t2.getHeight()) {
            return -1;
        }else if(t1.getHeight() < t2.getHeight()) {
            return 1;
        }
        return 0;
    }
}
