package Homework.Twelveth;

public class Wizard extends Magician implements Skills {
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
        if (num == 5) System.out.println("마법사 스킬 3 (데미지 173)");
        else if (num == 6) System.out.println("마법사 스킬 4 (데미지 210)");
    }
}
