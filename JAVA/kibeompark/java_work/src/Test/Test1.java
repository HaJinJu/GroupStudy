package Test;

import java.util.Scanner;

class InputClass {
    private int input;
    private Scanner scan;

    public InputClass() {
        scan = new Scanner(System.in);

        System.out.print("아무 숫자나 입력하세요. ");
        input = scan.nextInt();
    }

    public int getInput() {
        return input;
    }
}

public class Test1 {
    public static void main(String[] args) {
        // 클래스를 사용하여 사용자 입력을 받는 프로그램을 작성해 보자 !
        InputClass ic = new InputClass();

        System.out.println("입력한 값 : " + ic.getInput());
    }
}
