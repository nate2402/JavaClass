package org.dimigo.oop;

public class Calculator2 {
    /**** 정적 (static) 필드 ****/
    public static double PI = 3.141592;


    //powerflag: 인스턴스 필드 --> 계산기 객체마다 다른 powerflag를 가지기 때문에 꼭 인스턴스 필드를 사용해야 함
    private boolean powerflag; //false



    public void powerOn() {
//        System.out.println(this);
        if (powerflag == false) {
            System.out.println("전원을 켭니다");
            powerflag = true;
        }

    }

    public void powerOff() {
        if (powerflag == true) {
            System.out.println("전원을 끕니다");
            powerflag = false;
        }
    }

    public static int add(int num1, int num2, Calculator2 c) {

        //정적 필드: num1 & num2를 바로 불러올 수 없음 --> this 사용 불가 --> 불러와야함
        //정적 필드 안에서 인스턴스 메소드를 사용하기 위해 인스턴스 메소드를 같이 불러옴

        c.powerOn();
        return num1 + num2;
    }

    public static int sub(int num1, int num2, Calculator2 c) {
        c.powerOn();
        return num1 - num2;
    }

    public static int mul(int num1, int num2, Calculator2 c) {
        c.powerOn();
        return num1 * num2;
    }

    public static double div(int num1, int num2, Calculator2 c) {
        c.powerOn();
        return (double)num1 / num2;
    }


    public static void main(String[] args) {
        Calculator2 c = new Calculator2();
        c.powerOn(); //static에서 호출함 --> 객체를 만들어 호출해야함!


    }

    /*
    public static void main(String[] args) {

        int a = 10, b = 20;

        Calculator2 c = new Calculator2();
        //Calculator2안에 있는 static 메소드를 먼저 확인하여 메모리에 먼저 올림

        Calculator2 c2 = new Calculator2();


        c.powerOn();

//      같은 코드 안에서 불러올때: Calculator2를 빼도 작동함!

//      System.out.println(Calculator2.PI);
        System.out.printf("%d + %d = %d\n", a, b, Calculator2.add(a, b, c));
        System.out.printf("%d - %d = %d\n", a, b, Calculator2.sub(a ,b, c));
        System.out.printf("%d * %d = %d\n", a, b, Calculator2.mul(a, b, c));
        System.out.printf("%d / %d = %.1f\n", a, b, Calculator2.div(a, b, c));

        c.powerOff();

    }

    */
}
