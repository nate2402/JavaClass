package org.dimigo.oop;

public class CalculatorTest {
    public static void main(String[] args) {

        int a = 10, b = 20;

        //인스턴스 메소드--> 객체를 먼저 만들어야 호출 가능

        Calculator c = new Calculator(a, b); //레퍼런스 변수명: c


        //모든 인스턴스 메소드는 객체를 먼저 만들고 '레퍼런스 변수명. 메소드명'으로 사용을 해야함

        c.powerOn();

        System.out.printf("%d + %d = %d\n", a, b, c.add());
        System.out.printf("%d - %d = %d\n", a, b, c.sub());
        System.out.printf("%d * %d = %d\n", a, b, c.mul());
        System.out.printf("%d / %d = %.1f\n", a, b, c.div());

        c.powerOff();

    }
}
