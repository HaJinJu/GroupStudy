
package Thirteenth;

public class Adventurer implements SkillTree {
    int STR, DEX, INT, HP, MP;



    public Adventurer(int STR, int DEX, int INT, int HP, int MP) {
        this.STR = STR;
        this.DEX = DEX;
        this.INT = INT;
        this.HP = HP;
        this.MP = MP;

    }

    @Override
    public void Skill1() {
        System.out.println("모험가의 의지"+ (HP + MP)* 5);

    }

    @Override
    public void Skill2() {
        System.out.println("귀환");
        System.out.println("3초 후 마을로 돌아갑니다 ");

    }
}

