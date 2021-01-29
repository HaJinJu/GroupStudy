package Twelfth.TwelfthHomework;

import java.util.Scanner;

import static Twelfth.Utility.*;

public class Upgrade {
    private Player player;
    private Scanner scan;
    private int grade;
    private int typeOfClass;
    private String myClass;

    public Upgrade(Player player) {
        this.player = player;
        scan = new Scanner(System.in);
        grade = player.getGrade();
        typeOfClass = player.getTypeOfClass();
        myClass = player.getMyClass();
    }

    private void notifyUpgrade() {
        if (typeOfClass == WORRIOR) {
            if (grade == 0) myClass = "전사";
            if (grade == 1) myClass = "워 로드";

            player.setGrade(++grade);
            System.out.println("축하합니다!" + myClass + "로 전직하셨습니다.");
            System.out.println("새로운 기술을 배웠습니다.");

            Worrior worrior = new Worrior();
            GameStart gs = new GameStart(worrior, typeOfClass);
        } else if (typeOfClass == THIEF) {
            if (grade == 0) myClass = "도적";
            if (grade == 1) myClass = "어쌔신";

            player.setGrade(++grade);
            System.out.println("축하합니다!" + myClass + "로 전직하셨습니다.");
            System.out.println("새로운 기술을 배웠습니다.");

            Thief thief = new Thief();
            GameStart gs = new GameStart(thief, typeOfClass);

        } else if (typeOfClass == MAGICIAN) {
            if (grade == 0) myClass = "마법사";
            if (grade == 1) myClass = "위자드";

            player.setGrade(++grade);
            System.out.println("축하합니다!" + myClass + "로 전직하셨습니다.");
            System.out.println("새로운 기술을 배웠습니다.");

            Magician magician = new Magician();
            GameStart gs = new GameStart(magician, typeOfClass);
        } else {
            System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
            return;
        }
    }

    public void upgradeClass() {

        if (grade == 1) {
            notifyUpgrade();
        }

        if (grade == 0) {
            System.out.println("1차 전직이 가능합니다.");
            System.out.println("전직하고싶은 클래스를 입력해주세요.");
            System.out.println("전사: 1  도적: 2  마법사: 3");
            typeOfClass = scan.nextInt();

            player.setTypeOfClass(typeOfClass);

            notifyUpgrade();
        }
    }
}
