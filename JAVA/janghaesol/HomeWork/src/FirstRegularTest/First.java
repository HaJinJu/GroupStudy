package FirstRegularTest;

import java.util.Scanner;
class Scanning{
    Object ansWer;
    int Num;

    public void scan(){
        Scanner scan = new Scanner(System.in);
        System.out.println("어떤 말이든 입력해주세요 : ");
        ansWer = scan.next();
        System.out.println("당신이 입력한 타이핑은 : " + ansWer + "입니다.");
    }
}
public class First {
    public static void main(String[] args) {
        Scanning ft = new Scanning();

        ft.scan();
    }
}
