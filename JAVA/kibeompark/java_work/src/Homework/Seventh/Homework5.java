package Homework.Seventh;

class MultipleTwoorThree {
    public void Multiple() {
        System.out.print("3부터 33까지 중 2의 배수이거나 3의 배수 :");
        for (int i = 3; i <= 33; i++) {
            if (i % 2 == 0 || i % 3 == 0) {
                System.out.print(" " + i);
            }
        }
    }
}

public class Homework5 {
    public static void main(String[] args) {
        // 5) 3 ~ 33 까지의 숫자 중 2의 배수 또는 3의 배수인 수를 출력해 보자 !
        MultipleTwoorThree mtt = new MultipleTwoorThree();

        mtt.Multiple();
    }
}
