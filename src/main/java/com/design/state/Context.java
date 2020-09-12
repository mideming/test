package com.design.state;

public class Context {
    public final static OpenState openState = new OpenState();
    public final static CloseState closeState = new CloseState();
    public final static RunState runState = new RunState();
    public final static StopState stopState = new StopState();
    private LiftState liftState;

    public LiftState getLiftState() {
        return this.liftState;
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        this.liftState.setContext(this);
    }

    public void open() {
        this.liftState.open();
    }

    public void close() {
        this.liftState.close();
    }

    public void run() {
        this.liftState.run();
    }

    public void stop() {
        this.liftState.stop();
    }
}
