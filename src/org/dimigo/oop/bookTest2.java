package org.dimigo.oop;

public class bookTest2 {
    private static void compare() {
        int a = 10;
        int b = a;
        System.out.println(a == b ? "true" : "false");

        Book book = new Book();
        Book book2 = book;
        System.out.println(book == book2 ? "true" : "false");


        book2.setTitle("수학의 바이블");
        System.out.println(book.getTitle()); // result: 수학의 바이블
        System.out.println(book2.getTitle()); // result: 수학의 바이블

    }

    public static void main(String[] args) {
        compare();


        System.out.println("=======================");

        int num = 5;
        methodA(num);
        System.out.println(num);

        System.out.println("=======================");

        Book book = new Book("컴퓨터 네트워크");
        methodB(book);
        System.out.println(book.getTitle());

        System.out.println("=======================");

        methodC(book);
        System.out.println(book.getTitle());

        System.out.println("=======================");

        //null point exception

        Book book2 = new Book();
        System.out.println(book2.getTitle());
    }

    private static void methodC(Book book) {
        book.setTitle("공업수학");
    }

    private static void methodB(Book book) {
        System.out.println(book.getTitle());
        book = new Book("중궈");
        System.out.println(book.getTitle());
    }

    private static void methodA(int num) {
        num++;
        System.out.println(num);
    }
}
