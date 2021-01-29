package Homework.Seventh;

class MultipleTwoandThree {
    public void Multiple() {
        System.out.print("1부터 20까지 중 2의 배수이면서 3의 배수 :");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.print(" " + i);
            }
        }
    }
}

public class Homework4 {
    public static void main(String[] args) {
        // 4) 1 ~ 20 까지의 숫자 중 2의 배수이고 3의 배수인 수를 출력해 보자 !
        MultipleTwoandThree mtt = new MultipleTwoandThree();

        mtt.Multiple();
    }
}
