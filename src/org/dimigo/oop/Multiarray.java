package org.dimigo.oop;

public class Multiarray {
    //C & JAVA 배열비교

        //1. 1차원 배열
            //C: int a[3] = {0}; --> 가로로 3개의 0으로 구성된 배열 생성 (순서대로 0,1,2번째 값으로 할당)
            //JAVA: int[] a = new int[3]; --> 가로로 3개의 공집합(?)으로 구성된 배열 생성 (순서대로 0,1,2번째 값으로 할당)

        //2. 2차원 배열
            //1차원 배열을 배열로 가진것
            //C: int a[2][3]; --> 3*2로 만들어진 a라는 배열을 생성 (좌측상단 첫번째칸: [0][0], 우착하단 마지막칸: [1][2] --> 세로기준 배열값 먼저 입력, 가로기준 배열값 나중에 입력) ==> 연속된 공간
            //C에서 int a[][]형식의 2차원 배열에서 첫번째 대괄호값 (=배열의 행값)은 생략 가능. 두번째 대괄호값 (=배열의 열값)은 생략 불가능

            //JAVA: int[][] a = new int[2][3]; --> 2칸짜리 배열을 먼저 만든 후 그 안에 3칸짜리 배열을 다시 만들어 주소값을 넣어놓는 방식 (1차원 배열이 또 다른 1차원 배열을 만드는 방식) --> 연속된 공간 X
            //JAVA: int[][] a = new int [2][]; --> int[3]짜리 일차원 배열이 생성됨
            // --> 뒤에 대괄호를 생략하고 밑에서 a[0] = new int[2]; & a[1] = new int[3]; 과 같이 다른 형태의 1차원 배열을 만들어 넣을 수 있음.
            //JAVA: int[][] a = new int [][3]; --> 컴파일 에러 발생 (몇개짜리 배열울 만들지 확인할 수 없음)


    public static void main(String[] args) {
        //int 타입 2차원 배열

        int[][] intArr = new int[2][3];
        //2칸짜리 1차원배열 생성후 그 안에 3칸짜리 1차원배열 2개를 만들어 주소값을 넣음
        printArray(intArr);

        intArr[0][1] = 100;
        intArr[1][2] = 90;

        //String 타입 이차원 배열
        String[][] strArr = new String[2][]; //{null, null}
        strArr[0] = new String[3]; // {{null, null, null}, null}
        strArr[1] = new String[2]; // {{null, null, null}, {null, null}}

        strArr[0][0] = "C";
        strArr[0][1] = "C++";
        strArr[0][2] = "JAVA";
        strArr[1][0] = "C#";
        strArr[1][1] = "python";

        printArray(strArr);

        //배열 생성과 동시에 초기화
        String[][] strArr2 = {
                { "C", "C++", "JAVA" },
                { "C#", "Python" }
        };

        String[][] strArr3 = new String[][] {
                { "C", "C++", "JAVA" },
                { "C#", "Python" }
        };

        String[][] strArr4 = new String[][] {
                new String[] { "C", "C++", "JAVA" },
                new String[] { "C#", "Python" }
        };

        String[][] strArr5 = {
                new String[] { "C", "C++", "JAVA" },
                new String[] { "C#", "Python" }
        };
    }

    private static void printArray(int[][] intArr) {


        //for


        /*
        for(int i=0; i<intArr.length; i++) {
            for(int j=0; j<intArr[i].length; j++) {
                System.out.print(intArr[i][j] + " | ");
            }
        }

        */


        //-- or --


        //for each


        //intArr의 배열수-1을 한 값을 int[]로 생성
        for (int[] arr : intArr) {
            for(int value : arr) {
                System.out.print(value + " | ");
            }
            System.out.println();
        }

    }

    public static void printArray(String[][] strArr) {
        for (String[] arr : strArr) {
            for(String value : arr) {
                System.out.print(value + " | ");
            }
            System.out.println();
        }
    }
}
