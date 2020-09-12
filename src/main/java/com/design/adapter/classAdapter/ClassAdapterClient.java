package com.design.adapter.classAdapter;

/**
 * 类适配器：通过继承父类获得父类的能力
 */
public class ClassAdapterClient {
    public static void main(String[] args) {
        ThreePower threePower = new PowerClassAdapter();
        MacBook macBook = new MacBook(threePower);
        macBook.recharge();
    }
}
