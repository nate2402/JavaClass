package org.dimigo.oop;

public class SnackTest {
    public static void main(String[] args) {
        Snack[] snacks = null;

        snacks = new Snack[] {
                new Snack ("새우깡", "농심", 1100, 2),
                new Snack ("콘칲", "크라운", 1200, 1),
                new Snack ("허니버터칩", "해태", 1500, 4)
        };

        printsnacks(snacks);
    }



    public static void printsnacks(Snack[] snacks) {
        int total = 0;
        for(Snack value: snacks) {
            System.out.println(value);
            total += value.calcprice();
        }
        System.out.printf("총 구매 금액: %,d원", total);
    }
}
