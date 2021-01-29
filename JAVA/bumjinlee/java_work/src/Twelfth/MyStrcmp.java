package Twelfth;

import static Twelfth.Utility.MYSTRCMP;
import static Twelfth.Utility.STRCMPTEST;

// 실질적으로 interface 에 작성한 프로토타이핑한 메서드는
// 이것을 implements 하는 클래스에서 작성해야 한다.
public class MyStrcmp implements Comparable {
    // 대, 소 비교를 위한 변수
    private int area;

    // 객체 생성시 area 에 입력 받은 값이 담김
    public MyStrcmp(int a) {
        area = a;
    }

    // 비교를 처리하기 위한 메서드 (MyStrcmp 용)
    // 인자로 받는 데이터타입으로 비교하는 메서드가 구분된다.
    public int processCompare(MyStrcmp other) {

        if (this.area < other.area) {
            return -1;
        } else if (this.area > other.area) {
            return 1;
        } else {
            return 0;
        }
    }

    // 비교를 처리하기 위한 메서드 (StrcmpTest 용)
    public int processCompare(StrcmpTest other) {

        if (this.area < other.getArea()) {
            return -1;
        } else if (this.area > other.getArea()) {
            return 1;
        } else {
            return 0;
        }
    }

    // Object 로 받아온 객체를 특정 객체로 캐스팅 해주는 메서드 (MyStrcmp 용)
    public int processMyStrcmp(Object otherObj) {
        MyStrcmp other = (MyStrcmp) otherObj;

        return processCompare(other);
    }

    // Object 로 받아온 객체를 특정 객체로 캐스팅 해주는 메서드 (StrcmpTest 용)
    public int processStrcmpTest(Object otherObj) {
        StrcmpTest other = (StrcmpTest) otherObj;

        return processCompare(other);
    }

    // Object 는 무엇일까?
    // Object 는 모든 정보를 아우르고 있는 가장 거대한 집합이다.
    // 여기서 모든 정보란? 우리가 사용하는 모든 클래스 등등을 의미한다.
    // 그러므로 타입 캐스팅 (형 변환)을 통해
    // 어떤 데이터든 Object 형태로 받을 수 있다.

    // Object 는 모든 데이터타입을 받을 수 있다.
    // 그렇기 때문에 받아온 데이터를 switch 를 사용해 객체처리를 분리한다.
    public int compareTo(Object otherObj, int ORDER) {
        // interface comparable 에서 작성한 프로토타이핑을 실제로 구현한 메서드
        int res = 0;

        switch (ORDER) {
            case MYSTRCMP:
                res = processMyStrcmp(otherObj);
                break;

            case STRCMPTEST:
                res = processStrcmpTest(otherObj);
        }

        return res;
    }
}