package com.design.adapter.objectAdapter;

/**
 * 对象适配器：通过引用父类的对象获得父类的能力
 */
public class PowerObjectAdapter implements ThreePower {
    private TwoPower twoPower;

    public PowerObjectAdapter(TwoPower twoPower) {
        this.twoPower = twoPower;
    }

    @Override
    public void powerByThree() {
        this.twoPower.powerByTwo();
    }
}
