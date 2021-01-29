package hw_2021_01_07;

public class HW05 {
    public static void main(String[] args) {
        // 3 ~ 33 까지의 숫자중 2의 배수 또는 3의 배수인 수를 출력해보자!
        Series s = new Series();

        System.out.println("3 ~ 33 까지의 숫자중 2의 배수 또는 3의 배수인 수");
        s.printValue(1, 30, 2, 3, s.OR);
    }
}
