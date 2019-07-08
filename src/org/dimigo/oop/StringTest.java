package org.dimigo.oop;

public class StringTest {
    public static void main(String[] args) {
        //1. 문자열 리터럴 방식

        String dog1 = "설기";
        String dog2 = "설기";

        System.out.println(dog1 == dog2); //true


        //2. new 객체 생성 방식

        String cat1 = new String("야옹이");
        String cat2 = new String("야옹이");

        System.out.println(cat1 == cat2); //false


        //Question
        System.out.println(dog1 == "설기"); //true
        System.out.println(cat1 == "야옹이"); //false

        // 문자열 비교시 --> equals

        System.out.println(dog1.equals("설기")); //true (대소문자까지 완벽히 같도록 비교)
        System.out.println(dog1.equalsIgnoreCase("설기")); //true (대소문자상관 없음)

        System.out.println(cat1.equals(cat2)); //true


        //로그인 기능 예제

        String id = "Admin";

        //id: "admin" --> :"관리자"출력
        //아니면 "일반사용자 출력"

        if ("admin".equalsIgnoreCase(id)) { //반대로 작성하면 null을 대비하여 추가적이 코드 작성할 필요 없음
            System.out.println("관리자");
        } else {
            System.out.println("일반사용자");
        }

        testString();

    }

    private static void testString() {
        //          01234567890123
        String s = "abcdefgABCDEFG";

        System.out.println(s.length()); //result: 14
        System.out.println(s.substring(3)); //result: defgABCDEFG
        System.out.println(s.substring(3,6)); //result: def --> 출력하려는 문자개수를 시작 index에 더하여 범위 index를 지정함
        System.out.println(s.indexOf("C")); //index 물어보기 (동일문자 존재할 경우 첫번째 문자를 기준으로 위치를 알려줌) result: 9
        System.out.println(s.charAt(7)); // result: A
        System.out.println(s.concat("ABC")); //result: abcdefgABCDEFGABC --> 새로운 문자열이기 때문에 새롭게 Heap에 생성됨 (재사용 X)
        System.out.println("              ABCD             ".trim()); //result: ABCD --> trim: 앞뒤의 공백을 모두 제거해줌
        System.out.println(s.toUpperCase()); //대문자 변환 --> result:ABCDEFGABCDEFG
        System.out.println(s.toLowerCase()); //소문자 변환 --> result:abcdefgabcdefg
        System.out.println(s.replace('a', 'A')); //문자 변경
        System.out.println(s.startsWith("abc")); //시작문자 비교 --> result: true
        System.out.println(s.endsWith("EFG")); //끝나는 문자 비교 --> result: true

        //**문자열 비교할때는 null체크를 먼저 하거나 null이 아닌 문자열을 먼저 작성하여 nullpointexception을 막는다!!!**

        //ex



    }
}
