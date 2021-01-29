package Third;

public class Quiz6 {
    public static void main(String[] args) {
        // - 규칙 (20번째)
        //
        // 첫 번째 항 + 세 번째 항 = 네 번째
        // 두 번째 항 + 네 번째 항 = 다섯 번째
        // 1, 1, 3, 4, 5, 8, 12, 17, 25, 37, 54, 79, ...
        final int TARGET = 20;
        final int ALREADY = 3;

        int loop = 0;
        int first = 1, second = 1, third = 3, res = 0;

        while (loop < TARGET - ALREADY) {
            res = first + third;
            first = second;
            second = third;
            third = res;

            loop++;
        }

        System.out.println("20번째 : " + res);
    }
}
// 1 1 3 4 5 8 12 17 25 37 54 79 116 170 249 365 535 784 1149 1684