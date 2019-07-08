package org.dimigo.abstractclass;

public class BMWEngine extends Engine {

    @Override
    public void startEngine() {
        System.out.println("BMW 엔진 기동");
    }

    @Override
    public void stopEngine() {
        System.out.println("BMW 엔진 멈춤");
    }
}
