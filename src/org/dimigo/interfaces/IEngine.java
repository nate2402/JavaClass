package org.dimigo.interfaces;

public interface IEngine {
    //추상메소드 선언 --> 상속받은 클래스에서 overriding을 강제화
    public abstract void startEngine();
    public abstract void stopEngine();
}
