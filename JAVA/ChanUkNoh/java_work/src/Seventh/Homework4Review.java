package Seventh;

class Switch {
    // 4. 1 ~ 20 까지의 숫자 중 2의 배수이며 3의 배수인 수를 출력해보자!
    // 5. 3 ~ 33까지의 숫자중 2의 배수 또는 3의 배수인 수를 출력 해보자!
    final int AND = 0;
    final int OR = 1;

    public void printTwiceOrder(int start, int end,
                                int orderNum1, int orderNum2,
                                final int ORDER) {

        for (int i = start; i <= end; i++) {

            switch (ORDER) {
                case AND:
                    if (i % orderNum1 == 0 && i % orderNum2 == 0) {
                        System.out.println(i);
                    }
                    break;

                case OR:
                   if (i % orderNum1 == 0 || i % orderNum2 == 0) {
                       System.out.println(i);
                   }
                   break;

                default:
                    System.out.println("잘못된 입력입니다.");
                    break;
            }
        }
    }
}


public class Homework4Review {
    public static void main(String[] args) {

        Switch sw = new Switch();

        sw.printTwiceOrder(1, 20, 2, 3, sw.AND);
        sw.printTwiceOrder(3, 33, 2, 3, sw.OR);
    }
}
