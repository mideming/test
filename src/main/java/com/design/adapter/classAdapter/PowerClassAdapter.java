package com.design.adapter.classAdapter;

/**
 * 类适配器：通过继承父类获得父类的能力
 */
public class PowerClassAdapter extends TwoPower implements ThreePower {
    @Override
    public void powerByThree() {
        super.powerByTwo();
    }
}
