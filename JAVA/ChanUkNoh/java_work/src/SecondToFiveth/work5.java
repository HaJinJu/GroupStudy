package SecondToFiveth;

import java.util.Scanner;

public class work5 {
    public static void main(String[] args) {
//        2의 n승을 판별하는 프로그램을 만들어보자!
//
        Scanner scan = new Scanner(System.in);

        System.out.println("숫자를 입력해주세요");
        int anyNum = scan.nextInt();

        int bitOperateNum = (anyNum - 1) & (anyNum);
        
        if ((anyNum ^ (anyNum + 1)) == (anyNum + (anyNum + 1))) {
            System.out.println("정답");
        } else {
            System.out.println("실패");
        }

    }
}