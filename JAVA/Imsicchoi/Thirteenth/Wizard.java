package Thirteenth;

public class Wizard extends Mage{
    int amp;

    public Wizard(int str, int dex, int anInt, int hp, int mp, int amp) {
        super(str, dex, anInt, hp, mp);
        this.amp = amp;
    }

    @Override
    public void Skill2() {
        System.out.println("썬더볼트"+(INT*12)*5);
        System.out.println("대상의 주변 적 5명에게 50%의 피해를 입힙니다");
        super.Skill2();
    }

    @Override
    public void Skill1() {
        System.out.println("골렘소환");
        System.out.println("HP600 ATK 50의 골렘을 180초간 소환합니다.");
        super.Skill1();
    }
}
