package org.dimigo.abstractclass;

public abstract class Animal { // new Animal ban
    public void eat() {
        System.out.println("냠냠");
    }
    public abstract void bark();


    //추상 메소드를 포함한 class는 일반 메소드일 수 없음.
    // --> 추상 메소드를 1개 이상 포함하고 있을 경우 무조건 해달 class는 abstract이어야 함.
}
