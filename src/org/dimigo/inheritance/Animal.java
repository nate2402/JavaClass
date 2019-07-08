package org.dimigo.inheritance;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("냠냠");
    }

    public void sleep() {
        System.out.println("쿨쿨");
    }

    public void bark() {
        System.out.println("멍멍");
    }

    public String toString() {
        return "제 이름은 " + name + "입니다.";
    }


    //getter

    public String getName() {
        return name;
    } //protected로 설정하면 자식에서만 접근 가능
}
