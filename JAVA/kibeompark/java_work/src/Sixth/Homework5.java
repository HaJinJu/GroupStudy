package Sixth;

public class Homework5 {
    public static void main(String[] args) {
        System.out.print("1 ~ 100 까지의 숫자 중 3의 배수 :");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0)
                System.out.print(" " + i);
        }
    }
}
