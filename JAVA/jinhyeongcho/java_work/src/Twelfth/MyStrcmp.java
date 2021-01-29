package Twelfth;

import static Twelfth.Utility.MYSTRCMP;
import static Twelfth.Utility.STRCMPTEST;

// 실질적으로 interface 에 작성한 프로토타이핑한 매서드는
// 이것을 implements 하는 클래스에서 작성해줘야 한다.

//클래스 MyStrcmp에 만든 인터페이스 Comparable를 implement
public class MyStrcmp implements  Comparable {
   // 변수 할당
    private double area;
     //생성자를 만든다.
    public MyStrcmp(double a){
        area = a;
    }

    public int processCompare(StrcmpTest other) {
        if(this.area < other.getArea()) {
            return -1;
        } else if(this.area > other.getArea()) {
            return 1;
        } else {
            return 0;
        }
    }

    public int processCompare(MyStrcmp other) {
        if(this.area < other.area) {
            return -1;
        } else if(this.area > other.area) {
            return 1;
        } else {
            return 0;
        }
    }

    public int processStrcmpTest(Object otherObj) {
        StrcmpTest other = (StrcmpTest) otherObj;

        return processCompare(other);
    }

    public int processMyStrcmp(Object otherObj) {
        MyStrcmp other = (MyStrcmp) otherObj;

        return processCompare(other);
    }

    // Object ?? 이건 뭐야?
    // Object 는 모든 정보를 아우르고 있는 가장 거대한 집합이다. int도 될수있고 double도 될수있고 모든..
    // 여기서 모든 정보란? 우리가 사용하는 모든 클래스 등등을 의미한다.
    // 그러므로 타입 캐스팅(형 변환)을 통해
    // 어떤 데이터든 object 형태로 받을 수 있다.
    // 만약 내용을 들은 사람이 C 개발자라면 void * 생각하면 됩니다.
    public int compareTo(Object otherObj , int ORDER){
        int res = 0;
        switch (ORDER){
            case  MYSTRCMP:
                res = processMyStrcmp(otherObj);
                break;
            case  STRCMPTEST:
                res =processStrcmpTest(otherObj);
                break;
            default:
                break;
        }

     return  res;
    }
}