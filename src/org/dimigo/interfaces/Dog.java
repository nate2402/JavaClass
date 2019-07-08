package org.dimigo.interfaces;

public class Dog implements IAnimal { // Dog이라는 class는 IAniaml이라는 Interface를 구현하는 class이다


    @Override
    public void bark() {
        System.out.println("멍멍");
    }

}
