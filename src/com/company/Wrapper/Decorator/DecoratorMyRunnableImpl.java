package com.company.Wrapper.Decorator;

public class DecoratorMyRunnableImpl implements Runnable {
    private Runnable component;
    public DecoratorMyRunnableImpl(Runnable component) {
        this.component = component;
    }

    @Override
    public void run() {
        System.out.print("DecoratorMyRunnableImpl body ");
        component.run();
    }
}
