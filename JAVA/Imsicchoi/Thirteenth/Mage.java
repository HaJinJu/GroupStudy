package Thirteenth;

public class Mage extends Adventurer{
    int spelldmg;


    public Mage(int STR, int DEX, int INT, int HP, int MP) {
       super(STR,DEX,INT,HP,MP);
        this.spelldmg = spelldmg;
    }


    @Override
    public void Skill2() {
        System.out.println("파이어볼"+(INT * MP)*10);

    }

    @Override
    public void Skill1() {
        System.out.println("매직쉴드 발동");
        System.out.println("180초간 입는 피해가 60% 감소합니다.");
    }
}
