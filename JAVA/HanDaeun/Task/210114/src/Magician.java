// Magician 클래스 : 1차 전직 직업군 중 '마법사'
public class Magician extends Adventurer implements CharacterLevel1 {
    private final String SKILLFLAME = "화염구";
    private final String SKILLFREEZE = "얼리기";

    public Magician() {
        changeJob(3);
    }

    // 마법사 공격 스킬 1 : 화염구 (데미지 15)
    public void skill3() {
        setAttackDamage(15);
        System.out.printf("\n'%s' 기술 사용!\n  총 %2d의 데미지를 입혔습니다!!\n\n", SKILLFLAME, getAttackDamage());
    }

    // 마법사 공격 스킬 2 : 얼리기 (데미지 20)
    public void skill4() {
        setAttackDamage(20);
        System.out.printf("\n'%s' 기술 사용!\n 총 %2d의 데미지를 입혔습니다!!\n\n", SKILLFREEZE, getAttackDamage());
    }
}