// 배열과 Arraylist의 차이(배열이 처리 속도는 더 빠름)
// 배열은 가ㅄ이 사라지면 보이지 않는 것이지만 0이 남아있음
// Arraylist는 다음가ㅄ이 누구인지 알아야 함 비교하는 형식
// 근데 Arraylist 왜 사용? 유연성이 높기 떄문 > 자료형구조

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        String s;

        // ArrayList를 순회 할 수 있는 정보를 획득 훑어보고 가는 것
        Iterator e = list.iterator();

        // e를 통해 순회 할 수 있는 정보가 있다면 문자열에 저장하셈
        while (e.hasNext()) {
            s = (String) e.next();
            System.out.println(s);
        }
    }
}
