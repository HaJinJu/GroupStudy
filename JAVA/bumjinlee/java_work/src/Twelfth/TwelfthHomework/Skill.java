package Twelfth.TwelfthHomework;

import java.util.Scanner;

import static Twelfth.Utility.*;

public class Skill implements SkillProcessor {
    private Scanner scan;
    private Player player;

    public Skill(Player player) {
        this.player = player;
        scan = new Scanner(System.in);
    }
    public void skill1() {
        System.out.println("스킬을 사용합니다. 어떤 스킬을 사용할까요?");
        System.out.println("때리기: 1   발차기: 2");
        int num = scan.nextInt();
        if (num == 1) System.out.println("때리기 - 데미지 30");
        if (num == 2) System.out.println("발차기 - 데미지 40");
    }

    public void skill2(Object obj, int CLASS) {
        if (isAvailable(1)) {
            if (isSameClass(CLASS)) {
                switch (CLASS) {
                    case WORRIOR:
                        exeWorriorSkill(obj);
                        break;

                    case THIEF:
                        exeThiefSkill(obj);
                        break;

                    case MAGICIAN:
                        exeMagicianSkill(obj);
                        break;

                    default:
                        break;
                }
            } else {
                System.out.println("알맞은 클래스가 아닙니다.");
            }
        } else {
            System.out.println("1차 전직 후에 사용 가능합니다.");
        }
    }

    public void skill3(Object obj, int CLASS) {
        if (isAvailable(2)) {
            if (isSameClass(CLASS)) {
                switch (CLASS) {
                    case WORRIOR:
                        exeWorriorSkill(obj);
                        break;

                    case THIEF:
                        exeThiefSkill(obj);
                        break;

                    case MAGICIAN:
                        exeMagicianSkill(obj);
                        break;

                    default:
                        break;
                }
            } else {
                System.out.println("알맞은 클래스가 아닙니다.");
            }
        } else {
            System.out.println("2차 전직 후에 사용 가능합니다.");
        }
    }

    private boolean isSameClass(int CLASS) {
        return player.getTypeOfClass() == CLASS;
    }

    private boolean isAvailable(int grade) {
        return player.getGrade() >= grade;
    }

    private void exeWorriorSkill(Object obj) {
        Worrior worrior = (Worrior) obj;
        System.out.println("스킬을 사용합니다. 어떤 스킬을 사용할까요?");
        int num;

        if (isAvailable(2)) {
            System.out.println("휠 윈드: 1   방패 강타: 2");
            num = scan.nextInt();
            if (num == 1) worrior.whirlWind();
            else if (num == 2) worrior.shieldSmash();
            else System.out.println("잘못된 입력입니다.");
            return;
        }

        if (isAvailable(1)) {
            System.out.println("베기: 1   찌르기: 2");
            num = scan.nextInt();
            if (num == 1) worrior.slash();
            else if (num == 2) worrior.thrust();
            else System.out.println("잘못된 입력입니다.");
            return;
        }
    }

    private void exeMagicianSkill(Object obj) {
        Magician magician = (Magician) obj;
        System.out.println("스킬을 사용합니다. 어떤 스킬을 사용할까요?");
        int num;

        if (isAvailable(2)) {
            System.out.println("블리자드: 1   메테오: 2");
            num = scan.nextInt();
            if (num == 1) magician.blizzard();
            else if (num == 2) magician.meteor();
            else System.out.println("잘못된 입력입니다.");

            return;
        }

        if (isAvailable(1)) {
            System.out.println("파이어 볼트: 1   썬더 볼트: 2");
            num = scan.nextInt();
            if (num == 1) magician.fireBolt();
            else if (num == 2) magician.thunderBolt();
            else System.out.println("잘못된 입력입니다.");

            return;
        }
    }

    private void exeThiefSkill(Object obj) {
        System.out.println("스킬을 사용합니다. 어떤 스킬을 사용할까요?");
        Thief thief = (Thief) obj;
        int num;

        if (isAvailable(2)) {
            System.out.println("암살: 1   독: 2");
            num = scan.nextInt();
            if (num == 1) thief.assassination();
            else if (num == 2) thief.poison();
            else System.out.println("잘못된 입력입니다.");

            return;
        }

        if (isAvailable(1)) {
            System.out.println("백 어택: 1   더블 어택: 2");
            num = scan.nextInt();
            if (num == 1) thief.backAttack();
            else if (num == 2) thief.doubleAttack();
            else System.out.println("잘못된 입력입니다.");

            return;
        }
    }
}
