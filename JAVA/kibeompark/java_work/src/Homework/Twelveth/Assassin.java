package Homework.Twelveth;

public class Assassin extends Adventurer implements Skills {
    @Override
    public void skill1(int num) {
        super.skill1(num);
    }

    @Override
    public void skill2(int num) {
        super.skill2(num);
    }

    @Override
    public void skill3(int num) {
        if (num == 5) System.out.println("도적 스킬 1 (데미지 177)");
        else if (num == 6) System.out.println("도적 스킬 2 (데미지 207)");
    }
}
