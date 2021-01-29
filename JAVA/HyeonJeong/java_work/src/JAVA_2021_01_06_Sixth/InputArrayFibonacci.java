package JAVA_2021_01_06_Sixth;

import java.util.Scanner;

public class InputArrayFibonacci {
    public static void main(String[] args) {
        // 문제
        // 위의 코드를 n번째 항을 찾는 형태로 변경해보자!
        final int FIXVALUE = 1;
        Scanner scan = new Scanner(System.in);

        System.out.print("찾고싶은 n번째 항을 입력하세요: ");
        int number = scan.nextInt();

        if(number <= 0) {
            System.out.println("잘못된 입력입니다.");
            return;
        } else if(number < 3) {
            System.out.printf("%d 번째 피보나치 항은 = %d\n",number , FIXVALUE);
            // return 이후 현재 프로그램은 더 이상 동작하지 않는다.
            // 실제로는 매서드를 종료한 것인데
            // 현재는 아직 클래스를 학습하지 않았으므로
            // main을 종료한다고만 알아두자!
            return;
        }

        // 초기에 배열의 개수를 할당할때는 대괄호 안에 개수를 적는다.
        // 사용할 때는 0부터 시작한다는 것을 주의하도록 한다.

        int[] arr = new int[number];

        arr[0] = 1;
        arr[1] = 1;

        for(int i = 2; i < number; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            System.out.printf("arr[%d] = %d\n",i + 1 , arr[i]);
        }
    }
}
