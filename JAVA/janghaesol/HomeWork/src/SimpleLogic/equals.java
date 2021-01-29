package SimpleLogic;

public class equals {
    public static void main(String[] args) {
        Car car01 = new Car();
        Car car02 = new Car();

        System.out.println(car01.equals(car02));
        car01 = car02; // 두 참조 변수가 같은 주소를 가리킴.
        System.out.println(car01.equals(car02));
    }
    //결과값
    //false
    //true

    private static class Car {
    }
}
