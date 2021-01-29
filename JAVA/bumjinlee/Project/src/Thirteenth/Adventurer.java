package Thirteenth;

public class Adventurer implements SkillTree {
    int atk, def, dex, intellect, con, mental;

    public Adventurer(int atk, int def, int dex,
                      int intel, int con, int mental) {
        this.atk = atk;
        this.def = def;
        this.dex = dex;
        this.intellect = intel;
        this.con = con;
        this.mental = mental;
    }


    @Override
    public void skill1() {

    }

    @Override
    public void skill2() {

    }
}
