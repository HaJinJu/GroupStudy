import java.util.Scanner;

public class Switch  {
    public static void main(String[] args) {
        System.out.println("Switch 문을 배워봅시다.");

        Scanner scan = new Scanner(System.in);

        System.out.println("점수를 입력하세요");
        int num = scan.nextInt();

        int fnum = (int)(num / 10.0f);
        System.out.println("실수형을 정수형으로 만든 값 = " + fnum);
//        90~100 = A , 80 ~ 90 = B , 70 ~ 80 = C , 60~ 70= D, 0~60 = F
//        90~100 / 10

        switch (fnum) {
            case 10:
            case 9:
                System.out.println("당신의 등급은 A");
                break;
            case 8:
                System.out.println("당신의 등급은 B");
                break;
            case 7:
                System.out.println("당신의 등급은 C");
                break;
            case 6:
                System.out.println("당신의 등급은 D");
                break;
            default:
                System.out.println("당신의 등급은 F");
                break;


        }
    }
}
