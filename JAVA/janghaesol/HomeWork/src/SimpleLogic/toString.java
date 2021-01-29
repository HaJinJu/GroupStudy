package SimpleLogic;

public class toString {
    public static void main(String[] args) {
        /*
        toString() 메소드는 해당 인스턴스에 대한 정보를 문자열로 반환합니다.
        이때 반환되는 문자열은 클래스 이름과 함께 구분자로 '@'가 사용되며, 그 뒤로 16진수 해시 코드(hash code)가 추가됩니다.
        16진수 해시 코드 값은 인스턴스의 주소를 가리키는 값으로, 인스턴스마다 모두 다르게 반환됩니다.

        다음 예제는 toString() 메소드를 이용하여 인스턴스의 정보를 출력하는 예제입니다.
         */
        Car car01 = new Car();
        Car car02 = new Car();

        System.out.println(car01.toString());
        System.out.println(car02.toString());
    }
    //결과값
    //Car@15db9742
    //Car@6d06d69c
    private static class Car {
    }
}
