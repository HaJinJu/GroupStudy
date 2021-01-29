/*
    < 연습 문제 4 >

사용자 입력으로 시작값을 받고
사용자 입력으로 끝값을 받는다.
그리고 또 다른 사용자 입력을 받는다.
마지막에 입력된 사용자 입력값으로 나눠 떨어지는 숫자들을
시작값과 끝값 사이에서 찾아서 출력하는 매서드를 만들어보자!

 */


import java.util.Scanner;

class InputCalculator {
    int start, end;
    int div;

    public void setStart(int start) {
        this.start = start;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public void setDiv(int div) {
        this.div = div;
    }

    public void FindNum() {
        for(int i = start; i <= end; i++) {
            if(i % div == 0) {
                System.out.printf("%d ", i);
            }
        }
    }
}

public class SeventhTask4 {
    public static void main(String[] args) {
        InputCalculator input = new InputCalculator();
        Scanner scan = new Scanner(System.in);

        System.out.print("시작값을 입력하세요 : ");
        input.setStart(scan.nextInt());

        System.out.print("끝값을 입력하세요 : ");
        input.setEnd(scan.nextInt());

        System.out.print("어떤 수의 배수를 찾을 것인지 입력하세요 : ");
        input.setDiv(scan.nextInt());

        System.out.printf("%d 에서 %d 사이에서 %d (으)로 나누어 떨어지는 수는 다음과 같다.\n", input.start, input.end, input.div);
        input.FindNum();
    }
}
