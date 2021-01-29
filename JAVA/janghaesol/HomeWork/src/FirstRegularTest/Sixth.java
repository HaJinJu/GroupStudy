package FirstRegularTest;

import java.util.Scanner;

class electronic{
    String iTem;

    public void scan(){
        Scanner scan = new Scanner(System.in);
        System.out.print("확인하고자하는 제품을 입력하세요 : ");
        iTem = scan.next();
    }
    public void checkMaxRange(){
        if(iTem.equals("휴대폰")||iTem.equals("핸드폰")){
            System.out.println("해당 제품은 전자제품이 맞습니다.");
        }else{
            System.out.println("해당 제품은 전자제품이 아닙니다.");
        }
    }
}
public class Sixth {
    //휴대폰은 전자제품임을 표현하는 코드를 작성해보자폰
    public static void main(String[] args) {
        electronic Ec = new electronic();

        Ec.scan();
        Ec.checkMaxRange();
    }
}
