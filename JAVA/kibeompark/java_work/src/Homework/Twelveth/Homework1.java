package Homework.Twelveth;

public class Homework1 {
    public static void main(String[] args) {
        // interface를 사용하기 가장 좋은 예는 게임이다.
        // 아래와 같은 상황을 구현해보도록 한다.
        //
        // 시작 ---> 1차 전직 ---> 2차 전직
        //
        // 모험가 ---> 전사 ------> 워 로드
        //       ---> 도적 ------> 어쌔신
        //      ---> 마법사 ------> 위자드
        //
        // 각각의 캐릭터들은 공격 스킬을 두 개씩 가지고 있다.
        // 전직을 할 때마다 추가적인 전직 스킬 두 개를 얻게 된다.
        //
        // 스킬을 사용할 때 모두가 일관되게
        // skill1(), skill2(), skill3() 형식으로
        // 데미지가 계산되도록 만들어 보자 !
        PlayGame pg = new PlayGame();
        Upgrade ug = new Upgrade();

        pg.useSkill1();
        ug.upgradeCharacter();
        ug.upgradeCharacter();
        pg.continueGame();
    }
}
