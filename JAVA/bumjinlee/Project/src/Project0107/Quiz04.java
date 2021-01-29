package Project0107;

import java.util.Scanner;

class Order {
    int start, end;
    int divNum;

    Scanner scan;

    public void setScan() {
        scan = new Scanner(System.in);
        }

        public void setStart() {
        System.out.println("시작 값을 입력하세요 : ");
        start = scan.nextInt();
    }
    public void setEnd() {
        System.out.println("끝 값을 입력하세요 : ");
        end = scan.nextInt();
    }

    public void divNum() {
        System.out.println("나누는 숫자를 입력하세요");
        divNum = scan.nextInt();
    }

    public void printOrder() {
            System.out.printf(
                    "%d ~ %d 숫자중 %d 로 나눠 떨어지는 숫자 출력!\n",
                    start, end, divNum);

            for(int i = start; i <= end; i++) {
                if(i % divNum == 0) {
                    System.out.println("결과 = " + i);
                }
        }
    }
}

public class Quiz04 {
    public static void main(String[] args) {
        /*4) 사용자 입력으로 시작값을 받고
        사용자 입력으로 끝값을 받는다.
        그리고 또 다른 사용자 입력을 받는다.
        마지막에 입력된 사용자 입력값으로 나눠 떨어지는 숫자들을
        시작값과 끝값 사이에서 찾아서 출력하는 매서드를 만들어보자!
         */
        Order po = new Order();

        po.setScan();
        po.setStart();
        po.setEnd();
        po.divNum();
        po.printOrder();

    }
}
