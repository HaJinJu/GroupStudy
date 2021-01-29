// Warlord 클래스 : 2차 전직 직업군 중 '워로드'
public class Warlord extends Warrior implements CharacterLevel2 {
    private final String SKILLDOUBLESTAB = "연속 찌르기";
    private final String SKILLWHIRLWIND = "휠윈드";

    public Warlord() {
        changeJob(4);
    }

    // 워로드 공격 스킬 1 : 연속 찌르기 (데미지 25)
    public void skill5() {
        setAttackDamage(15);
        System.out.printf("\n'%s' 기술 사용!\n  총 %2d의 데미지를 입혔습니다!!\n\n", SKILLDOUBLESTAB, getAttackDamage());
    }

    // 워로드 공격 스킬 2 : 휠윈드 (데미지 30)
    public void skill6() {
        setAttackDamage(20);
        System.out.printf("\n'%s' 기술 사용!\n 총 %2d의 데미지를 입혔습니다!!\n\n", SKILLWHIRLWIND, getAttackDamage());
    }
}