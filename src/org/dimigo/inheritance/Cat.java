package org.dimigo.inheritance;

public class Cat extends Animal {
    public Cat (String name) {
        super(name);
    }

    //부모 클래스 정보 재정의 --> 메소드 오버라이딩 (method overriding) (오버로드 아님)


    public void bark() {
        System.out.println("야옹");
    }

    public void scratch() {
        System.out.println(name + "이/가 할큅니다.");
    }
}
