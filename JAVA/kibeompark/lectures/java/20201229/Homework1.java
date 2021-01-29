import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        // 과제 1
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력하세요 : ");
        int n = sc.nextInt();
        String nStr = (n >= 0) ? "양수" : "음수";

        System.out.println();
        System.out.println("삼항 연산자 : " + n + "은(는) " + nStr);
        System.out.println();

        if (n >= 0) nStr = "양수";
        else nStr = "음수";

        System.out.println("if 문 : " + n + "은(는) " + nStr);
        System.out.println();

        // 과제 2
        System.out.print("연도를 입력하세요 : ");
        int year = sc.nextInt();
        String yearStr = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? "윤년" : "평년";

        System.out.println();
        System.out.println("삼항 연산자 : " + year + "년은 " + yearStr);
        System.out.println();

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) yearStr = "윤년";
        else yearStr = "평년";

        System.out.println("if 문 : " + year + "년은 " + yearStr);
        System.out.println();

        // 과제 3
        int k = 70, e = 40;
        String Str = (k >= 60 && e >= 60) ? "통과" : "과락";

        System.out.println("kor : " + k + " , eng : " + e + ", 결과 : "+Str);
        System.out.println();

        // 과제 4, 5
        int kor, eng, math, sum;
        double avg;
        char level, repeat;

        while (true) {
            do {
                System.out.print("국어 점수를 입력하세요 : ");
                kor = sc.nextInt();
            } while (kor < 0 || kor > 100);

            do {
                System.out.print("영어 점수를 입력하세요 : ");
                eng = sc.nextInt();
            } while (eng < 0 || eng > 100);

            do {

                System.out.print("수학 점수를 입력하세요 : ");

                math = sc.nextInt();

            } while (math < 0 || math > 100);
            System.out.println();

            sum = kor + eng + math;
            avg = sum / 3.0;

            if (avg > 100 || avg < 0) System.out.println("점수 오류");
            else {
                if (avg >= 90) level = 'A';
                else if (avg >= 80) level = 'B';
                else if (avg >= 70) level = 'C';
                else if (avg >= 60) level = 'D';
                else level = 'F';

                System.out.println("총점 : " + sum + "점");
                System.out.printf("평균 : " + "%.2f" + "점\n", avg);
                System.out.println("등급 : " + level);
                System.out.println();
            }

            System.out.print("점수를 다시 입력하시겠습니까 ? (Y / N) ");
            repeat = sc.next().charAt(0);

            if (repeat == 'Y' || repeat == 'y') continue;
            else if (repeat == 'N' || repeat == 'n') {
                System.out.println("감사합니다.");
                break;
            }
        }
    }
}