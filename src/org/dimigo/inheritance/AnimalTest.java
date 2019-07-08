package org.dimigo.inheritance;

public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Animal("동물");
        System.out.println(a);
        a.bark();

        Dog d = new Dog("멍멍이");
        System.out.println(d);
        d.bark();
        d.catchBall();

        Cat c = new Cat("야옹이");
        System.out.println(c);
        c.bark();
        c.scratch();

        Tiger t = new Tiger("호돌이");
        System.out.println(t);
        t.bark();
        t.hunt();

        Animal a2 = new Dog("멍멍이"); // upcasting
        Animal a3 = new Cat("야옹이");
        Animal a4 = new Tiger("호돌리");
        a2.bark();  //멍멍
        a3.bark();  //야옹
        a4.bark();  //어흥
        //-> upcasting 장점: TYPE이 같음 --> 배열로 받을 수 있음!!

        Animal[] animals = {
                new Dog("멍멍이"), // upcasting
                new Cat("야옹이"),
                new Tiger("호돌리")
        };

        for ( Animal animal: animals) {
//            System.out.println(animals);
//            animal.eat();
//            animal.sleep();
//            animal.bark();
            doBark(animal);
        }

        Animal b = new Dog("멍멍이");
        Animal b2 = new Cat("야옹이");
        Animal b3 = new Tiger("호돌이");

        b.eat();
        b.sleep();
        b.bark();

        Dog dog = (Dog) b; //TypeCasting (강제 형변환)

        dog.catchBall();

        ((Cat) b2).scratch();

//        Cat cat = (Cat) b;
        //ClassCastException --> Runtime Error

        //instanceof 연산자 - 타입/자식을 분별 가능

        Animal c1 = new Dog("멍멍이");
        Animal c2 = new Cat("야옹이");

        System.out.println(c1 instanceof Dog); //true
        System.out.println(c1 instanceof Cat); //false
        System.out.println(c2 instanceof Cat); //true
        System.out.println(c2 instanceof Animal); //true
        System.out.println(c2 instanceof Object); //true
    }

    private static void doBark(Animal animal) { // 각 개체를 animal로 upcasting
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.catchBall();
        } else if (animal instanceof Cat) {
            ((Cat) animal).scratch();
        }
        System.out.println(animal);
        animal.eat();
        animal.sleep();
        animal.bark();
    }
}
