package com.design.builder;

/**
 * 抽象的Builder -- 装CPU、内存条、硬盘等抽象的步骤
 */
public interface ComputerConfigBuilder {

    ComputerConfigBuilder appendCPU();

    ComputerConfigBuilder appendMemory();

    ComputerConfigBuilder appendHardDisk();

    ComputerConfigBuilder appendKeyBoard();

    ComputerConfigBuilder appendMouse();

    Computer getComputer();

}
