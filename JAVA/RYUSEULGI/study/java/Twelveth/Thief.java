public class Thief extends Adventurer {

    int ax;

    public Thief(int attack, int defense, int experience, int ax) {
        super(attack, defense, experience);
        this.ax = ax;
    }

    @Override
    public void Skill1() {
        System.out.println("도끼공격: " + ax + (attack * 15));
    }

    @Override
    public void Skill2() {
        System.out.println("훔치기: " + defense * 10);
        System.out.println("상대방을 한 턴 쉬게 할 수 있습니다.");
    }
}
