package com.design.templateMethod;

public class HummerClient {
    public static void main(String[] args) {
        HummerH1Model hummerH1Model = new HummerH1Model();
        hummerH1Model.run();
        HummerH2Model hummerH2Model = new HummerH2Model();
        hummerH2Model.setAlarm(true);
        hummerH2Model.run();
    }
}
