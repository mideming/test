package com.mdm.design.adapter.classAdapter;

/**
 * macbook需要110V充电
 */
public class MacBook {
    private Power110 power110;

    public MacBook(Power110 power110) {
        this.power110 = power110;
    }

    /**
     * 充电
     */
    public void recharge() {
        power110.powerBy110();
    }
}
