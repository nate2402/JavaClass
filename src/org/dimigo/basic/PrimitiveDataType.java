package org.dimigo.basic;

import java.sql.SQLOutput;

public class PrimitiveDataType {

    static boolean flag;
    // 전역변수로 설정되어있으면 default 값 설정가능 (false)

    public static void main(String[] args) { //Static method에서는 static만 출력 가능
        //1-1. 논리형 데이터 타입 (boolean)

        //flag가 참이면 참입니다, 거짓이면 거짓입니다 출력

        if (flag) { // If flag is true,
            System.out.println("참입니다!"); //print "참입니다!"
        } else {
            System.out.println("거짓입니다!");
        }

        //1-2. 삼항연산자로 작성
        System.out.println(flag ? "참입니다!" : "거짓입니다!");

        //2. 문자형
        char c1 = 'A';
        char c2 = 65;
        char c3 = '\u0041';

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        //문자열
        String name = "김화균";
        System.out.println("My name is " + name);


        //3. 정수형
        int i1 = 10;
        int i2 = 0b00001010; // 10을 이진수로 표현
        int i3 = 012; //8진수
        int i4 = 0x0A; //16진수

        System.out.printf("%d,%d,%d,%d\n", i1, i2, i3, i4); // printf에서 입력타입 숫자 -> %d , 문자 -> %c

        //byte 타입 (-128 ~ 127)
        byte b1 = -128;
        byte b2 = 127;
        System.out.println(b1);
        System.out.println(b2);



        //문제
        b1--;
        b2++;
        System.out.println(b1);
        System.out.println(b2);


        //정수의 범위
        System.out.println(Byte.MIN_VALUE + "~" + Byte.MAX_VALUE);



        //문제: 100억을 저장하려면? (0이 10개)
        long a = 10000000000L; //큰 숫자는 뒤에 L을 붙여 Long 임을 표시함


        //4. 실수형
        float f1 = 3.14f;
        double d1 = 3.14;
        double d1_1 = 3.14d;

        //높은 정밀도: double 사용

        float f2 = 0.12345678909876543211234567890f;
        double d2 = 0.12345678909876543211234567890;

        System.out.println(f2);
        System.out.println(d2);

        System.out.printf("%c, %d, %.2f, %s\n", 'A', 100, 12.34, "즐거운 자바");
    }
}
