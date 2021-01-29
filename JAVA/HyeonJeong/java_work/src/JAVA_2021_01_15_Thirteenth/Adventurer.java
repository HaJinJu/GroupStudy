package JAVA_2021_01_15_Thirteenth;

public class Adventurer implements SkillTree{
    int atk, def ,dex, intellect, hp, mental;

    public Adventurer(int atk, int def, int dex,
                      int intellect, int hp, int mental){
        this.atk = atk;
        this.def = def;
        this.dex = dex;
        this.intellect = intellect;
        this.hp = hp;
        this.mental = mental;
    }

    @Override
    public void skill1() {
        System.out.println("주먹 휘두르기: " + atk * 10);
    }

    @Override
    public void skill2() {
        System.out.println("돌 던지기: " + (atk + dex));
    }
}
