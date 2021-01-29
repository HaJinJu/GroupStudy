package Twelfth;

import static Twelfth.Utility.MYSTRCMP;
import static Twelfth.Utility.STRCMPTEST;

// String compare with Interface
public class StrcmpInterfaceTest {
    public static void main(String[] args) {
        MyStrcmp ms1 = new MyStrcmp(105.3);
        MyStrcmp ms2 = new MyStrcmp(87.3);

        StrcmpTest st = new StrcmpTest(105.3);

        // 뭐야 왜 MyStrcmp 를 굳이 Object 로 바꾸고
        // 다시 이것을 형변환해서 MyStrcmp 로 만들었지?

        if(ms1.compareTo(ms2, MYSTRCMP)>0){
            System.out.println("ms1이 ms2보다 더 크다.");
        } else if(ms1.compareTo(ms2, MYSTRCMP)<0){
            System.out.printf("ms1은 ms2보다 더 작다.");
        } else {
            System.out.printf("ms1과 ms2는 같다.");
        }

        if (ms1.compareTo(st, STRCMPTEST)==0);
        System.out.printf("이게되네?");
    }
}
