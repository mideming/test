package com.design.adapter.objectAdapter;

/**
 * 对象适配器：通过引用需要适配的对象获得该对象的能力
 */
public class ObjectAdapterClient {
    public static void main(String[] args) {
        Power110 power110 = new PowerObjectAdapter(new Power220());
        MacBook macBook = new MacBook(power110);
        macBook.recharge();
    }
}
