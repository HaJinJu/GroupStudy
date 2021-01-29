package Thirteenth;

public class Thief extends Adventurer{
    float successRate;

    public Thief(int STR, int DEX, int INT, int HP, int MP,float successRate){

        super(STR,DEX,INT,HP,MP);
        this.successRate = successRate;
    }

    @Override
    public void Skill1() {
        System.out.println("급소 찌르기"+ (DEX * 2)*STR);
        System.out.println("크리티컬!");
        super.Skill1();
    }

    @Override
    public void Skill2() {
        System.out.println("헤이스트");
        System.out.println("회피율 30% 증가");
        super.Skill2();
    }
}
