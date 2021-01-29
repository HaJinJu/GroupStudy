package Homework.Twentieth;

import java.util.*;

class RandomArrList {
    private final int FIXVALUE = 200;
    private Random rand;
    private int randNum;

    private ArrayList<Integer> list;
    // private ArrayList<Integer> countNum;
    private Set<Integer> set;

    public RandomArrList() {
        rand = new Random();
        list = new ArrayList<>();
        // countNum = new ArrayList<>();
        set = new HashSet<>();

        for (int i = 0; i < FIXVALUE; i++) {
            randNum = rand.nextInt(41) + 20;

            list.add(randNum);
            set.add(randNum);
        }
    }

    public void printArrList() {
        int cnt = 1;

        for (int i = 0; i < FIXVALUE; i++) {
            System.out.printf("%5d", list.get(i));

            if (cnt % 20 == 0) {
                System.out.println();
            }

            cnt++;
        }
        System.out.println();
    }

    public void checkDup() {
        int number, count;
        int cnt = 1;
/*
        count = 0;

        for (Integer i : list) {
            if (!set.add(i)) {
                count++;
            }
        }
 */

        Iterator e = set.iterator();

        while (e.hasNext()) {
            count = 0;
            number = (int) e.next();

            for (int i = 0; i < FIXVALUE; i++) {
                if (list.get(i) == number) {
                    count++;
                }
            }

            if (count > 1) {
                System.out.printf("%5d : %2d회", number, count);

                if (cnt % 10 == 0) {
                    System.out.println();
                }

                cnt++;
            }
        }

        System.out.println();
    }
}

public class Homework2 {
    public static void main(String[] args) {
        // 2. 랜덤한 숫자를 200개 생성한다.
        //    숫자의 범위는 20 ~ 60 까지로 제한한다.
        //    각각의 숫자들이 몇 개씩 중복되었는지 검사하는 프로그램을 작성해 보자 !
        RandomArrList ral = new RandomArrList();

        ral.printArrList();
        ral.checkDup();
    }
}
