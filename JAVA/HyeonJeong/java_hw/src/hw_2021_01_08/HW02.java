package hw_2021_01_08;

public class HW02 {
    public static void main(String[] args) {
        // 생성자를 사용하여 3 ~ 33 까지 출력하는 프로그램을 작성해보자!
        System.out.println("3 ~ 33까지 출력!");

        Constructor_Series cs = new Constructor_Series(3, 33);
        cs.printSeries();
    }
}
