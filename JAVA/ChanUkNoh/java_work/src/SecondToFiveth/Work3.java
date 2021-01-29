package SecondToFiveth;

import java.util.Scanner;

public class Work3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("숫자 입력해주세요");
        int anyNum = scan.nextInt();

        System.out.println(anyNum);

        System.out.println("입력 값은 : " + anyNum);

        if (anyNum % 5 == 1) {
            System.out.println("나머지1");
        } else {


            System.out.println("아님");
        }
    }
}
