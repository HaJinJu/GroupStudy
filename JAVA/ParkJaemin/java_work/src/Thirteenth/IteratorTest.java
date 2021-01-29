package Thirteenth;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        //ArrayList<> :
        // 다양한 데이터 타입을 수용할 수 있게 해준다.
        // <String> 문자열, <Integer> 정수, <Float> float 타입 등등
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        // ------------------------------------------
        // | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 |
        // ------------------------------------------
        // | 1 | 2 |   | 4 | 5 | 6 | 7 | 8 | 9 | 10 |
        // ------------------------------------------
        // | 1 | 2 |   |   | 5 |   | 7 |   | 9 | 10 |
        // ------------------------------------------
        // | 1 | 2 | 5 | 7 | 9 | 10 | xxxxxxxxxxxxxxxxxxxxxxxx
        // ------------------------------------------

        // -----    -----    -----
        // | 1 | -> | 2 | -> | 4 | -> ... ->     ooooooooooooo
        // -----    -----    -----


        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        String s;
        // Iterator = ArrayList 를 한번 순회(훑어보고) 할 수 있는 정보를 획득함.
        Iterator e = list.iterator(); // Iterator 객체를 반환
        // e를 통해 순회할 수 있는 정보가 있다면
        while (e.hasNext()){ // 읽어올 요소가 있는지 확인
            s = (String) e.next(); // 해당 위치의 정보를 s에 저장(대입)하세요, 요소를 읽어오기
            System.out.println(s); // 출력하세요
            // Iterator는 1회용이라 다쓰고나면 다시 얻어와야한다.





        }
    }
}
