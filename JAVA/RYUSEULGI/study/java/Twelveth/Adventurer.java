public class Adventurer implements Skill {

    int attack;
    int defense;
    int experience;

    public Adventurer(int attack, int defense, int experience) {
        this.attack = attack;
        this.defense = defense;
        this.experience = experience;
    }

    @Override
    public void Skill1() {
        System.out.println("때리기: " + attack);
    }

    @Override
    public void Skill2() {
        System.out.println("막기: " + defense);
    }
}
