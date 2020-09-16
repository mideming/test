package com.design.adapter.objectAdapter;

/**
 * 对象适配器：通过引用父类的对象获得父类的能力
 */
public class PowerObjectAdapter implements Power110 {
    private Power220 power220;

    public PowerObjectAdapter(Power220 power220) {
        this.power220 = power220;
    }

    @Override
    public void powerBy110() {
        this.power220.powerBy220();
    }
}
