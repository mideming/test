package com.design.strategy.sort;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Cat{
    private int weight;
    private int height;

    public Cat(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }
}
