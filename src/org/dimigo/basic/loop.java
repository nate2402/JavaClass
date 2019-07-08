package org.dimigo.basic;

import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        // 1. for문
        // 구구단 출력하기

        for (int i = 2; i <= 9; i++) {
            for (int a = 1; a <= 9; a++) {
                System.out.printf("%d * %d = %d\t", i, a, i*a);
            }
            System.out.println("\n");
        }


        // 2. for-each
        int[] arr = {1, 2, 3, 4, 5};


        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }


//        ----or----


        for(int value : arr) {
            System.out.println(value);
        }


        // BTS 멤버 출력
        String[] bts = {"a","b","c"};

        //for-each 문으로 멤버 출력

        for(String value : bts) {
            System.out.println(value);
        }


        // 3. while, do~while
        // 메뉴 처리

        Scanner scanner = new Scanner(System.in);
        int menu = 0;

        do {
            System.out.println("<< 아이돌 선택 >>");
            System.out.println("1. BTS");
            System.out.println("2. 레드벨벳");
            System.out.println("3. 여자친구");
            System.out.println("9. 종료");
            System.out.print("메뉴 입력 => ");

            menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("BTS SELECTED");
                    return;
                case 2:
                    System.out.println("REDVELEVET SELECTED");
                    return;
                case 3:
                    System.out.println("GFRIEND SELECTED ");
                    return;
                case 9:
                    System.out.println("BYE");
                    return;
                default:
                    System.out.println("TRY AGAIN");
                    return;

            }
        } while(menu != 9);


    }
}
