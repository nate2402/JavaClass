package org.dimigo.oop;

public class ArrayBasic {
    public static void main(String[] args) {
        //기본형 배열
        // int, float, double, byte, boolean, short, char, long
        // 나머지는 모두 참조형


        //int 타입 5개짜리 배열 만들고 출력


            int[] intArr = null;
            intArr = new int[5]; //기본값: 0
            // --> int[] intArr = new int[5];

            printArray(intArr);


        //double 타입 5개짜리 배열 만들고 출력

            double[] doubleArr = new double[5]; //기본값: 0.0
            printArray(doubleArr);


        //초기값 설정

            int[] intArr2 = {1, 2, 3, 4, 5};
            // --> int[] intArr2 = new int[] {1, 2, 3, 4, 5};
            printArray(intArr2);



        // 참조형 배열
        // String, Book, Car, StringBuilder, Scanner, Random... --> 모든 참조형 배열의 기본값: null (단, new를 통한 객체생성의 경우는 제외)

        String[] strArr = new String[3]; // 기본값: null
        printArray(strArr);

        strArr[0] = "중궈"; // "중궈"라는 값이 지정되고 그 지정된 값이 배열에 들어감
        strArr[1] = "기제";
        strArr[2] = "문학";
        printArray(strArr);

        String[] strArr2 = {"정진영", "기안84", "정민욱"};
        printArray(strArr2);

        //Book 타입 2개짜리 배열
        //Book 객체 생성 후 출력

        //1. 공간 만들기
        Book[] bookArr = new Book[2];

        //2. 데이터 담기
        bookArr[0] = new Book("미생", "윤태호", 100);
        bookArr[1] = new Book("자바의 신", "나자바", 200);

        //3.출력하기
        printArray(bookArr);


        //배열 생성 및 데이터 담기 동시에 진행하기
        Book[] bookArr2 = {
                new Book("미생", "윤태호", 100),
                new Book("자바의 신", "나자바", 200)
        };

        // ---or---

        Book[] bookArr3 = new Book[] {
                new Book("미생", "윤태호", 100),
                new Book("자바의 신", "나자바", 200)
        };


        //배열 사용시 주의사항
        int[] intArr4 = null;
        System.out.println(intArr4.length); //배열요소의 개수를 샐때는 '배열이름.length'를 사용


        //--> result: NullPointException


        intArr4 = new int[3];
        System.out.println(intArr4.length);

        //--> result: 3

        System.out.println(intArr4[3]);

        //--> result: ArrayIndexOutOfBoundsException ==> 배열의 범위를 벗어난 범위가 지정됨

        System.out.println(intArr4[intArr4.length-1]);


        String[] strArr3 = new String[3];
        System.out.println(strArr3[0]);

        //--> result: Null

        System.out.println(strArr3[0].length());

        //--> result: NullPointException ==> Null의 길이는 없음


        Book[] bookArr4 = new Book[3];
        System.out.println(bookArr4[0]);

        //--> result: NULL

        System.out.println(bookArr4[0].getTitle());

        //--> result: NullPointException ==> Book 객체의 공간만 존재할뿐 안에 데이터가 없음

        String[] arr;
//        System.out.println(arr); //지역변수는 초기화 후 사용해야 함
        arr = null;
//        arr = {"이유진", "윤효연", "정민욱"}; //컴파일 에러
        arr = new String[] {"이유진", "윤효연", "정민욱"}; // 컴파일 성공
    }

    private static void printArray(int[] intArr) {
        for(int value : intArr) {
            System.out.print(value + " | ");

        }
        System.out.println('\n');
    }

    //Overloading --> 같은 함수명이지만 다른 입력형태


    private static void printArray(double[] doubleArr) {
        for(double value : doubleArr) {
            System.out.print(value + " | ");
        }
        System.out.println('\n');
    }

    private static void printArray(String[] strArr) {
        for(String value : strArr) {
            System.out.print(value + " | ");
        }
        System.out.println('\n');
    }


    private static void printArray(Book[] bookArr) {
        for(Book value : bookArr) {
            System.out.println(value);
        }
        System.out.println('\n');
    }
}
