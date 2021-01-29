// Wizard 클래스 : 2차 전직 직업군 중 '위자드'
public class Wizard extends Magician implements CharacterLevel2 {
    private final String SKILLFIREPILLAR = "불기둥";
    private final String SKILLLIGHTNING = "번개 난사";

    public Wizard() {
        changeJob(6);
    }

    // 위자드 공격 스킬 1 : 불기둥 (데미지 25)
    public void skill5() {
        setAttackDamage(15);
        System.out.printf("\n'%s' 기술 사용!\n  총 %2d의 데미지를 입혔습니다!!\n\n", SKILLFIREPILLAR, getAttackDamage());
    }

    // 위자드 공격 스킬 2 : 번개 난사 (데미지 30)
    public void skill6() {
        setAttackDamage(20);
        System.out.printf("\n'%s' 기술 사용!\n 총 %2d의 데미지를 입혔습니다!!\n\n", SKILLLIGHTNING, getAttackDamage());
    }
}