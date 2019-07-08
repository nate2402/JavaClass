package org.dimigo.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;

public class BasicException {
    public static void main(String[] args) {
        try {
            uncheckedException(null);
            checkedException();
            String id = null;
            validate(id);
        } catch(Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }


    //Exception 객체 만들기
//    private static void validate(String id) {
//        try {
//            if (id == null || "".equals(id)) {
//                // 예외 발생
//
//                Exception e = new Exception("ID를 입력하세요"); // 괄호 안에는 사용자에게 표시할 메세지를 입력함
//                throw e;
//            }
//
//            if (id.length() < 8) {
//                throw new Exception("8자리 이상 입력하세요");
//            }
//        } catch (Exception e) {
//            System.out.println(e.getMessage()); //throw 값을 가져옴
//            throw e // 오류를 처리하고 다시 호출부로 오류를 던지기
//        }
//
//    }



    // 자체적으로 오류에서 처리하는 방법
    // -------------|or|-------------
    // 호출부로 오류를 위임시키는 방법



    private static void validate(String id) throws Exception {

        if (id == null || "".equals(id)) {
            // 예외 발생

            Exception e = new Exception("ID를 입력하세요"); // 괄호 안에는 사용자에게 표시할 메세지를 입력함
            throw e;
        }

        if (id.length() < 8) {
            throw new Exception("8자리 이상 입력하세요");
        }

    }

    //컴파일러가 강제적으로 예외처리를 요구하지 않음 --> 꼼꼼히 신경써서 설계해야함!
    private static void uncheckedException(String s) {
        try {
            //try 안에 오류 발생 가능한 문장 넣기
            System.out.println(s.length()); //NullPointException!!
            // new NullPointerException()을 만들어 NullPointException 처리 --> 예외 처리
            System.out.println(Integer.parseInt("123a")); //NumberFormatException!!
        } catch(NullPointerException npe) { //(받아주는 변수의 타입 || 설정할 변수)
            //NullPointerException npe = new NullPointerException();
            System.out.println("문자열을 입력하세요"); // --> 빨간 오류대신 문자열 호출
            npe.printStackTrace();
        } catch(NumberFormatException nfe) { // exception알 수 있을경우 그냥 그 에러 클래스를 사용함
            System.out.println("숫자를 입력하세요");
            nfe.printStackTrace();
        } catch (Exception e) { // 오류의 종류를 알 수 없을때는 단순히 모든 오류의 상위 클래스인 Exception을 사용함
            // Exception e = newClassCastException();
            System.out.println("알 수 없는 오류입니다.");
            //Exception은 모든 오류의 상위 클래스이기 때문에 가장 밑에 작성함 --> 맨 위에 작성하면 밑에 있는 코드들은 필요가 없어짐 (짜피 표시 안됨)
        }

    }

    //컴파일러가 무조건 예외처리를 요구함
    private static void checkedException() {
        try {
            //파일 읽어오기 예제
            BufferedReader br = new BufferedReader(
                    new FileReader("input.txt") // 파일이 없을 경우의 예외를 설정해야함 (컴파일러가 예외처리하라고 명령)
            );
            String str;
            while ( (str = br.readLine() ) != null ) {
                System.out.println(str);
            }
        } catch (FileNotFoundException fne) {
            System.out.println("파일이 존재하지 않습니다.");
        } catch (IOException ie) {
            System.out.println("파일 읽기 오류.");
        }


    }
}
