package JAVA_2021_01_07_Seventh;

import java.util.*;

class MatchNumber {
    int start, end;
    int key;

    Scanner scan;

    public void setScan() {
        scan = new Scanner(System.in);
    }
    public void setStart () {
        System.out.print("시작값을 입력하세요: ");
        start = scan.nextInt();
    }

    public void setEnd () {
        System.out.print("끝값을 입력하세요: ");
        end = scan.nextInt();
    }

    public void setkey () {
        System.out.print("나누는 값을 입력하세요: ");
        key = scan.nextInt();
    }

    public void printOrder() {
        System.out.printf("%d ~ %d 숫자중 %d로 나누어 떨어지는 숫자 출력!\n", start, end, key);
        for(int i = start; i < end; i++) {
            if(i % key == 0) {
                System.out.println("결과 = " + i);
            }
        }
    }
}

public class Quiz04 {
    public static void main(String[] args) {
        MatchNumber mn = new MatchNumber();

        mn.setScan();
        mn.setStart();
        mn.setEnd();
        mn.setkey();
        mn.printOrder();
    }
}
