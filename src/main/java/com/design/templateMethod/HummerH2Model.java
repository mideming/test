package com.design.templateMethod;

public class HummerH2Model extends HummerModel {
    private boolean isAlarm;

    public void setAlarm(boolean isAlarm) {
        this.isAlarm = isAlarm;
    }

    protected boolean isAlarm() {
        return this.isAlarm;
    }

    @Override
    protected void start() {
        System.out.println("H2启动");
    }

    @Override
    protected void stop() {
        System.out.println("H2停止");
    }

    @Override
    protected void alarm() {
        System.out.println("H2鸣笛");
    }

    @Override
    protected void engineBoom() {
        System.out.println("H2引擎声");
    }
}
