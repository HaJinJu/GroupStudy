import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        Set<String> s1 = new HashSet<>();
        Set<String> s2 = new HashSet<>();

        s1.add("A");
        s1.add("B");
        s1.add("C");
        s1.add("D");

        s2.add("A");
        s2.add("C");
        s2.add("E");

        Set<String> union = new HashSet<>(s1);
        union.addAll(s2);

        Set<String> inersection = new HashSet<>(s1);
        inersection.retainAll(s2);

        System.out.println("합집합" + union);
        System.out.println("교집합" + inersection);

        HashSet<String> hs = new HashSet<>();

        String[] sample = { "안녕", "하하", "호호", "크크", "키키", "켈켈" };

        for (String s : sample) {
            if (!hs.add(s)) {
                System.out.println("중복");
            }

            System.out.println(hs.size() + "출력:" + hs);
        }
    }
}

// set과 hashset의 차이점

// SET은 집합 클래스
// SET이 HASHSET을 포함하고 있음

// set은 순서대로 정렬
// hashset은 순서를 신경쓰지 않음 순서가 빠름