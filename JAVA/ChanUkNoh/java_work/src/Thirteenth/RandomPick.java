package Thirteenth;

import java.util.HashSet;

public class RandomPick {
    private String[] java_192_A = {"최현정", "장해솔", "박재민", "고동영", "류슬기", "조진형",
            "오진욱", "이정현", "한다은"};
    private String[] java_192_B = {"노찬욱", "박소현", "박기범", "최임식", "탁성진", "하진주",
            "이승윤", "이범진"};

    private final int BIGGERGRP = 5;
    private final int SMALLERGRP = 4;

    private HashSet<String> team1;
    private HashSet<String> team2;
    private HashSet<String> team3;
    private HashSet<String> team4;

    public RandomPick() {
        team1 = new HashSet<String>();
        team2 = new HashSet<String>();
        team3 = new HashSet<String>();
        team4 = new HashSet<String>();
    }

    public void rndAllocA() {
        int randNum;

        for (;;) {
            randNum = (int)(Math.random() * java_192_A.length);
            team1.add(java_192_A[randNum]);

            if (team1.size() == BIGGERGRP) break;
        }

        for (;;) {
            randNum = (int)(Math.random() * java_192_A.length);

            if (team1.contains(java_192_A[randNum])) {
                continue;
            } else {
                team2.add(java_192_A[randNum]);
            }

            if (team2.size() == SMALLERGRP) break;
        }
    }

    public void rndAllocB() {
        int randNum;

        for (;;) {
            randNum = (int)(Math.random() * java_192_B.length);
            team3.add(java_192_B[randNum]);

            if (team3.size() == SMALLERGRP) break;
        }

        for (;;) {
            randNum = (int)(Math.random() * java_192_B.length);

            if (team3.contains(java_192_B[randNum])) {
                continue;
            } else {
                team4.add(java_192_B[randNum]);
            }

            if (team4.size() == SMALLERGRP) break;
        }
    }

    public void printGroupA_List() {
        System.out.println("1조: " + team1);
        System.out.println("2조: " + team2);
    }

    public void printGroupB_List() {
        System.out.println("3조: " + team3);
        System.out.println("4조: " + team4);
    }
}