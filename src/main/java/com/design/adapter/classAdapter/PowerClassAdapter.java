package com.design.adapter.classAdapter;

/**
 * 类适配器：通过继承父类获得父类的能力
 */
public class PowerClassAdapter extends Power220 implements Power110 {
    @Override
    public void powerBy110() {
        super.powerBy220();
    }
}
