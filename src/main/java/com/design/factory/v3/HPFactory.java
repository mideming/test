package com.design.factory.v3;

/**
 * 具体工厂
 */
public class HPFactory implements PcFactory {
    @Override
    public Mouse createMouse() {
        return new HPMouse();
    }

    @Override
    public KeyBoard createKeyBoard() {
        return new HPKeyBoard();
    }
}
