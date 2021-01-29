
package Twelveth;

import static Twelveth.Utility.MYSTRCMP;
import static Twelveth.Utility.STRCMPTEST;

// String compare with Interface
public class StrcmpInterfaceTest {
    public static void main(String[] args) {
        MyStrcmp ms1 = new MyStrcmp(105.3);
        MyStrcmp ms2 = new MyStrcmp(105.3);

        StrcmpTest st = new StrcmpTest(105.3);

        // 뭐야 ? 왜 MyStrcmp 를 구지 Object 로 바꾸고
        // 다시 이것을 형변환해서 MyStrcmp 로 만들었지 ?
        if (ms1.compareTo(ms2, MYSTRCMP) > 0) {
            // MYSTRCMP는 유틸리티에 있는 상수 값인가? 왜 MYSTRCMP를 설정한 이유는 무엇일까?
            // ms2 값을 -105.3으로 했을 때 if 문에 해당되어 "ms1값이 ms2 보다 더 크다."로
            // 출력된 것으로 보아 ms1.co값 기준으로 0보다 작다고 생각하니 출력이 된 것같다.
            System.out.println("ms1값이 ms2 보다 더 크다.");
        } else if (ms1.compareTo(ms2, MYSTRCMP) < 0) {

            System.out.println("ms1은 ms2 보다 더 작다.");
        } else {
            System.out.println("ms1과 ms2는 같다.");
        }

        if (ms1.compareTo(st, STRCMPTEST) == 0) {
            // 이건 번외로 한 것인가? 그냥 "이게 되네?"를 보여주려고?
            System.out.println("이게 되네 ?");
        }

           // 인터페이스를 작성 하게되면 인터페이스에 연관된 매서드는 다 포함되어 실행 되는 것인지?


    }
}