// Assassin 클래스 : 2차 전직 직업군 중 '어쌔신'
public class Assassin extends Thief implements CharacterLevel2 {
    private final String SKILLTRIPLETHROW = "표창 난사";
    private final String SKILLPOISONCLOUD = "독구름";

    public Assassin() {
        changeJob(5);
    }

    // 어쌔신 공격 스킬 1 : 표창 난사 (데미지 25)
    public void skill5() {
        setAttackDamage(15);
        System.out.printf("\n'%s' 기술 사용!\n  총 %2d의 데미지를 입혔습니다!!\n\n", SKILLTRIPLETHROW, getAttackDamage());
    }

    // 어쌔신 공격 스킬 2 : 독구름 (데미지 30)
    public void skill6() {
        setAttackDamage(20);
        System.out.printf("\n'%s' 기술 사용!\n 총 %2d의 데미지를 입혔습니다!!\n\n", SKILLPOISONCLOUD, getAttackDamage());
    }
}