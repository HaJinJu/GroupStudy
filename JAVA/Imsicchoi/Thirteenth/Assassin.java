package Thirteenth;

public class Assassin extends Thief {
    int incantation;

    public Assassin(int STR, int DEX, int INT, int HP, int MP, float successRate, int incantation){
        super(STR,DEX,INT,HP,MP,successRate);
        this.incantation = incantation;
    }

    @Override
    public void Skill1() {
        System.out.println("눈찌르기"+ (DEX*15));
        System.out.println("적의 적중률이 50% 하락합니다");
        super.Skill1();
    }

    @Override
    public void Skill2() {
        System.out.println("은신");
        System.out.println("15초간 은신합니다.");
        super.Skill2();
    }
}
