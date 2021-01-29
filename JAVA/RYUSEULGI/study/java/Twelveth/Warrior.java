public class Warrior extends Adventurer {

    int hammer;

    public Warrior(int attack, int defense, int experience, int hammer) {
        super(attack, defense, experience);
        this.hammer = hammer;
    }

    @Override
    public void Skill1() {
        System.out.println("망치공격: " + hammer + (attack * 10));
    }

    @Override
    public void Skill2() {
        System.out.println("망치 던지기: " + hammer * 2);
    }
}
