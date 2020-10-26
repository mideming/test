package com.mdm.design.templateMethod;

import lombok.Data;

/**
 * 抽象模板
 */
@Data
public abstract class CarModel {
    // 钩子
    private boolean isAlarm = true;

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    final void run() {
        this.start();
        this.engineBoom();
        if (this.isAlarm()) {
            this.alarm();
        }
        this.stop();
    }
}
