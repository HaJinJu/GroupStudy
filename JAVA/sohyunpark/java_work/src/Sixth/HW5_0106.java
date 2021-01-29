package Sixth;

public class HW5_0106 {
    public static void main(String[] args) {
       // 1 ~ 100까지의 숫자 중 3의 배수 출력
        int Num = 1;

        while(Num <= 100){
            if(Num % 3 == 0){
                System.out.printf("%d\n", Num);
            }

            Num++;
        }
    }
}

        // int cnt = 1;

        // for (int i = 0; i < 100; i++) {
            // if(i % 3 == 0) {
                // System.out.printf("%3d", i);

                // if (cnt % 11 == 0) {
                    // SYstem.out.println("");
                // }

            // cnt++;
        // }