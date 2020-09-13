package com.design.templateMethod;

public class CarClient {
    public static void main(String[] args) {
        Car1Model car1Model = new Car1Model();
        car1Model.run();
        Car2Model car2Model = new Car2Model();
        car2Model.setAlarm(false);
        car2Model.run();
    }
}
