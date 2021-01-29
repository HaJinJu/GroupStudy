package hw_2021_01_08;

public class HW01 {
    public static void main(String[] args) {
        // 생성자를 사용하여 1 ~ 10 까지 출력하는 프로그램을 작성해보자!
        System.out.println("1 ~ 10까지 출력!");

        Constructor_Series cs = new Constructor_Series(1, 10);
        cs.printSeries();
    }
}
