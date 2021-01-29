package JAVA_2021_01_26_Twentieth;

import java.util.HashSet;

class CheckDuplicateProgram{
    HashSet<Integer> randomHash;
    int[] arrRandom;

    public CheckDuplicateProgram(int end) {
        arrRandom = new int[end];
    }

    public void setArrRandomNum() {
        for(int i = 0; i < arrRandom.length; i++) {
            int randomNum = (int)(Math.random() * 41) + 20;
            arrRandom[i] = randomNum;
        }
    }

    public void setRandomHash() {
        randomHash = new HashSet<Integer>();
        int count = 0;
        for(Integer nonDup : arrRandom) {
            if(!randomHash.add(nonDup)) {
                count++;
                System.out.println("중복숫자: "+ randomHash);
            }
        }
        System.out.printf("중복 횟수: %d", count);
    }
}

public class ComprehensiveExercise2 {
    public static void main(String[] args) {
        System.out.println("2. 랜덤한 숫자를 200개 생성한다. 숫자의 범위는 20 ~ 60 까지로 제한한다.\n" +
                           "   각각의 숫자들이 몇 개씩 중복되었는지 검사하는 프로그램을 작성해보자!\n");
        JAVA_2021_01_26_Twentieth.CheckDuplicateProgram cdp = new JAVA_2021_01_26_Twentieth.CheckDuplicateProgram(200);

        cdp.setArrRandomNum();
        cdp.setRandomHash();
    }
}
