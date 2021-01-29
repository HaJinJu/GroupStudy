package Thirteenth;

public class Adventurer implements SkillTree {
    int atk, def, dex, intellect, con, mental;

    public Adventurer(int atk, int def, int dex,
                      int intellect, int con, int mental) {
        this.atk = atk;
        this.def = def;
        this.dex = dex;
        this.intellect = intellect;
        this.con = con;
        this.mental = mental;
    }

    public void skill1() {
        System.out.println("쎄게 치기 : " + atk * 10);
    }

    public void skill2() {
        System.out.println("돌팔매 : " + (atk + dex));
    }
}
