package Tenth.Homework;

public class Warrior extends Adventurer implements SkillTree{
    float anger;

    public Warrior(int a, int def, int dex, int intel, int con, int mental, float anger) {
        super(a, def, dex, intel, con, mental);
        this.anger = anger;
    }
    @Override
    public void skill1() {
        System.out.println("파워 슬래시" + (atk + dex)
                *12);

    }

    @Override
    public void skill2() {
        System.out.println("방패 치기"+(atk + def) * 3);
        System.out.println("대상을 1초간 스턴 상태로 만듭니다");

    }

}
