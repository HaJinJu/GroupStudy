package Twentieth;

import java.util.ArrayList;

class DupCheck {
    ArrayList<Integer> randArrList;
    int len;
    int[] dupCheck;
    int baseRange;
    int minimalRange;

    public DupCheck(int length, int baseRange, int minimalRange) {
        randArrList = new ArrayList<Integer>();
        dupCheck = new int[baseRange];

        len = length;
        this.baseRange = baseRange;
        this.minimalRange = minimalRange;

        for (int i = 0; i < len; i++) {
            int randNum = (int) (Math.random() * baseRange) + minimalRange;
            randArrList.add(i, randNum);
            if (randArrList.contains(randNum)) {
                dupCheck[randNum - minimalRange]++;
            }
        }
    }

    public void printArr() {
        int cnt = 0;

        for (int i = 0; i < randArrList.size(); i++) {
            System.out.printf("%4d", randArrList.get(i));

            cnt++;

            if (cnt == 10) {
                System.out.println("");

                cnt = 0;
            }
        }

        System.out.println("");

        System.out.println("중복 횟수: ");
        for (int i = 0; i < minimalRange; i++) {

            System.out.printf("%d: %d번\n", i + 20, dupCheck[i]);
        }


    }
}
public class Exercise2 {
    public static void main(String[] args) {
        // 2. 랜덤한 숫자를 200개 생성한다.
        // 숫자의 범위는 20 ~ 60
        // 각각의 숫자들이 몇 개씩 중복되었는지 검사하는 프로그램을 짜보자!
        DupCheck dc = new DupCheck(100, 40, 20);

        dc.printArr();
    }
}
