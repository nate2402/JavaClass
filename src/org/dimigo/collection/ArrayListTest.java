package org.dimigo.collection;

import org.dimigo.abstractclass.Dog;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    //배열의 단점: 초기에 지정한 개수 이상 입력하면 새로 만들어야함 (fixed length)
    //collection: 필요할때마다 추가로 만들 수 있음.

    public static void main(String[] args) {
        //ArrayList 생성
        List list = new ArrayList();
        list.add("나자바");
        list.add(100);
        list.add(new Dog());
        String s = (String) list.get(0); //"나자바"이지만, 여러 형태가 담겨져있기 떄문에 object형식임 --> 강제 형변환 필요


        //제너릭(Generic) - 특정 형태의 정보들만 colleciton에 담음
        List<String> list2 = new ArrayList<String>(); // 뒤에 ArrayList<String>의 <String>은 생략 가능
        list2.add("사과");
        list2.add("배");
        list2.add("딸기");
        list2.add("딸기");
        list2.add(1, "포도"); //--> 넣으면 들어가고 기존의 자료는 1칸씩 밀림
        list2.set(1, "바나나"); //--> 파일의 내용을 교체함
        printList(list2);

        System.out.println(list2.get(2));
        System.out.println(list2.get(list2.size() -1)); // --> 가장 마지막에 있는 배열값 가지고오기

        list2.remove(0); //사과 삭제

        printList(list2);

        list2.remove("딸기"); //--> 가장 먼저 일치하는 단어를 삭제
        printList(list2);

        list2.clear();
    }

    private static void printList(List<String> list2) {
        for(String s : list2) {
            System.out.print(s + " | ");
        }
        System.out.println();
    }
}
