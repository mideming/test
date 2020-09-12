package com.design.adapter.objectAdapter;

/**
 * 对象适配器：通过引用父类的对象获得父类的能力
 */
public class ObjectAdapterClient {
    public static void main(String[] args) {
        TwoPower twoPower = new TwoPower();
        ThreePower threePower = new PowerObjectAdapter(twoPower);
        MacBook macBook = new MacBook(threePower);
        macBook.recharge();
    }
}
