package org.dimigo.interfaces;

public interface IAnimal {
    // 인터페이스 필드: 모두 상수로 인식함

    String FARM_NAME = "디미 동물농장"; // 상수처리됨!! --> public static final이 자동으로 붙음
    // = public static final String FARM_NAME

    // 인터페이스안의 메소드: 추상 메소드
//    void eat(); // 앞에 자동으로 public abstract가 설정됨
//    // = public abstract void eat();
//    void sleep();
    void bark();

    //static method
    static void welcome() {
        System.out.println(FARM_NAME + "에 오신 것을 환경합니다");
    }


    default void eat() { // default 를 붙임 --> abstract가 자동으로 붙지 않음 (단, public은 자동으로 붙음)
        System.out.println("냠냠");
    }

    default void sleep() {
        System.out.println("쿨쿨");
    }
}
