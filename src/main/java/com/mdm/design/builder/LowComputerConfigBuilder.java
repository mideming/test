package com.mdm.design.builder;

/**
 * （低配电脑）Builder的具体实现ConcreteBuilder
 */
public class LowComputerConfigBuilder implements ComputerConfigBuilder {
    private Computer computer;
    public LowComputerConfigBuilder () {
        this.computer = new Computer();
    }
    @Override
    public LowComputerConfigBuilder appendCPU() {
        computer.setCPU("i5");
        return this;
    }

    @Override
    public LowComputerConfigBuilder appendMemory() {
        computer.setMemory("8G");
        return this;
    }

    @Override
    public LowComputerConfigBuilder appendHardDisk() {
        computer.setHardDisk("512G");
        return this;
    }

    @Override
    public LowComputerConfigBuilder appendKeyBoard() {
        computer.setKeyBoard("薄膜键盘");
        return this;
    }

    @Override
    public LowComputerConfigBuilder appendMouse() {
        computer.setMouse("有线鼠标");
        return this;
    }

    @Override
    public Computer getComputer() {
        return this.computer;
    }
}
