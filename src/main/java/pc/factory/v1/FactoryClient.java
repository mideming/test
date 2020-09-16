package pc.factory.v1;

/**
 * 简单工厂模式:专门定义一个工厂类用来负责创建其他产品的实例，被创建的实例一般都属于同一个产品
 * 缺点：后续想继续添加产品（联想鼠标），需要修改工厂类，违背了开闭原则
 */
public class FactoryClient {
    public static void main(String[] args) {
        Mouse dell = MouseFactory.getMouse("Dell");
        dell.run();
        Mouse hp = MouseFactory.getMouse("HP");
        hp.run();
    }
}
