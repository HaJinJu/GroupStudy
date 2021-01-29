package Thirteenth;

public class Warrior extends Adventurer{
    float anger;

    public Warrior(int STR, int DEX, int INT, int HP, int MP, float anger) {
        super(STR, DEX, INT, HP, MP);
        this.anger = anger;
    }

    @Override
    public void Skill1() {
        System.out.println("포효"+(STR-5)*anger);
        System.out.println("주변 적들을 3초간 스턴시킵니다");
        super.Skill1();
    }

    @Override
    public void Skill2() {
        System.out.println("단단한 피부");
        System.out.println("60초간 방어력이 50% 증가합니다");
        super.Skill2();
    }
}
