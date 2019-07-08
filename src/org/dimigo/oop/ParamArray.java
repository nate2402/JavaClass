package org.dimigo.oop;

public class ParamArray {
    public static void main(String[] args) {
        int[] intArr= {1, 2, 3, 4, 5};

        //static 매소드끼리는 별도 선언 필요없이 호출가능!

        add(intArr, 10);   //intArr = {11, 12, 13,  14, 15};
        printArray(intArr);


        //===============


        String[] strArr = {"홍길동", "홍길석", "홍길남" , "홍길복"};
        changeName(strArr, "김"); //홍씨 --> 김씨
        printArray(strArr);
    }

    private static void printArray(int[] intArr) {
//        for(int i = 0; i < intArr.length; i++) {
//            System.out.println(intArr[i]);
//        }

        //or

        //for each

        for(int value : intArr) {
            System.out.print(value + " | ");
        }
        System.out.println();
    }

    private static void printArray(String[] strArr) {
//        for(int i = 0; i < intArr.length; i++) {
//            System.out.println(intArr[i]);
//        }

        //or

        //for each

        for(String value : strArr) {
            System.out.print(value + " | ");
        }
        System.out.println();
    }

    private static void add(int[] intArr, int num) {
        for(int i = 0; i < intArr.length; i++) {
            intArr[i] = intArr[i] + num;
            // => intArr[i] += num;
        }

        //or

//        for(int value : intArr) {
//            //...
//        }
    }

    public static void changeName (String[] strArr, String familyName) {
        for (int i = 0; i < strArr.length; i++) {
            //case1. 일부분 자르기
            strArr[i] = familyName + strArr[i].substring(1);

            //-----or-----

            // strArr[i] = strArr[i].replace("홍", "김");
        }
    }
}
