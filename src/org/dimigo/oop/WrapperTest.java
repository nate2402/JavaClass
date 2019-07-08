package org.dimigo.oop;

import java.util.Arrays;

public class WrapperTest {
    public static void main(String[] args) {
        // Wrapper 클래스 : 기본자료형을 객체화시켜주는 클래스

        System.out.println(Integer.MIN_VALUE); //Integer중 최소값을 알고 싶을때 사용
        System.out.println(Integer.MAX_VALUE); //Integer중 최대값을 알고 싶을때 사용
        System.out.println(Integer.SIZE); //Integer크기
        System.out.println(Integer.toBinaryString(10)); //Integer값을 2진수로 변환
        System.out.println(Integer.toHexString(13)); //Integer값을  16진수로 변환

        // Boxing: 기본자료형 데이터 -> Wrapper 클래스 객체

        // 1. 생성자 이용

            Integer i1 = new Integer(100);
            Integer i2 = new Integer("100");

        System.out.println(i1 == i2); //--> 주소값 비교 --> 다른 값 (false)
        System.out.println(i1.equals(i2)); //--> 값 비교 --> 같음 (true)

        // valueOf() 이용
        Integer i3 = Integer.valueOf(100);
        Integer i4 = Integer.valueOf("100");
        Double d1 = Double.valueOf(3.14);



        // unboxing

        int i = i3.intValue(); //100
        double d = d1.doubleValue(); //3.14

        //문자열 -> 기본형 : parseXxx()
        int i5 = Integer.parseInt("200");
        // "3.14" -> double
        double d2 = Double.parseDouble("3.14");


        System.out.println(Arrays.toString(args)); //값: 모두 String

        // 100 + 200 = 300
//        String result = args[0] + args[1]; //100200

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.printf("%d + %d = %d\n", a, b, a+b);




        Integer n1 = new Integer(1000);
        Integer n2 = new Integer(2000);

        System.out.println(n1 + n2);



        Integer q3 = 5000; //AutoBoxing --> 자동으로 boxing을 해줌
        System.out.println(q3); //자동으로 unboxing을 해줌 ==> AutoUnboxing



        Integer obj = 1000; // Autoboxing
        int i6 = obj + 100; // Autounboxing


        // 총 몇번 autoboxing & autounboxing이 일어나는가?

        Integer n3 = 10;
        // autoboxing 1번
        Integer n4 = n3 + 20;
        // autoboxing 1번,     autounboxing 1번
        Integer result = n1 + n2;
        // autoboxing 1번    autounboxing 2번
    }
}
