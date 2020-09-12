package com.design.templateMethod;

public class HummerH1Model extends HummerModel {
    @Override
    protected void start() {
        System.out.println("H1启动");
    }

    @Override
    protected void stop() {
        System.out.println("H1停止");
    }

    @Override
    protected void alarm() {
        System.out.println("H1鸣笛");
    }

    @Override
    protected void engineBoom() {
        System.out.println("H1引擎声");
    }

}
