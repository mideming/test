package pc.factory.v2;

/**
 * 工厂方法模式：定义一个用于创建对象的接口，让子类决定实例化哪一个产品
 * 优点：1.用户只需要知道具体工厂的名称就可得到所要的产品，无须知道产品的具体创建过程；
 *      2.在系统增加新的产品时只需要添加具体产品类和对应的具体工厂类，无须对原工厂进行任何修改，满足开闭原则；
 * 缺点：后续想要新增产品类型（键盘，耳机），或者新增品牌（联想，苹果），会发生类爆炸
 */
public class FactoryClient {
    public static void main(String[] args) {
        MouseFactory dellMouseFactory = new DellMouseFactory();
        Mouse dellMouse = dellMouseFactory.createMouse();
        dellMouse.run();
        MouseFactory hpMouseFactory = new HPMouseFactory();
        Mouse hpMouse = hpMouseFactory.createMouse();
        hpMouse.run();

    }
}
