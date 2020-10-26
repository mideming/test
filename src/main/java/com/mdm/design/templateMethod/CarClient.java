package com.mdm.design.templateMethod;

public class CarClient {
    public static void main(String[] args) {
        Car1Model car1Model = new Car1Model();
        car1Model.run();

        Car2Model car2Model = new Car2Model();
        // 子类可以决定是否执行方法
        car2Model.setAlarm(false);
        car2Model.run();
    }
}
