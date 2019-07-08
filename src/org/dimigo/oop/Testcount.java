package org.dimigo.oop;

public class Testcount {
    public static void main(String[] args) {
        int cnt = 0;
        for (int i = 0; i < 5; i++) {
            for (int j=0; j < 5; j++) {
                if (i == j) break;
                if (i + j < 5) {
//
                    continue;

                }
                System.out.println("=========");
                System.out.print(i);
                System.out.println(j);
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
