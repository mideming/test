package com.mdm.design.builder;

/**
 * 使用者Director
 */
public class Director {
    private ComputerConfigBuilder computerConfigBuilder;

    public Director(ComputerConfigBuilder computerConfigBuilder) {
        this.computerConfigBuilder = computerConfigBuilder;
    }

    public void buildComputer() {
        computerConfigBuilder.appendCPU()
                .appendMemory()
                .appendHardDisk()
                .appendKeyBoard()
                .appendMouse();
    }

    public Computer getComputer() {
        return computerConfigBuilder.getComputer();
    }
}
