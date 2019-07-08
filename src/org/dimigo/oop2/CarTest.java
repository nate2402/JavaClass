package org.dimigo.oop2;

public class CarTest {

    public static void main(String[] args) {
        Car[] cars = {
                new Car("제네시스"),
                new Car("에쿠스"),
                new Car("그랜저")
        };

        Car.setCompany("현대");

        //-----or-----
//        cars[0].setCompany("기아");
        //static 필드를 변경하기 때문에 모든 값들이 같이 변경되어 표시됨!


        for(Car car : cars) {
            System.out.println(car);
        }

        System.out.println(Integer.parseInt("100")); //--> Integer --> static 매소드!! (객체 생성해서 안들어가니까 ㅎㅎ)
        System.out.println(Math.abs(-123));
    }
}
