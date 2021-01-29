public class Wizard extends Mage {

    int fantasrtic;

    public Wizard(int attack, int defense, int experience, int magic, int fantasrtic) {
        super(attack, defense, experience, magic);
        this.fantasrtic = fantasrtic;
    }

    @Override
    public void Skill1() {
        System.out.println("고급 마법: " + fantasrtic + (attack * 30));
    }

    @Override
    public void Skill2() {
        System.out.println("날기: " + magic * 30);
    }

}
