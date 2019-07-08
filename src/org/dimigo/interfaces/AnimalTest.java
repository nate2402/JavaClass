package org.dimigo.interfaces;

public class AnimalTest {
    public static void main(String[] args) {
        System.out.println(IAnimal.FARM_NAME);

        IAnimal.welcome();
        IAnimal aa = new Dog();

        IAnimal[] animals = {
                new Dog(), new Cat()
        };

        for (IAnimal a : animals) {
            a.eat();
            a.sleep();
            a.bark();
        }
    }
}
