package com.company.Wrapper.Decorator;

public class DecoratorRunnableImpl implements Runnable {
    private Runnable component;
    public DecoratorRunnableImpl(Runnable component) {
        this.component = component;
    }
    @Override
    public void run() {
        System.out.print("DecoratorRunnableImpl body ");
        component.run();
    }
}
