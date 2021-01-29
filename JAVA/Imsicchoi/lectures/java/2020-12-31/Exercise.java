import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자를 입력하세요:");
        int num = scan.nextInt();
        if (num > 2000) {
            System.out.println("잘못된 값입니다.");
        } else if (num >= 1530) {
            System.out.println("전진");
        } else if (num > 1470) {
            System.out.println("정지");
        }
        else if (num > 999) {
            System.out.println("후진");}
        else {System.out.println("잘못된 값을 입력했습니다.");

            }
        }
    }
