// Warrior 클래스 : 1차 전직 직업군 중 '전사'
public class Warrior extends Adventurer implements CharacterLevel1 {
    private final String SKILLSLASH = "베기";
    private final String SKILLCHARGE = "돌진";

    public Warrior() {
        changeJob(1);
    }

    // 전사 공격 스킬 1 : 베기 (데미지 15)
    public void skill3() {
        setAttackDamage(15);
        System.out.printf("\n'%s' 기술 사용!\n  총 %2d의 데미지를 입혔습니다!!\n\n", SKILLSLASH, getAttackDamage());
    }

    // 전사 공격 스킬 2 : 돌진 (데미지 20)
    public void skill4() {
        setAttackDamage(20);
        System.out.printf("\n'%s' 기술 사용!\n 총 %2d의 데미지를 입혔습니다!!\n\n", SKILLCHARGE, getAttackDamage());
    }
}