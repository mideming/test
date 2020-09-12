package com.design.adapter.classAdapter;

public class MacBook {
    private ThreePower threePower;

    public MacBook(ThreePower threePower) {
        this.threePower = threePower;
    }

    public void recharge() {
        threePower.powerByThree();
    }
}
