package 정기역략평가01;

import java.util.Scanner;

class Insert{
    private Scanner scan;

    public void insert(){
    System.out.print("입력값을 입력하세요 : ");
    scan = new Scanner(System.in);

    String str = scan.nextLine();
    System.out.println(str + " 이/가 입력 되었습니다.");

        }
}


public class Exercise01 {
    public static void main(String[] args) {
        Insert ins = new Insert();
        ins.insert();

    }
}

