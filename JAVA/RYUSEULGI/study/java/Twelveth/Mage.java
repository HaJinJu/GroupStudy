public class Mage extends Adventurer {
    int magic;

    public Mage(int attack, int defense, int experience, int magic) {
        super(attack, defense, experience);
        this.magic = magic;
    }

    @Override
    public void Skill1() {
        System.out.println("기초 마법: " + (magic * 2) + (attack * 10));
    }

    @Override
    public void Skill2() {
        System.out.println("시공간 정지: " + defense + 70);
    }
}
