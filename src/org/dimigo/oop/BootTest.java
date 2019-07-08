package org.dimigo.oop;

public class BootTest {
    public static void main(String[] args) {
        Book book1;
        book1 = new Book(); // Book(): 기본 생성자 --> "Book.java"에서 기본적으로 컴파일러가 만들어놓았기 때문에 오류 없었음

        Book book2 = new Book("마르고닳도록", "성기하", 100);


        //java: 주소값 X --> 활용 불가능
        System.out.println(book1);
        System.out.println(book2);

        System.out.println(book1.getTitle());
        System.out.println(book1.getAuthor());
        System.out.println(book1.getPage());

        book1.setTitle("수학의 바이블");
        book1.setAuthor("김재영");
        book1.setPage(6543);

        System.out.println(book1.getTitle());
        System.out.println(book1.getAuthor());
        System.out.println(book1.getPage());


        System.out.println(book2.getTitle());
        System.out.println(book2.getAuthor());
        System.out.println(book2.getPage());
    }
}
