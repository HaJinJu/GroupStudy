package SelfStudying;

import java.util.Scanner;

public class MultiScannerCheck {

    public static void main(String[] args) {
        int maxCount = 3;
        int i = 0;
        int cnt = 0;
        Scanner Scan = new Scanner(System.in);
        System.out.println("값을 입력하세요 : ");
        while(Scan.hasNextInt()){
            int num = Scan.nextInt();

            i += num;
            cnt++;
            if(cnt == maxCount){
                System.out.println("total : " + i);
                return;//리턴은 매소드 전체를 빠져나간다.
            }
        }

    }

}

//cannot be referenced from a static context는
// 새로운 인스턴스를 생성하지 않고 냅다 main 매소드에 인스턴스 메소드를 꼴아 박아서 생기는 오류.
// 해결책 : 인스턴스를 하나 만들어 주면 됨.