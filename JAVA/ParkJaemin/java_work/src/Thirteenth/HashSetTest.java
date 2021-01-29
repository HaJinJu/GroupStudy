package Thirteenth;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest { //순서x, 중복x
    public static void main(String[] args) {
        // - Set 인터페이스를 구현한 대표적인 컬렉션 클래스
        // - 순서를 유지하려면 Linked HashSet 클래스를 사용하면 된다.
        Set<String> s1 = new HashSet<String>();
        Set<String> s2 = new HashSet<String>();

        s1.add("A");
        s1.add("B");
        s1.add("C");
        s1.add("D");

        s2.add("A");
        s2.add("C");
        s2.add("E");


        // set은 집합 클래스이며 - 순서가 중요할 때 사용!
        // HashSet은 상대적으로 속도가 더 빠른 집합 클래스다.
        Set<String> union = new HashSet<String>(s1);
        // addAll의 경우 모든 내용을 합함(중복 허용x)
        union.addAll(s2);

        Set<String> intersection = new HashSet<String>(s1);
        //retainAll의 경우 모든 내용을 합하는 데 교집합 형식으로 해석
        intersection.retainAll(s2);

        System.out.println("합집합 = " + union);
        System.out.println("교집합 = " + intersection);


        // set은 순서대로 정렬을 한다.
        // HashSet은 순서를 신경쓰지 않는다.
        // 순서가 중요하지 않을 때 사용!
        HashSet<String> hs = new HashSet<String>();
        String[] sample = {
                "안녕", "하하", "호호", "크크", "키키", "켈켈"
        };


        // sample에 있는 값을 순서대로 하나하나 가져와서 s에 배치하는 구문
        for (String s : sample){
           // Set은 값이 중복되면 add가 되지 않고 false를 리턴한다.
            if(!hs.add(s)){
                System.out.println("중복!");
            }
            System.out.println(hs.size()+ "출력 : " + hs);
        }
    }
}
