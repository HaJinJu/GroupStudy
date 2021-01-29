package Twelveth;

import static Twelveth.Utility.MYSTRCMP;
import static Twelveth.Utility.STRCMPTEST;

public class StrcmpInerface {
    public static void main(String[] args) {
        MyStrcmp ms1 = new MyStrcmp(105.3);
        MyStrcmp ms2 = new MyStrcmp(87.3);

        StrcmpTest st = new StrcmpTest(105.3);

        // 객체 내부의 특정한 가ㅄ을 비교 할 때 인터페이스 사용
        if (ms1.compareTo(ms2, MYSTRCMP) > 0) {
            System.out.println("ms1이 더 크다");
        } else if (ms1.compareTo(ms2, MYSTRCMP) < 0) {
            System.out.println("myStrcmp2가 더 크다");
        } else {
            System.out.println("같다");
        }

        if (ms1.compareTo(st, STRCMPTEST) == 0) {
            System.out.println("작동");
        }
    }
}
