package JAVA_2020_12_29_First;

import  java.util.Scanner;

class Homework{
static final int SUBJECT_SIZE = 3;
    public static void main(String[] args) {
//		1.
        int number = 5;
        String isnumber = (number > 0) ? "양수" : "음수";
        System.out.printf("1.<삼항연산자 사용>\n %d는 양수/음수입니까?\n",number);
        System.out.printf(" = %s입니다.\n\n", isnumber);

//      1-1.
        System.out.printf("1-1.<if문 사용>\n %d는 양수/음수입니까?\n",number);
        if (number > 0){
            System.out.printf(" = 양수입니다.\n\n");
        } else {
            System.out.printf(" = 음수입니다.\n\n");
        }

//      2.
        int year = 2020;
        String isYear = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)? "윤년" : "판년";
        System.out.printf("2.<삼항연산자 사용>\n %d는 윤년/판년입니까\n", year);
        System.out.printf(" = %s입니다.\n\n",isYear);

//      2-2.
        System.out.printf("2-1.<if문 사용>\n %d는 윤년/판년입니까?\n", year);
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.printf(" = 윤년입니다.\n\n");
        } else {
            System.out.printf(" = 판년입니다.\n\n");
        }

//      3.
        int kor = 70;
        int eng = 40;
        String isTest = (kor >= 60 && eng >= 60)? "통과" : "과락";
        System.out.printf("3.<삼항연산자 사용>\n (영어,수학)시험은 통과/과락입니까?\n");
        System.out.printf(" = %s입니다.\n\n",isTest);

//      4~5.
        System.out.println("4~5.<if문 사용>\n 국어, 영어, 수학의 총점, 평균, 등급을 구하세요.\n");
        Scanner scanner = new Scanner(System.in);

        System.out.print(" 국어점수를 입력하세요 : ");
        int korean = scanner.nextInt();
        while(korean < 0 || korean > 100 ) {
            System.out.print(" 잘못된 점수입니다, 다시 입력하세요 :");
            korean = scanner.nextInt();
        }

        System.out.print(" 영어점수를 입력하세요 : ");
        int english = scanner.nextInt();
        while(english < 0 || english > 100 ) {
            System.out.print(" 잘못된 점수입니다, 다시 입력하세요 :");
            english = scanner.nextInt();
        }

        System.out.print(" 수학점수를 입력하세요 : ");
        int math = scanner.nextInt();
        while(math < 0 || math > 100 ) {
            System.out.print(" 잘못된 점수입니다, 다시 입력하세요 :");
            math = scanner.nextInt();
        }

        int sum = (korean + english + math);
        double average = sum / (double)SUBJECT_SIZE;

        char grade;

        if(average > 90) {
            grade = 'A';
        }else if(average > 80) {
            grade = 'B';
        }else if(average > 70) {
            grade = 'C';
        }else if(average > 60) {
            grade = 'D';
        }else {
            grade = 'F';
        }

        System.out.printf("\n 국어: %d점 영어: %d점 수학: %d점\n",korean ,english, math);
        System.out.printf(" 총점: %d점 평균 %.2f점 등급: %c학점\n", sum, average, grade);
        scanner.close();
    }
}

