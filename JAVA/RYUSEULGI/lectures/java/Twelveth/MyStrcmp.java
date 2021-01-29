
// 인터페이스에 프로토타입한 메소드는 implements 에 입력해주어야 함
package Twelveth;

import static Twelveth.Utility.MYSTRCMP;
import static Twelveth.Utility.STRCMPTEST;

public class MyStrcmp implements Comparable {
    private double area;

    // 생성자
    public MyStrcmp(double a) {
        area = a;
    }

    public int processCompare(MyStrcmp other) {
        if (this.area < other.area) {
            return -1;
        } else if (this.area > other.area) {
            return 1;
        } else {
            return 0;
        }
    }

    public int processCompare(StrcmpTest other) {
        if (this.area < other.getArea()) {
            return -1;
        } else if (this.area > other.getArea()) {
            return 1;
        } else {
            return 0;
        }
    }

    public int processMyStrcmp(Object otherObj) {
        MyStrcmp other = (MyStrcmp) otherObj;

        return processCompare(other);
    }

    public int processStrcmpTest(Object otherObj) {
        StrcmpTest other = (StrcmpTest) otherObj;

        return processCompare(other);
    }

    // Comparable 인터페이스
    public int compareTo(Object otherObj, int ORDER) {
        int res = 0;

        switch (ORDER) {
            case MYSTRCMP:
                res = processMyStrcmp(otherObj);
                break;
            case STRCMPTEST:
                res = processStrcmpTest(otherObj);
                break;
            default:
                break;
        }
        return res;
    }

}
