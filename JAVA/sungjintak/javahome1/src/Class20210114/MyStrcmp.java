package Class20210114;

import static Class20210114.Utility.MYSTRCMP;
import static Class20210114.Utility.STRCMPTEST;

// 실질적으로 interface 에 작성한 프로토타이핑한 매서드는
// 이것을 implements 하는 클래스에서 작성해줘야 한다.
public class MyStrcmp implements Comparable { // Comparable 이라는 인터페이스를 불러온다.
    private double area;

    public MyStrcmp(double a) {                 // 생성자 만들고 a 라는 변수를 area 에 대입한다
        area = a;
    }

    public int processCompare(MyStrcmp other) {  //메소드를 생성하고 MyStrcmp 는 데이터타입? other를 선언
        if(this.area < other.area) {                // Q : MyStrcmp의 용도는 데이터타입인가요? 그렇다면
            return -1;                              //     int나 다른 데이터 타입을 사용하지않고 MyStrcmp를 사용하는
        } else if(this.area > other.area) {         //     이유가 궁금합니다.
            return 1;
        } else {
            return 0;
        }
    }

    public int processCompare(StrcmpTest other) {   // 이것도 위와 마찬가지로 궁금합니다
        if(this.area < other.getArea()) {           // ares가 getArea보다 작으면
            return -1;                              // return -1
        } else if(this.area > other.getArea()) {        // 반대라면 return 1
            return 1;
        } else {
            return 0;                                       //그것도 아니라면 0
        }
    }

    public int processMyStrcmp(Object otherObj) {   // Q : Object가 여기서 데이터타입으로 사용된것인가요?
        MyStrcmp other = (MyStrcmp) otherObj;       // Q : MyStrcmp 랑 Object랑 다른 타입인가요?

        return processCompare(other);
    }

    public int processStrcmpTest(Object otherObj) {         // otherObj를 선언
        StrcmpTest other = (StrcmpTest) otherObj;           // other 에다가 otherObj를 StrcmpTest로 형 변환후 other에 대입??

        return processCompare(other);                       //processCompare로 orher 값을 return?
    }

    // Object ??? 이건 뭐야 ?
    // Object 는 모든 정보를 아우르고 있는 가장 거대한 집합이다.
    // 여기서 모든 정보란 ? 우리가 사용하는 모든 클래스 등등을 의미한다.
    // 그러므로 타입 캐스팅(형 변환)을 통해
    // 어떤 데이터든 Object 형태로 받을 수 있다.
    // 만약 내용을 들은 사람이 C 개발자라면 void * 생각하면 됩니다.
    public int compareTo(Object otherObj, int ORDER) {             // 인터페이스에서 comparaTo라는 메소드를 불러옴
        int res = 0;                                                //res 에 0을 넣음

        switch (ORDER) {                                                //switch (ORDER) 값을 입력받음
            case MYSTRCMP:
                res = processMyStrcmp(otherObj);                        //입력 받은 값에 따라 알맞은 case로 이동후 브레이크
                break;
            case STRCMPTEST:
                res = processStrcmpTest(otherObj);
                break;
            default:
                break;
        }

        return res;                                                     // switch문이 끝나면 res값을 return
    }
}