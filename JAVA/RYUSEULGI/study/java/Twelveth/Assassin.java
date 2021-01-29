public class Assassin extends Thief {
    int kick;

    public Assassin(int attack, int defense, int experience, int ax, int kick) {

        super(attack, defense, experience, ax);
        this.kick = kick;
    }

    @Override
    public void Skill1() {
        System.out.println("발차기: " + kick + (attack * 40));
    }

    @Override
    public void Skill2() {
        System.out.println("할퀴기: " + defense * 50);
    }

}