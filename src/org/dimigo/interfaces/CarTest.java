package org.dimigo.interfaces;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car(new BenzIEngine());
        car.start();
        car.stop();
        System.out.println("==엔진 교체==");
        car.setIEngine(new BMWIEngine());
        car.start();
        car.stop();
    }
}
