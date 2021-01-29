package Eighteenth.FirstTest;

import java.util.Scanner;

public class Q1 {

   Scanner scan = new Scanner(System.in);

public void printScanner(){
    System.out.print(" 숫자를 입력하세요 : ");
    int num =scan.nextInt();
    System.out.println(" 입력한 숫자는? "  + num);

    }


}
class Scanners {
    public static void main(String[] args) {

        Q1 Print = new Q1();

        Print.printScanner();
    }
}