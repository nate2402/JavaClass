package org.dimigo.abstractclass;

public class Car  {
    private Engine engine; // abstract: new로 객체를 설정하지 못할뿐, 타입으로는 사용 가능!

    //constructor
    public Car(Engine engine) {
        this.engine = engine;
    }

    //setter
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.startEngine();
    }

    public void stop() {
        engine.stopEngine();
    }
}
