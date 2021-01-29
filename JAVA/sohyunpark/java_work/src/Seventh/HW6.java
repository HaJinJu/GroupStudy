package Seventh;

import java.util.Scanner;

class noArrayFibonacci{
    Scanner scan;
    int first = 1, second = 1, res = 0;
    int input;

    public void setScan() {
        scan = new Scanner(System.in);
    }

    public void setRes(){
        System.out.println("몇 번째 항을 찾을까요? : ");
        input = scan.nextInt();

        if (input <= 0){
            System.out.println("잘못된 입력입니다.");
            return;
        }
    }

    public int getRes(){
       if ((input == 1) || (input == 2)){
           return 1;
       }

       int i = 2;
       while(i < input){
            res = first + second;
            first = second;
            second = res;

            i++;
        }
       return res;
    }

}

public class HW6 {
    public static void main(String[] args) {
        // 피보나치 수열을 배열 없이 만들어서 출력해보자
        noArrayFibonacci no = new noArrayFibonacci();

        no.setScan();
        no.setRes();

        System.out.println("찾는 값 : "+ no.getRes());
    }
}
