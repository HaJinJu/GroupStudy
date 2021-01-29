// Thief 클래스 : 1차 전직 직업군 중 '도적'
public class Thief extends Adventurer implements CharacterLevel1 {
    private final String SKILLDAGGER = "단검 날리기";
    private final String SKILLPOISON = "독 뿌리기";

    public Thief() {
        changeJob(2);
    }

    // 도적 공격 스킬 1 : 단검 날리기 (데미지 15)
    public void skill3() {
        setAttackDamage(15);
        System.out.printf("\n'%s' 기술 사용!\n  총 %2d의 데미지를 입혔습니다!!\n\n", SKILLDAGGER, getAttackDamage());
    }

    // 도적 공격 스킬 2 : 독 뿌리기 (데미지 20)
    public void skill4() {
        setAttackDamage(20);
        System.out.printf("\n'%s' 기술 사용!\n 총 %2d의 데미지를 입혔습니다!!\n\n", SKILLPOISON, getAttackDamage());
    }
}