package Fifth;

public class Homework2 {
    public static void main(String[] args) {
        // 1 ~ 100 까지의 숫자를 모두 더해서 출력해 보자 !
        int i, sum = 0;

        for (i = 1; i <= 100; i++) {
            sum += i;
        }

        System.out.println("1 ~ 100 까지의 합 = " + sum);
    }
}