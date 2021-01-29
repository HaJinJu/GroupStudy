package SelfStudying;

import java.util.Scanner;

public class DoWhileIsDup {
    public static void main(String[] args) {
        int key;
        do {
            Scanner scanner = new Scanner(System.in);//정수 혹은 실수를 입력받게 하는 것
            System.out.println("1 : 추가, 2 : 삭제, 3 : 검색, 0 : 종료");
            key = scanner.nextInt();// key라는 int형을 가진 변수가 입력을 받게함
            switch(key){
                case 1 :
                    System.out.println("추가 선택");
                    break;
                case 2 :
                    System.out.println("삭제 검색");
                    break;
                case 3 :
                    System.out.println("검색 선택");
                    break;
            }
        }while(key != 0);
        System.out.println("종료");
    }
}
