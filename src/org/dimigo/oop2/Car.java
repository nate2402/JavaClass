package org.dimigo.oop2;

public class Car {
    // 정적필드
    private static String company;

    // 인스턴스 필드

    private String name;

    public Car() {}

    public Car(String name) {
        this.name = name;
    }

    public static void setCompany(String company) {
        Car.company = company;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getCompany() {
        return company;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return company + "" + name;
    }
}
