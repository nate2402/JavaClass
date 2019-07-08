package org.dimigo.inheritance;

public class Tiger extends Animal {

    public Tiger(String name) {
        super(name);
    }

    //method overriding
    public void bark() {
        System.out.println("어흥");
    }

    public void hunt() {
        System.out.println(name + "이/가 사냥을 합니다.");
    }
}
