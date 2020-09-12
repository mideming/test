package com.design.state;

public class OpenState extends LiftState {
    @Override
    public void open() {
        System.out.println("电梯门打开");
    }

    @Override
    public void close() {
        super.context.setLiftState(Context.closeState);
        super.context.getLiftState().close();
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}
