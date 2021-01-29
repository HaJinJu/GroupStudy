package Homework.Twelveth;

public class Adventurer implements Skills{
    @Override
    public void skill1(int num) {
        if (num == 1) System.out.println("주먹 스킬 (데미지 10)");
        else if (num == 2) System.out.println("발 스킬 (데미지 20)");
    }

    @Override
    public void skill2(int num) {
        System.out.println("1차 전직 후 배울 수 있는 기술 입니다.");
    }

    @Override
    public void skill3(int num) {
        System.out.println("2차 전직 후 배울 수 있는 기술 입니다.");
    }
}
