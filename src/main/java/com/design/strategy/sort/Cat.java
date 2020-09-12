package com.design.strategy.sort;

public class Cat implements Comparable<Cat>{
    private int weight;
    private int height;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Cat(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public Cat(){}

    @Override
    public int compareTo(Cat c) {
        if(this.weight < c.weight) {
            return -1;
        }else if(this.weight > c.weight) {
            return 1;
        }else{
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
