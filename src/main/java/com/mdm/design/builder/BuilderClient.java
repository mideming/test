package com.mdm.design.builder;

/**
 * 隐藏创建对象的建造过程 & 细节，使得用户在不知对象的建造过程 & 细节的情况下，就可直接创建复杂的对象
 */
public class BuilderClient {
    public static void main(String[] args) {
        Director lowDirector = new Director(new LowComputerConfigBuilder());
        lowDirector.buildComputer();
        Computer lowComputer = lowDirector.getComputer();
        System.out.println("低配电脑：" + lowComputer);
        System.out.println("---------我是分割线----------");
        Director highDirector = new Director(new HighComputerConfigBuilder());
        highDirector.buildComputer();
        Computer highComputer = highDirector.getComputer();
        System.out.println("高配电脑：" + highComputer);
    }
}
