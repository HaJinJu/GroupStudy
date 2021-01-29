public class WarLoad extends Warrior {

    int fire;

    public WarLoad(int attack, int defense, int experience, int hammer, int fire) {
        super(attack, defense, experience, hammer);
        this.fire = fire;
    }

    @Override
    public void Skill1() {
        System.out.println("파이어불릿: " + fire + (attack * 50));
    }

    @Override
    public void Skill2() {
        System.out.println("차지 스팅거: " + experience + 30);
    }

}
