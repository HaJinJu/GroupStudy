package JAVA_2021_01_15_Thirteenth;

public class Mage extends Adventurer implements SkillTree{
    int mana;

    public Mage(int atk, int def, int dex, int intel,
                int hp, int mental, int mana) {

        super(atk, def, dex, intel, hp, mental);
        this.mana = mana;
    }

    @Override
    public void skill1() {
        System.out.println("파이어 스피어: " + intellect * 10);
        System.out.println("스킬 적중시 타켓에게 3초간 화상 피해: 지능 수치 * 0.3");
    }

    @Override
    public void skill2() {
        System.out.println("프로즌 필드: " + intellect * 3);
        System.out.println("자신 주변의 범위(300)내의 모든 적: 이동 속도 20% 감소");
    }
}
