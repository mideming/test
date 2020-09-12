package com.design.strategy.sort;

public class Sorter<T> {
    public void sort(T[] arr, Comparator<T> comparator) {
        for(int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for(int j = i + 1; j < arr.length; j++) {
                minIndex = comparator.compareTo(arr[j], arr[minIndex]) == -1 ? j : minIndex;
            }
            T temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
//        int[] arr = {1,3,2,9,5,7,4};
        Cat[] cats = {new Cat(2,2), new Cat(1,1),new Cat(3,3)};
        Sorter<Cat> sort = new Sorter<>();
        sort.sort(cats, new CatWeightComparator());
        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i]);
        }
    }
}
