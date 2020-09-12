package com.design.templateMethod;

public abstract class HummerModel {
    protected boolean isAlarm() {
        return true;
    }

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
