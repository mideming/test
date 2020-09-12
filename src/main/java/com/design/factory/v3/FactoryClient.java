package com.design.factory.v3;

/**
 * 抽象工厂：提供一个创建一系列相关对象的接口，而无需指定他们具体的类
 * 优点：1.可以在类的内部对产品族中相关联的多等级产品共同管理，而不必专门引入多个新的类来进行管理。
 *     2.当增加一个新的产品族时不需要修改原代码，满足开闭原则。
 */
public class FactoryClient {
    public static void main(String[] args) {
        PcFactory dellFactory = new DellFactory();
        Mouse dellMouse = dellFactory.createMouse();
        dellMouse.run();
        KeyBoard dellKeyBoard = dellFactory.createKeyBoard();
        dellKeyBoard.run();
        PcFactory hpFactory = new HPFactory();
        Mouse hpMouse = hpFactory.createMouse();
        hpMouse.run();
        KeyBoard hpKeyBoard = hpFactory.createKeyBoard();
        hpKeyBoard.run();
    }
}
