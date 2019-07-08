package org.dimigo.interfaces;

public class Car  {
    private IEngine IEngine; // abstract: new로 객체를 설정하지 못할뿐, 타입으로는 사용 가능!

    //constructor
    public Car(IEngine IEngine) {
        this.IEngine = IEngine;
    }

    //setter
    public void setIEngine(IEngine IEngine) {
        this.IEngine = IEngine;
    }

    public void start() {
        IEngine.startEngine();
    }

    public void stop() {
        IEngine.stopEngine();
    }
}
