import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자를 입력하세요:");
        int num = scan.nextInt();
        System.out.println(num);

        if (num % 5 == 1) {
            System.out.println("나머지가 1이 된다");
        } else {
            System.out.println("나머지가 1이 아니다");

        }
    }
}
