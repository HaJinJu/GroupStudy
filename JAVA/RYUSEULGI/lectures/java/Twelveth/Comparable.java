package Twelveth;

public interface Comparable {
    // 프로토 타이핑만 한 것
    // 메소드 리턴타입, 이름, 인자의 입력만 정의한 형태
    public int compareTo(Object other, int oreder);
}

// 인터페이스 내부에 다형성을 가지게 만들 메소드 프로토타입을 작성한다.
// 다형성이란? 누가 이것을 구현하나에 따라 결과가 달라지는 것