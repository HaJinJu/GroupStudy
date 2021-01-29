package Test;

import java.util.ArrayList;

class RandomAllocArr2 {
    private int randNum;
    private int[] randArr, checkDup;
    private ArrayList<Integer> even;
    private ArrayList<Integer> odd;

    public RandomAllocArr2() {
        randNum = (int) (Math.random() * 10) + 5;

        randArr = new int[randNum];
        checkDup = new int[randNum];

        even = new ArrayList<Integer>();
        odd = new ArrayList<Integer>();
    }

    public void setArr() {
        int random;

        for (int i = 0; ; ) {
            random = (int) (Math.random() * randNum) + 1;

            if (checkDup[random - 1] != 0) {
                continue;
            }

            checkDup[random - 1] = 1;
            randArr[i++] = random;

            if (i == randNum) break;
        }
    }

    public void divArr() {
        for (int i = 0; i < randNum; i++) {
            if (randArr[i] % 2 == 0) {
                even.add(randArr[i]);
            } else {
                odd.add(randArr[i]);
            }
        }
    }

    public void printArr() {
        System.out.println("배열 출력");
        for (int i = 0; i < randNum; i++) {
            System.out.printf("%3d", randArr[i]);
        }
        System.out.println();

        System.out.println("배열 중 짝수 출력");
        for (int i = 0; i < even.size(); i++) {
            System.out.printf("%3d", even.get(i));
        }
        System.out.println();

        System.out.println("배열 중 홀수 출력");
        for (int i = 0; i < odd.size(); i++) {
            System.out.printf("%3d", odd.get(i));
        }
        System.out.println();
    }
}

public class Test19 {
    public static void main(String[] args) {
        // 임의의 난수들을 임의의 배열 크기에 저장하도록 한다.
        // 그리고 이 값들을 출력해 보자 !
        // 또한 여기서 짝수만 따로 홀수만 따로 출력할 수 있게
        // 메서드를 작성해 보도록 한다.
        RandomAllocArr2 raa = new RandomAllocArr2();

        raa.setArr();
        raa.divArr();
        raa.printArr();
    }
}
