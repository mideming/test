package com.design.templateMethod;

/**
 * 具体模板
 */
public class Car2Model extends CarModel {
    @Override
    protected void start() {
        System.out.println("Car2启动");
    }

    @Override
    protected void stop() {
        System.out.println("Car2停止");
    }

    @Override
    protected void alarm() {
        System.out.println("Car2鸣笛");
    }

    @Override
    protected void engineBoom() {
        System.out.println("Car2引擎声");
    }
}
