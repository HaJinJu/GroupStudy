package Sixth;

import java.util.Scanner;

public class InputArrayFibonacci {
    public static void main(String[] args) {
        final int FIXVALUE = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("n번째 피보나치 항을 구해보자!");
        int num = scan.nextInt();
        if(num <= 0){
            System.out.println("잘못된 입력입니다.");
        }

        else if(num < 3 ){
            System.out.printf("%d 번째 피보나치 항은 = %d\n", num, FIXVALUE);
            return;
            //return 은 이후 현재 프로그램을 더이상 동작하지 않는다
            // 실제로는 매소드를 종료한 것인데
            // 현재는 아직 클래스 학습하지 않았으므로
            // main 을 종료한다고만 알아두자
        }

        //초기 배열의 개수를 할당할때에는 대괄호 안에 개수를 적는다.
        //사용할 때는 0부터 시작한다는 것을 주
        int [] arr = new int[num];



        arr[0] = 1;
        arr[1] = 1;
        for(int i =2; i < num; i++) {
            arr[i] = arr[i -1] + arr[i -2];
            System.out.printf("arr[%d] = %d\n", num, arr[num -1]);
        }
    }
}
