package Thirteen;

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

        s1.add("A");
        s1.add("C");
        s1.add("E");


        Set<String> union = new HashSet<String>(s1);

        // addAll의 경우 모든 내용을 합함(중복 허용x)
        union.addAll(s2);


        Set<String> intersection = new HashSet<String>(s1);

        // retainAll의 경우 모든 내용을 합하는데 교집합 형식으로 해
        intersection.retainAll(s2);

        System.out.println("합집합 = " + union);
        System.out.println("교집합 = "+ intersection);

        //set은 순서대로 정렬한다
        //HashSet은 순서를 신경쓰지 않는다.
        //속도는 그래서 HashSet이 빠르다 ->정리를 안하고 출력하기 때문.
        //순서가 중요하지 않은 비동기 데이터를 처리할때 속도가 아주빠름 ,순서가 정해지게 나오는 것을 원한다면 Set사용

        HashSet<String> hs = new HashSet<String>();
        String[] sample = {
                "최현정", "장해솔", "박재민", "고동영", "이정현", "류슬기",
                "조진형", "한다은", "오진욱", "노찬욱", "박소현", "박기범",
                "최임식", "탁성진", "하진주", "이승윤", "이범진","이범진"
        };
        // sample에 있는 값을 순서대로 하나 하나 가져와서 s에 배치함
        for(String s : sample){
            // Set은 값이 중복되면 add가 되지 않고 false를 리턴한다.
            if(!hs.add(s)){
                System.out.println("Dop"+hs);
            }
            System.out.println("출력1" + hs);
        }


    }
}
