package SelfStudying;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Break {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean check = true;
        int sum = 0;
        int num = 0;
        ArrayList<String> c = new ArrayList<String>();
        c.add("y");
        c.add("Y");
        String d;
        String s;
        System.out.println("입력한 양의 정수의 합을 계산합니다. 음수를 입력하면 끝남");
        while(check){
            System.out.println("값을 입력하세요 : ");
            num = scan.nextInt();
            if(num < 0){
                System.out.println("음수를 입력하였군요. 작업을 완료할게요.");
                break;
            }
            sum += num;
            System.out.println("계속 입력(Y)");
            d = scan.next();
            if(d.equals("y") || d.equals("Y")){
                System.out.println("계속 진행합니다.");
            }else{
                System.out.println("입력한 양의 정수의 총 합은 "+ sum);
                return;
            }

        }
        System.out.println("입력한 양의 정수의 총 합은 "+ sum);
    }
}
