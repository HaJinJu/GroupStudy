package Homework.Twelveth;

import java.util.Scanner;

import static Homework.Twelveth.Utility.*;

public class PlayGame {
    private Adventurer ad;
    private Warrior war;
    private WarLoad wl;
    private Thief t;
    private Assassin ass;
    private Magician mag;
    private Wizard wiz;

    private static int skillNum, presentjob;
    private Scanner scan;

    public PlayGame() {
        ad = new Adventurer();
        war = new Warrior();
        wl = new WarLoad();
        t = new Thief();
        ass = new Assassin();
        mag = new Magician();
        wiz = new Wizard();

        scan = new Scanner(System.in);
    }

    public void useSkill1() {
        System.out.println("당신은 모험가 입니다.");
        System.out.println("사용할 스킬을 선택하세요.");

        while (true) {
            System.out.println("1. 주먹   2. 발");
            skillNum = scan.nextInt();

            if (skillNum < 1 || skillNum > 6) {
                System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
            } else if (skillNum <= 2) {
                ad.skill1(skillNum);
                break;
            } else if (skillNum <= 4) {
                ad.skill2(skillNum);
                System.out.println("다시 입력하세요.");
            } else if (skillNum <= 6) {
                ad.skill3(skillNum);
                System.out.println("다시 입력하세요.");
            }
        }
    }

    public void useSkill2(int presentjob) {
        System.out.println("사용할 스킬을 선택하세요.");
        this.presentjob = presentjob;

        switch (presentjob) {
            case WARRIOR:
                warriorSkill();
                break;
            case THIEF:
                thiefSkill();
                break;
            case MAGICIAN:
                magicianSkill();
                break;
        }
    }

    public void useSkill3(int presentjob) {
        System.out.println("사용할 스킬을 선택하세요.");
        this.presentjob = presentjob;

        switch (presentjob) {
            case WARRIOR:
                warloadSkill();
                break;
            case THIEF:
                assassinSkill();
                break;
            case MAGICIAN:
                wizardSkill();
                break;
        }
    }

    public void warriorSkill() {
        while (true) {
            System.out.println("1. 주먹   2. 발   3. 전사 1   4. 전사 2");
            skillNum = scan.nextInt();

            if (skillNum == 1 || skillNum == 2) {
                war.skill1(skillNum);
                break;
            } else if (skillNum == 3 || skillNum == 4) {
                war.skill2(skillNum);
                break;
            } else if (skillNum == 5 || skillNum == 6) {
                war.skill3(skillNum);
                System.out.println("다시 입력하세요.");
            } else {
                System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
            }
        }
    }

    public void thiefSkill() {
        while (true) {
            System.out.println("1. 주먹   2. 발   3. 도적 1   4. 도적 2");
            skillNum = scan.nextInt();

            if (skillNum == 1 || skillNum == 2) {
                t.skill1(skillNum);
                break;
            } else if (skillNum == 3 || skillNum == 4) {
                t.skill2(skillNum);
                break;
            } else if (skillNum == 5 || skillNum == 6) {
                t.skill3(skillNum);
                System.out.println("다시 입력하세요.");
            } else {
                System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
            }
        }
    }

    public void magicianSkill() {
        while (true) {
            System.out.println("1. 주먹   2. 발   3. 마법사 1   4. 마법사 2");
            skillNum = scan.nextInt();

            if (skillNum == 1 || skillNum == 2) {
                mag.skill1(skillNum);
                break;
            } else if (skillNum == 3 || skillNum == 4) {
                mag.skill2(skillNum);
                break;
            } else if (skillNum == 5 || skillNum == 6) {
                mag.skill3(skillNum);
                System.out.println("다시 입력하세요.");
            } else {
                System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
            }
        }
    }

    public void warloadSkill() {
        while (true) {
            System.out.println("1. 주먹   2. 발   3. 전사 1   4. 전사 2   5. 전사 3   6. 전사 4");
            skillNum = scan.nextInt();

            if (skillNum == 1 || skillNum == 2) {
                war.skill1(skillNum);
                break;
            } else if (skillNum == 3 || skillNum == 4) {
                war.skill2(skillNum);
                break;
            } else if (skillNum == 5 || skillNum == 6) {
                war.skill3(skillNum);
                break;
            } else {
                System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
            }
        }
    }

    public void assassinSkill() {
        while (true) {
            System.out.println("1. 주먹   2. 발   3. 도적 1   4. 도적 2   5. 도적 3   6. 도적 4");
            skillNum = scan.nextInt();

            if (skillNum == 1 || skillNum == 2) {
                ass.skill1(skillNum);
                break;
            } else if (skillNum == 3 || skillNum == 4) {
                ass.skill2(skillNum);
                break;
            } else if (skillNum == 5 || skillNum == 6) {
                ass.skill3(skillNum);
                break;
            } else {
                System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
            }
        }
    }

    public void wizardSkill() {
        while (true) {
            System.out.println("1. 주먹   2. 발   3. 마법사 1   4. 마법사 2   5. 마법사 3   6. 마법사 4");
            skillNum = scan.nextInt();

            if (skillNum == 1 || skillNum == 2) {
                wiz.skill1(skillNum);
                break;
            } else if (skillNum == 3 || skillNum == 4) {
                wiz.skill2(skillNum);
                break;
            } else if (skillNum == 5 || skillNum == 6) {
                wiz.skill3(skillNum);
                break;
            } else {
                System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
            }
        }
    }

    public void continueGame() {
        int continueGame;

        System.out.print("전직을 모두 완료하였습니다. ");

        while (true) {
            System.out.println("게임을 지속하시겠습니까?");
            System.out.println("1. 계속   2. 종료");
            continueGame = scan.nextInt();

            if (continueGame == 1) {
                useSkill3(presentjob);
            } else if (continueGame == 2) {
                System.out.println("게임을 종료합니다.");
                break;
            } else {
                System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
            }
        }
    }
}
