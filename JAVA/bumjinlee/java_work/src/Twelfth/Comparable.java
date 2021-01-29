package Twelfth;

// 인터페이스 작성법
// 1. public 을 적고 interface 를 적는다.
// 2. 인터페이스 이름을 적는다.
// 3. 내부에 다형성을 가지게 만들 메서드 프로토타입을 작성한다.

// 다형성?
// 누가 이것을 구현하냐에 따라 결과가 달라진다.
// 코드를 동적으로 다룰 수 있음
public interface Comparable {
    // 현재 이 부분은 단순히 프로토타이핑만 한 곳이다.
    // 프로토타이핑이란?
    // 메서드의 리턴타입, 메서드 이름, 메서드 인자의 엽력만 정의한 형태
    // 메서드의 내용은 이 인터페이스를 implements 한 곳에서 정의한다.
    public int compareTo(Object other, int order);
}
