package Sixth;

import java.util.Scanner;

public class ArrayFibonacciQuiz {
    public static void main(String[] args) {
        final int FIXVALUE = 1;
        System.out.println("n번째 피보나치 항을 구해보자!");

        Scanner scan = new Scanner(System.in);
        System.out.println("원하는 항을 입력하세요 : ");
        int n = scan.nextInt();
        if(n <= 0){
            System.out.println("잘못된 값을 입력하였습니다!");
            return;
        }else if(n < 3){
            System.out.printf("%d 번째 피보나치 항은 = %d", n, FIXVALUE);
            return;
            // return 이후 현재프로그램은 더이상 동작하지않는다
            //실재로는 매서드를 종료한 것이지만
            //현재는 아직 클래스를 학스하지 않앗으므로
            //main을 종료한다고만 알고잇자
        }
        // 배열을 초기에 개수를 할당할때는 대괄호 안에 개수를 적는다.
        //사용할 때는 0부터 시작한다는 것을 주의하도록 한다.
        int[] arr = new int[n];

        arr[0] = 1;
        arr[1] = 1;

        for(int i =2; i < n; i++){
            arr[i] = arr[i - 1] + arr[i - 2];
            System.out.printf("arr[%d] = %d\n", n, arr[n -1]);


        }
    }
}
