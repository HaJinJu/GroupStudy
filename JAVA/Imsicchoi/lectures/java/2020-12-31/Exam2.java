import java.util.Scanner;

public class Exam2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자를 입력하세요:");
        int num = scan.nextInt();
        System.out.println(num);
//      if ((num & (num -1)) == 0 )
//        2진수 특성상 2의 n승에서 1을 빼면
//        해당 자리수가 0이 되고 나머지 아래의 자릿값은 모두 최대값이 된다.
        if (num == (num & -num)) {
            System.out.println("2의 x승이 이다");
        } else System.out.println("2의 n승이 아니다");
//        0000 1000  8
//        1111 1000 -8      }
//
    }
}


