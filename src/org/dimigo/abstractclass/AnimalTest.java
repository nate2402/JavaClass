package org.dimigo.abstractclass;

public class AnimalTest {
    public static void main(String[] args) {
        Animal[] animals = {
                new Duck(), new Pig(), new Cow()
        };
        for (Animal a : animals) {
            a.eat(); // 다형성
        }
        System.out.println("== 늑대가 나타났다 ==");
        for (Animal a : animals) {
            a.bark(); //다형성
        }
    }
}
