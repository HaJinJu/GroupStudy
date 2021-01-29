package FirstRegularTest;

import java.util.Scanner;

//1. 클래스를 사용하여 사용자 입력을 받는 프로그램을 작성해보자!
class Input{
    private String input;
    private String result;
    public Input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("아무 말이나 입력하시오");
        result = scan.next();

    }
    public String getInput(){
        return result;
    }
}
public class First {
    public static void main(String[] args) {
        Input ip = new Input();

        System.out.println("결과 : " + ip.getInput());
    }
}
