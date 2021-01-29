# 2021 / 01 / 14 12일차 Question Note


## 참조 코드
```java

public class Test {
    int a = 0;
    static int b = 1;

    public void nonStatic() {
        a = 1;
        b = 2;
    }

    public static void Static() {
        a = 1;
        b = 2;
    }
}
```
### Question
***
1. 위 코드에서 처럼 static 이 없는 멤버 변수 a 는 nonStatic() 메서드에서 사용 시 오류가 발생하지않고
   Static 메서드에서는 오류가 발생합니다. 왜 그런 건가요?

***   
2. Object 로 받는 객체는 반드시 형 변환이 필요한가요?
   Object 의 장점은 데이터를 동적으로 받을 수 있는 것이 장점이라고 생각이 드는데
   반드시 형 변환을 해야 한다면 객체가 들어오는 케이스 마다 각각의 처리가 필요한데
   그렇다면 객체를 따로따로 받아오는 것 보다 어떤 이점이 있을까요?
***   