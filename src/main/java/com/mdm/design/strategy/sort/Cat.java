package com.mdm.design.strategy.sort;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Cat{
    /**
     * 体重
     */
    private int weight;
    /**
     * 身高
     */
    private int height;

    public Cat(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }
}
