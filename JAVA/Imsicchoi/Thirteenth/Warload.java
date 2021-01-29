package Thirteenth;

public class Warload extends Warrior{
    int intention;

    public Warload(int STR, int DEX, int INT, int HP, int MP, float anger, int intention) {
        super(STR, DEX, INT, HP, MP, anger);
        this.intention = intention;
    }

    @Override
    public void Skill1() {
        System.out.println("파워스트라이크" + STR*anger);
        super.Skill1();
    }

    @Override
    public void Skill2() {
        System.out.println("용맹함");
        System.out.println("180초간 방어력이 100% 증가합니다");
        super.Skill2();
    }
}
