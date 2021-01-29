package Sixth;

import java.util.Scanner;

public class ArrayFibonacci {
    public static void main(String[] args) {
        //피보나치 수열을 프로그래밍으로 구현
        // 구체적으로 13번째 항의 숫잘르 구하도록 하자
        // 1, 1, 2, 3, 5, 8 ,13, 21 ....
//        System.out.println("13번째 피보나치항을 구해보자");
//
//        int[] arr = new int[13];
//        arr[0] = 1;
//        arr[1] = 1;
//        for(int i = 2; i < arr.length; i++){
//            arr[i] = arr[i-1] +arr[i-2];
//            System.out.printf("arr[%d] = %d\n", i, arr[i]);
    //}

            //문제
            //위의 코드를 n번째 항을 찾는 형태로 변경해보자자
        final int FIXVALUE= 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("값 입력 = ");
        int num = scan.nextInt();

        if(num<=0){
            System.out.println("잘못 입력 되었습니다");
        return;
        }else if(num <3){
            System.out.printf("%d 번째 피보나치 항은 = %d\n", num, FIXVALUE);
            //return 이후 현재 프로그램은 더 이상 동작하지 않는다.
            //실제로는 매서드를 종료한 것인대
            //현재는 아직 클래스 학습하지 않았으므로
            //main 을 종요한다고만 알아두자!
            return;
        }
        //초기에 배열의 개수를 할당할때는 대괄호 안에 개수를 적는다.
        //사용할 때는 0부터 시작한다는 것을 주의하도록한다.
        int[] arr = new int[num];

        arr[0] = 1;
        arr[1] = 1;
        for(int i=2; i< num; i++){
            arr[i] = arr[i-1] + arr[i-2];

        }
        System.out.printf("%d 번째 피보나치 항은 = %d\n", num,arr[num-1]);

   }
}
