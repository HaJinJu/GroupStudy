package Eighteenth.FirstTest;

import java.util.Scanner;

public class Q2 {
    int sum=0;
    int subject=3;
    float average = 0f;


    public void printScanner(){
        Scanner scan = new Scanner(System.in);
        System.out.print("영어 점수를 입력하세요 : ");
        int num =scan.nextInt();

        System.out.print("국어 점수를 입력하세요 : ");
        int num2 =scan.nextInt();

        System.out.print("수학 점수를 입력하세요 : ");
        int num3 =scan.nextInt();

        sum+= (num+num2+num3);

        average = sum/(float)subject;

        System.out.println("평균은? "  + average);


    }
}

class Q2class {
    public static void main(String[] args) {


        Q2 Print2 = new Q2();

        Print2.printScanner();
    }
}