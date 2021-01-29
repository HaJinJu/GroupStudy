package Twelveth;

import static Twelveth.Utility.MYSTRCMP;
import static Twelveth.Utility.STRCMPTEST;

// 실질적으로 interface 에 작성한 프로토타이핑한 매서드는
// 이것을 implements 하는 클래스에서 작성해줘야 한다.
public class MyStrcmp implements Comparable {
    //MyStrcmp 클래스에서 Comparable 인터페이스를 구현한다.
    private double area;

    public MyStrcmp(double area) {
        // MyStrcmp 의 생성자
        this.area = area;
    }


//
    public int processCompare(MyStrcmp other) {
        if (this.area < other.area) {
            // other.area는 메인매서드에 있는 ms2 변수의 값인가?
            return -1;
        } else if (this.area > other.area) {
            return 1;
        } else {
            return 0;
            // 그래서 this.area랑 other.area랑 105.3으로
            // 값이 같으니 값은 0으로 반환되는건가?
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
        // Object otherObj 값을 찾아야 MyStrcmp other의 값을 알 수 있다.
        MyStrcmp other = (MyStrcmp) otherObj;

        return processCompare(other);
        // MyStrcmp의 other가 processCompare 매서드로 리턴
    }

    public int processStrcmpTest(Object otherObj) {

        StrcmpTest other = (StrcmpTest) otherObj;

        return processCompare(other);
        // MyStrcmpTest의 other가 processCompare 매서드로 리턴
    }

    // Object ??? 이건 뭐야 ?
    // Object 는 모든 정보를 아우르고 있는 가장 거대한 집합이다.
    // 여기서 모든 정보란 ? 우리가 사용하는 모든 클래스 등등을 의미한다.
    // 그러므로 타입 캐스팅(형 변환)을 통해
    // 어떤 데이터든 Object 형태로 받을 수 있다.
    // 만약 내용을 들은 사람이 C 개발자라면 void * 생각하면 됩니다.
    public int compareTo(Object otherObj, int ORDER) {
   // "실질적으로 interface 에 작성한 프로토타이핑한 매서드는
        // 이것을 implements 하는 클래스에서 작성해줘야 한다."
        // 강사님 말씀이 여기인 것인가?
        // 나는 인터페이스에 있는 매서드이름이랑 같이 쓸 수 있는건가? 궁금했고
        // 클래스영역에 있어서 독립적으로 봐야하는건지 의문이 든다.
        // 아니면 인터페이스 작성법 중 3번에 내부에 다형성을 가지게 만들 매서드인지 궁금하다.
        // 어제 수업을 처음부터 듣지못해 다형성의 개념을 정확하게 알고싶습니다.

        int res = 0; // 초기값

       switch (ORDER) {
            case MYSTRCMP:
                res = processMyStrcmp(otherObj);
                // res가 초기값 이니깐 processMyStrcmp(otherObj)가 res에 대입
                // 다시 processMyStrcmp(otherObj)로 올라가는건가?
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