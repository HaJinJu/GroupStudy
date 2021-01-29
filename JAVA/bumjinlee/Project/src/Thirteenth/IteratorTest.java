package Thirteenth;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        // ArrayList<> : 이 녀석은 다양한 데이터 타입을 수용할 수 있게 해준다.
        // <String> 문자열, <Interget> 정수, <Float> 실수 타입 등등
        ArrayList<String> List = new ArrayList<String>();

        List.add("One");
        List.add("Two");
        List.add("Three");
        List.add("Four");
        List.add("Five");

        String s;
        //ArrayList 를 순회할수 있는 정보를 획득함
        Iterator e =  List.iterator();
        //e를 통해 순회할 수 있는 정보가 있다면
        while(e.hasNext()) {
            // 해당 위치의 정보를 s 에 저장하세요.
            s = (String) e.next();
            System.out.println(s);
        }
    }
}
