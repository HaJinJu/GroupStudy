package Seventeenth;

import java.util.Scanner;

public class InputNum {
    Scanner scan = new Scanner(System.in);
    int sum;
    int studentNum;
    float avg;

    public void printNum(){
        System.out.println("아무 숫자나 입력하시오 =");
        int num = scan.nextInt();
        System.out.println("입력한 숫자 :"+ num);
    }

    public void setScore(int studentNum){
        this.studentNum= studentNum;
      int[] score = new int[studentNum];
      System.out.println("아무 숫자나 입력하시오 =");
      for (int i = 0; i< studentNum; i++){
          int num = scan.nextInt();
          score[i] = num;
          System.out.printf("%d번학생 = %d점\n",i,score[i]);
          sum += score[i];
      }
        System.out.println("총합은 ="+ sum);
    }

    public void averageScore(){
        float avg = sum/studentNum;
        this.avg = avg;
        System.out.println("평균입니다 = " + avg);
    }
}
