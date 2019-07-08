package org.dimigo.inheritance;

public class Dog extends Animal {
    //error 해결법

    //1. 명시적으로 부모의 것을 호출

    public Dog(String name) {
        super(name);
    }

    //2. 부모에 기본생성자 호출 --> 여기에서는 1번으로 해결


    public void catchBall() {
        System.out.println(name + "이/가 공을 물어 옵니다.");
    }

}
