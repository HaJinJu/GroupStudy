package Homework.Eighth;

public class MySeries {
    public MySeries (int start, int end) {
        int cnt = 1;

        System.out.printf("숫자 %d ~ %d\n", start, end);
        for (int i = start; i <= end; i++) {
            System.out.printf("%3d", i);

            if (cnt % 10 == 0) {
                System.out.println();
            }
            cnt++;
        }
    }

    public MySeries (int start, int end, int orderNum) {
        System.out.printf("숫자 %d ~ %d 중 %d의 배수\n", start, end, orderNum);
        for (int i = start; i <= end; i++) {
            if (i % orderNum == 0) {
                System.out.printf("%3d", i);
            }
        }
    }
}
