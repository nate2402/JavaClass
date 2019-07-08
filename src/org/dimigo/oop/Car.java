package org.dimigo.oop;


//import 선언부

//java.lang 패키지 --> 유일하게 패키지 Import 없이도 사용 가능

//모든 패키지 선택을 *로 할 수 없음!! class만 *로 모두 불러올 수 있음.
import java.lang.String;
import java.lang.System;
import java.util.*;

/**
 * 
 */

//class

public class Car {

    /**
     * Default constructor : 기본 생성자
     */
    public Car() {
    }


    //Field

    private String company;

    private String model;

    private String color;

    private String type;

    private int price;

    /**
     * @return
     */

    //Method

    public void forward() {
        System.out.println("전진합니다!!");
        //void --> return문 생략
    }

    /**
     * @return
     */
    public void backward() {
        System.out.println("후진합니다!!");
    }

    /**
     * @return
     */
    public boolean stop() {
        System.out.println("정지합니다!!");
        return true; //boolean --> true / false 를 return 가능
    }

    /**
     * @param angle 
     * @return
     */
    public void turnRight(int angle) {
        System.out.println(angle + "도 우회전합니다!!");
    }

    /**
     * @param angle 
     * @return
     */
    public void turnLeft(int angle) {
        System.out.println(angle + "도 좌회합니다!!");
    }

}