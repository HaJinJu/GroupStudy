package hw_2021_01_08;

public class HW03 {
    public static void main(String[] args) {
        // 생성자를 사용하여 5 ~ 55 까지 숫자중 7의 배수만 출력해보자!
        System.out.println("5 ~ 55까지 7의 배수만 출력!");

        Constructor_Series cs = new Constructor_Series(5, 55);
        cs.printOrderSeries(7);
    }
}
