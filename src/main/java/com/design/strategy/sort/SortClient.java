package com.design.strategy.sort;

public class SortClient {
    public static void main(String[] args) {
        Cat[] cats = {new Cat(2,1), new Cat(1,3),new Cat(3,2)};
        SorterContent<Cat> sortWeight = new SorterContent<>(new CatWeightComparator());
        sortWeight.sort(cats);
        System.out.println("根据重量升序：");
        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i]);
        }
        System.out.println("根据高度降序：");
        SorterContent<Cat> sortHeight = new SorterContent<>(new CatHeightComparator());
        sortHeight.sort(cats);
        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i]);
        }
    }
}
