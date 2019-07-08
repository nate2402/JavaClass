package org.dimigo.oop;

public class Snack {
    private String name;
    private String company;
    private int price;
    private int number;


    //constructor


    public Snack() {
    }

    public Snack(String name, String company, int price, int number) {
        this.name = name;
        this.company = company;
        this.price = price;
        this.number = number;
    }

    //getter

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public int getPrice() {
        return price;
    }

    public int getNumber() {
        return number;
    }


    //setter


    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    public int calcprice() {
        return(price * number);
    }


    //toString

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("이름: ").append(name)
                .append("\n제조사: ").append(company)
                .append("\n가격: ").append(String.format("%,d원",price))
                .append("\n개수: ").append(number)
                .append("\n");
        return sb.toString();
    }
}
