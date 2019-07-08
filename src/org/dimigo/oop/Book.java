package org.dimigo.oop;

public class Book {

    //필드 정의

    //private & getter & setter 로 설정 --> 값 검증 가능 (ex: if문을 통한 값 사용)
    //public: 값 검증 불가능

    private String title;
    private String author;
    private int page;

    //생성자





    //기본 생성자
    //한번에 초기화하기 위하여 사용함
    //return부가 없음. / class명과 같아야 함 /

    //밑에 조건별 생성자를 추가로 넣어준 경우, 기본 생성자를 별도로 넣어주지 않음.
   public Book() {
       System.out.println("기본생성자 호출");
   }

    public Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    public Book(String title, String author) {

       //this (받아온 값은 받아온 값, 없는 값은 default 값 지정)
        this(title, author, 0);
    }

    public Book(String title) {
        this(title, "작자미상");
    }

    /*
    //생성자 추가

    //()안의 내용을 가지고 있는 조건에 따라 생성자가 선택적으로 실행됨

    //title & author 초기화
    public Book(String title, String author) {
        System.out.println("매개변수 3개짜리 생성자");
        this.title = title;
        this.author = author;
        this.page = page;
    }


    //title 초기화
    public Book(String title) {
        System.out.println("매개변수 3개짜리 생성자");
        this.title = title;
        this.author = author;
        this.page = page;
    }

    //title & author & page 초기화
    public Book(String title, String author, int page) {
        System.out.println("매개변수 3개짜리 생성자");
        this.title = title;
        this.author = author;
        this.page = page;
    }

    */

    //메소드 정의

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }



    /*
    //getter
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPage() {
        return page;
    }

    //setter

    public void setTitle(String title) {

        //구분자 활용하여 같은 이름의 문자열 구분
        this.title = title;
    }

    public void setAuthor(String author) {

        //구분자 활용하여 같은 이름의 문자열 구분
        this.author = author;
    }

    public void setPagee(int page) {

        //구분자 활용하여 같은 이름의 문자열 구분
        this.page = page;
    }
    */

    //현재 객체의 상태를 return

//    public String toString() {
//        return "책제목:" + title
//                + ", 저자명: " + author
//                + ", 페이지수: " + page;
//    }

    // ----or----

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", page=" + page +
                '}';
    }
}
