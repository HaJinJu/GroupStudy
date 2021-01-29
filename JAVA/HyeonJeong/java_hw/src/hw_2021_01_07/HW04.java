package hw_2021_01_07;

public class HW04 {
    public static void main(String[] args) {
        // 1 ~ 20 까지의 숫자 중 2의 배수이고 3의 배수인 수를 출력해보자!

        Series s = new Series();

        System.out.println("1 ~ 20 까지의 숫자 중 2의 배수이고 3의 배수인 수");
        s.printValue(1, 20, 2, 3, s.AND);
    }
}
