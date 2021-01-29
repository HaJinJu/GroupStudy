package JAVA_2021_01_07_Seventh;

public class Homework05 {
    public static void main(String[] args) {
        int cnt = 1;
        // 5) 1 ~ 100 까지 숫자중 3 의 배수만 출력해보자!
        for(int i = 1; i < 100; i++) {
            if(i % 3 == 0) {
                System.out.printf("%3d", i);

                if(cnt % 11 == 0) {
                    System.out.println("");
                }

                cnt++;
            }
        }
    }
}

