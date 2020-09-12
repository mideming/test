package com.design.builder;

import lombok.Data;
import lombok.ToString;

/**
 * 要建造的产品Product -- 组装的电脑
 */
@Data
@ToString
public class Computer {
    private String CPU;
    private String memory;
    private String hardDisk;
    private String keyBoard;
    private String mouse;
}
