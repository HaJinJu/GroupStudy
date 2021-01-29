package Homework.Twelveth;

public class WarLoad extends Warrior implements Skills{
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
        if (num == 5) System.out.println("스킬 스킬 3 (데미지 180)");
        else if (num == 6) System.out.println("스킬 스킬 4 (데미지 200)");
    }
}
