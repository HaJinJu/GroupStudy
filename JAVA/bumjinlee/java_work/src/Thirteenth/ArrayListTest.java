package Thirteenth;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        // List 생성 방법:
        ArrayList<String> list = new ArrayList<String>(5);

        // List 에 요소를 추가하는 메서드
        // add(index , element)
        list.add("MILK");
        list.add("BREAD");
        list.add("BUTTER");

        list.add(1, "APPLE");
        list.add(2, "GRAPE");

        for (int i = 0; i < list.size(); i++) {
            // List 요소의 값을 얻는 메서드
            // get(index)
            System.out.println(list.get(i));
        }

        System.out.println("******************************");

        // List 의 요소를 지우는 메서드
        // remove(index) 혹은 remove(value)
        list.remove(3);

        // ArrayList 의 자료구조는 Queue(선입선출) 구조이다.
        // 가장 먼저 add() 한 요소가 index 1번을 차지하고
        // 그 다음 순서대로 index 번호를 차지한다.

        // ArrayList 의 구조는 연걸 리스트이다.
        // [0] -> [1] -> [2] -> [3] -> [4]   index
        //  0      1      2      3      4    value
        // remove(2);
        // [0] -> [1] -> [2] -> [3]          index
        //  0      2      3      4           value
        // List 의 동작방식은 위와 같다.
        // remove(), add(), contains() 와 같은 유용한 메서드를 사용할 수 있다.
        // 이는 배열을 좀더 유연한 방식으로 다룰 수 있게 해준다.
        // [first] -> [next] -> [next.next] -> [next.next.next]  index
        //    1         2            3                4          value
        // 2번 index 를 지웠다는 것은 next 를 지운 것이고 결국엔 값만 날라가고
        // first 가 바라보는 next 는 next.next 가 될 뿐이다.
        // remove 된 값은 실제로는 메모리에 있지만 Garbage Collector 라는 것이
        // 사용하지 않는 데이터는 없애버리기 때문에 remove 된 값은 나중에 사라진다.
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}


