package Thirteenth;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        Set<String> s1 = new HashSet<String>();
        Set<String> s2 = new HashSet<String>();

        s1.add("A");
        s1.add("B");
        s1.add("C");
        s1.add("D");

        s2.add("A");
        s2.add("C");
        s2.add("E");

        // Set 은 집합 클래스이며
        // HashSet 은 상대적으로 속도가 더 빠른 집합 클래스다.
        Set<String> union = new HashSet<String>(s1);
        // addAll(Set) - 인자로 받는 Set 의 요소를 전부 추가한다.
        // Set 은 중복을 허용하지 않는 집합 클래스이기 때문에
        // 값이 중복되는 경우 추가하지 않는다.
        // 즉, 합집합
        union.addAll(s2);

        Set<String> intersection = new HashSet<String>(s1);
        // retainAll(Set) - 인자로 받는 Set 에 포함되지 않는 요소는 전부 제거한다.
        // 즉, 교집합
        intersection.retainAll(s2);

        System.out.println("합집함 = " + union );
        System.out.println("교집합 = " + intersection);

        // Set 은 순서대로 정렬을 한다.
        // HashSet 은 순서를 신경쓰지 않는다.
        HashSet<String > hs = new HashSet<String >();
        String[] sample = {
                "안녕", "하하", "호호", "키키", "크크", "켈켈"
        };

        for (String s : sample) {
            // add()는 값이 중복 되면 false를 반환한다.
            if(!hs.add(s)) {
                System.out.println("중복");
            }
            System.out.println(hs.size() + "출력" + hs);
        }
    }
}
