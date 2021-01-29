package Thirteenth;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        // ArrayList<>:
        // ArrayList 는 다양한 데이터 타입을 수용할 수 있게해준다.
        // <String> 문자열, <Integer> 정수, <Float> float 타입 등등...
        ArrayList<String> list1 = new ArrayList<String >();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        list1.add("one");
        list1.add("two");
        list1.add("three");
        list1.add("four");
        list1.add("five");

        String s;
        Iterator e = list1.iterator();

        while (e.hasNext()) {
            s = (String) e.next();
            System.out.println(s);
        }
    }
}
