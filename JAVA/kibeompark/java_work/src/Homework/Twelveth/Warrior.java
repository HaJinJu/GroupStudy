package Homework.Twelveth;


public class Warrior extends Adventurer implements Skills {
    private int skillNum;

    public Warrior() {
    }

    @Override
    public void skill1(int num) {
        super.skill1(num);
    }

    @Override
    public void skill2(int num) {
        if (num == 3) System.out.println("스킬 1 (데미지 70)");
        else if (num == 4) System.out.println("스킬 2 (데미지 100)");
    }

    @Override
    public void skill3(int num) {
        super.skill3(num);
    }
}
