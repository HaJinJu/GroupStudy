package Twelfth.TwelfthHomework.TwelfthHomeworkReview;

public class GameTest {
    public static void main(String[] args) {
        // interface 를 사용하기 가장 좋은 예는 게임이다.
        // 아래와 같은 상황을 구현해보도록 한다.
        //
        // 시작 ---> 1차 전직 ---> 2차 전직
        //
        // 모험가 ---> 전사 ------> 워 로드
        //      ---> 도적 ------> 어쌔신
        //     ---> 마법사 ------> 위자드
        //
        // 각각의 캐릭터들은 공격 스킬을 두 개씩 가지고 있다.
        // 전직을 할 때마다 추가적인 전직 스킬 두 개를 얻게 된다.
        //
        // 스킬을 사용할 때 모두가 일관되게
        // skill1(), skill2(), skill3() 형식으로
        // 데미지가 계산되도록 만들어보자!

        Adventurer adv = new Adventurer(
                10, 0, 10,
                10, 10, 0
        );
        Worrior war = new Worrior(
                50, 20, 20,
                15, 30, 10, 100
        );
        WarLord wl = new WarLord(
                150, 70, 30, 20,
                60, 30, 200, 50
        );
        Thief t = new Thief(
                20, 10, 70,
                15, 20, 0, 0.1f
        );
        Assassin a = new Assassin(
                70, 30, 200, 40,
                30, 20, 0.2f, 10
        );
        Mage mag = new Mage(
                15, 5, 15,
                80, 20, 50, 1000
        );
        Wizard wiz = new Wizard(
                20, 30, 30, 200,
                30, 100, 2000, 3
        );
    }
}
