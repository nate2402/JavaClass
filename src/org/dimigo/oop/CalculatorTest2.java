package org.dimigo.oop;

public class CalculatorTest2 {
    public static void main(String[] args) {

        int a = 10, b = 20;

        Calculator2 c = new Calculator2();
        Calculator2 c2 = new Calculator2();
        Calculator2 c3 = new Calculator2();
        c.PI = 3.14; //--> 아래의 모든 c,c2,c3에 3.14가 출력됨 ==> 정적 필드이기 때문에 1개의 공간을 공유하여 불러옴 ==> c,c2,c3중 1개만 수정해도 모든 곳에 정보변경사항이 반영이됨.


        //static: class당 1개 생성

        //인스턴스: 객체당 1개 생성

        //정적호출 정석
        System.out.println(Calculator2.PI);

        //객체로 불러오기
        System.out.println(c.PI);
        System.out.println(c2.PI);
        System.out.println(c3.PI);
        //정적필드를 불러옴! --> static매소드는 먼저 올라가있기 때문에 불러올 수 있음


        c.powerOn();

//        System.out.println(Calculator2.PI);
        System.out.printf("%d + %d = %d\n", a, b, Calculator2.add(a, b, c));
        System.out.printf("%d - %d = %d\n", a, b, Calculator2.sub(a ,b, c));
        System.out.printf("%d * %d = %d\n", a, b, Calculator2.mul(a, b, c));
        System.out.printf("%d / %d = %.1f\n", a, b, Calculator2.div(a, b, c));

        c.powerOff();

    }
}
