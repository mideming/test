package com.design.builder;

/**
 * Builder的具体实现ConcreteBuilder
 */
public class HighComputerConfigBuilder implements ComputerConfigBuilder {
    private Computer computer;
    public HighComputerConfigBuilder() {
        this.computer = new Computer();
    }
    @Override
    public HighComputerConfigBuilder appendCPU() {
        computer.setCPU("i7");
        return this;
    }

    @Override
    public HighComputerConfigBuilder appendMemory() {
        computer.setMemory("16G");
        return this;
    }

    @Override
    public HighComputerConfigBuilder appendHardDisk() {
        computer.setHardDisk("1T");
        return this;
    }

    @Override
    public HighComputerConfigBuilder appendKeyBoard() {
        computer.setKeyBoard("机械键盘");
        return this;
    }

    @Override
    public HighComputerConfigBuilder appendMouse() {
        computer.setMouse("无线鼠标");
        return this;
    }

    @Override
    public Computer getComputer() {
        return this.computer;
    }
}
