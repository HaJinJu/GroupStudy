package SecondToFiveth;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("아무 숫자 입력해주세요");

        int num = scan.nextInt();

        System.out.println("입력 값은 : " + num);

        if(num % 5 == 1) {
            System.out.println(num + "은 5로 나눠서 1이남는다.");
        } else {
            System.out.println(num + "은 5로 나눠서 1이 남지 않는다.");
        }
    }
}
