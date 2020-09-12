package com.design.factory.v3;

/**
 * 具体产品
 */
public class HPKeyBoard implements KeyBoard {
    @Override
    public void run() {
        System.out.println("HPKeyBoard");
    }
}
