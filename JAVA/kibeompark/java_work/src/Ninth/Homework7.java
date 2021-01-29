package Ninth;

import Eighth.MySeries;

public class Homework7 {
    public static void main(String[] args) {
        MySeries ms = new MySeries();

        System.out.println("3 ~ 33 까지의 합 = " + ms.valueSum(3, 33));
    }
}

/*
package Homework.Eighth;

class OddSum {
    public OddSum(int start, int end) {
        int sum = 0;

        for (int i = start; i <= end; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }

        System.out.printf("%d 부터 %d 까지의 홀수 합 = %d\n", start, end, sum);
    }
}

public class Homework7 {
    public static void main(String[] args) {
        // 7) 3 ~ 33 까지의 홀수 합산 결과를 출력해 보자 !
        OddSum os = new OddSum(3, 33);
    }
}
 */