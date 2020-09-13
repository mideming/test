package com.design.templateMethod;

public class Car1Model extends CarModel {
    @Override
    protected void start() {
        System.out.println("Car1启动");
    }

    @Override
    protected void stop() {
        System.out.println("Car1停止");
    }

    @Override
    protected void alarm() {
        System.out.println("Car1鸣笛");
    }

    @Override
    protected void engineBoom() {
        System.out.println("Car1引擎声");
    }

}
