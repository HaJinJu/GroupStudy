package Homework.Twelveth;

import java.util.Scanner;

import static Homework.Twelveth.Utility.*;

public class Upgrade {
    private PlayGame pg;
    private int level, presentJob;
    private String levelName;
    private Scanner scan;

    public Upgrade() {
        pg = new PlayGame();
        scan = new Scanner(System.in);
        level = 0;
    }

    public void presentLevel() {
        if (presentJob == WARRIOR) {
            if (level == 1) levelName = "전사";
            else if (level == 2) levelName = "워 로드";
        } else if (presentJob == THIEF) {
            if (level == 1) levelName = "도적";
            else if (level == 2) levelName = "어쌔신";
        } else if (presentJob == MAGICIAN) {
            if (level == 1) levelName = "마법사";
            else if (level == 2) levelName = "위자드";
        }

        System.out.printf("%d차 전직에 성공하였습니다. ", level);
        System.out.println("당신의 현재 직업은 " + levelName + " 입니다.");
    }

    public void upgradeCharacter() {
        if (level == 0) {
            System.out.println("때가 되었습니다. 전직하고 싶은 직업을 선택해 주세요.");

            while (true) {
                System.out.println("1. 전사   2. 도적   3. 마법사");
                presentJob = scan.nextInt();

                if (presentJob < 1 || presentJob > 3) {
                    System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
                } else {
                    level++;
                    presentLevel();
                    pg.useSkill2(presentJob);

                    break;
                }
            }
        } else if (level == 1) {
            level++;
            presentLevel();
            pg.useSkill3(presentJob);
        }
    }
}
