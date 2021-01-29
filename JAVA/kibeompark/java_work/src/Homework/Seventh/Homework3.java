package Homework.Seventh;

class MultipleTwo {
    public void Multiple() {
        System.out.print("1부터 20까지 중 2의 배수 :");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(" " + i);
            }
        }
    }
}


public class Homework3 {
    public static void main(String[] args) {
        // 3) 1 ~ 20 까지의 숫자 중 2의 배수를 출력하도록 메서드를 만들어 보자 !
        MultipleTwo mt = new MultipleTwo();

        mt.Multiple();
    }
}
