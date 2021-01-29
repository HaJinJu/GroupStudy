package Twelfth.TwelfthHomework;

public class GameStart {

    static Object obj;
    static int CLASS;

    public GameStart(Object obj, int CLASS) {
        this.obj = obj;
        this.CLASS = CLASS;
    }

    public static void main(String[] args) {

        Player player1 = new Player();

        Skill skill = new Skill(player1);

        skill.skill1();

        Upgrade upgrade = new Upgrade(player1);

        upgrade.upgradeClass();

        skill.skill2(obj, CLASS);

        upgrade.upgradeClass();

        skill.skill1();
        skill.skill2(obj, CLASS);
        skill.skill3(obj, CLASS);
    }
}