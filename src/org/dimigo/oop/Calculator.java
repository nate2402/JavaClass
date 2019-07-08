package org.dimigo.oop;

public class Calculator {

    /***** 인스턴스 필드(static이 없는 필드 ==> 객체를 만들어야 사용 가능) *****/
    private int num1; //0
    private int num2; //0
    private boolean powerflag; //false

    //생성할때 Heap에서 생성됨



    //-----constructor------


    public Calculator () {

    }

    public Calculator(int num1, int num2) {
        //초기화
        this.num1 = num1;
        this.num2 = num2;
    }


    /**** 인스턴스 메소드 (static이 없는 메소드) ****/


    public void powerOn() {
//        System.out.println(this);
        if (this.powerflag == false) {
            //같은 Heap에 생성됨 --> this를 붙여서 불러올 수 있음
            System.out.println("전원을 켭니다");
            this.powerflag = true;
        }

    }

    public void powerOff() {
        if (this.powerflag == true) {
            System.out.println("전원을 끕니다");
            this.powerflag = false;
        }
    }

    public int add() {
        powerOn();
        return this.num1 + this.num2;
    }

    public int sub() {
        powerOn();
        return this.num1 - this.num2;
    }

    public int mul() {
        powerOn();
        return this.num1 * this.num2;
    }

    public double div() {
        powerOn();
        return (double)this.num1 / this.num2;
    }


    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.powerOn(); //static에서 호출함 --> 객체를 만들어 호출해야함!
    }


}
