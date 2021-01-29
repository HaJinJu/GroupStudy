import java.util.Scanner;

public class LogicalOperation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("숫자를 입력하세요:");
        int num = scan.nextInt();
//
        if ((num % 2 == 0) && (num % 3 == 0)) {
            System.out.println(num + "은 6의 배수이다.");
        } else {
            System.out.println(num + "은 6의 배수가 아니다!");
        }
    }
}

