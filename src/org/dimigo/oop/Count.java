package org.dimigo.oop;

public class Count {
    //총 만든 객체의 개수 세기

    private static int cnt;

    public Count() {
        //cnt 사용 가능 --> static은 어디서든 사용 가능 (먼저 올라가기 때문)
        cnt++;
    }


    public static void main(String[] args) {
        for (int i = 0; i<10; i++) {
            new Count();
        }

        System.out.println(Count.cnt);

        //main을 밖에서 호출할경우 --> Count.cnt를 가져가기 위해서는 getter를 생성해줘야 함 (cnt: private이기 때문에)
        //main을 밖에서 호출할경우 --> System.out.println(Count.getCnt());로 불러옴
    }

    public static int getCnt() {
        return cnt;
    }
}
