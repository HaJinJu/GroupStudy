// 그래픽이 없는 오토 게임

// 필요한 클래스
// 모험가, 전사, 워 로드, 도적, 어쌔신, 마법사, 위자드

// 필요한 인터페이스
// 스킬트리

public class GameTest {
    public static void main(String[] args) {
        Adventurer adventurer = new Adventurer(10, 10, 10);
        Warrior warrior = new Warrior(30, 15, 30, 30);
        WarLoad warLoad = new WarLoad(40, 40, 30, 35, 20);
        Thief thief = new Thief(20, 40, 40, 30);
        Assassin assassin = new Assassin(50, 45, 40, 35, 25);
        Mage mage = new Mage(25, 20, 20, 10);
        Wizard wizard = new Wizard(30, 30, 40, 30, 15);

        for (;;) {
            adventurer.Skill1();
            adventurer.Skill2();

            warrior.Skill1();
            warrior.Skill2();

            warLoad.Skill1();
            warLoad.Skill2();

            thief.Skill1();
            thief.Skill2();

            assassin.Skill1();
            assassin.Skill2();

            mage.Skill1();
            mage.Skill2();

            wizard.Skill1();
            wizard.Skill2();
        }

    }
}