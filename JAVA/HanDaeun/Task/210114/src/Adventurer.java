// Adventurer 클래스 : 0차 전직 직업군 중 '모험가'
public class Adventurer implements CharacterLevel0 {
    private final String ADVENTURER = "모험가";
    private final String WARRIOR = "전사";
    private final String THIEF = "도적";
    private final String MAGICIAN = "마법사";
    private final String WARLORD = "워로드";
    private final String ASSASSIN = "어쌔신";
    private final String WIZARD = "위자드";

    private final String SKILLTICKLE = "간지럽히기";
    private final String SKILLPUNCH = "주먹으로 때리기";

    private String job;
    private int jobNum, jobLevel;
    private int attackDamage;

    public Adventurer() {
        changeJob(0);
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    // 모험가 공격 스킬 1 : 간지럽히기 (데미지 5)
    public void skill1() {
        attackDamage += 5;
        System.out.printf("\n'%s' 기술 사용!\n  총 %2d의 데미지를 입혔습니다!!\n\n", SKILLTICKLE, getAttackDamage());
    }

    // 모험가 공격 스킬 2 : 주먹으로 때리기 (데미지 10)
    public void skill2() {
        attackDamage += 10;
        System.out.printf("\n'%s' 기술 사용!\n 총 %2d의 데미지를 입혔습니다!!\n\n", SKILLPUNCH, getAttackDamage());
    }

    public void changeJob(int jobNum) {
        this.jobNum = jobNum;

        switch (jobNum) {
            case 0:
                job = ADVENTURER;
                jobLevel = 0;
                break;
            case 1:
                job = WARRIOR;
                jobLevel = 1;
                break;
            case 2:
                job = THIEF;
                jobLevel = 1;
                break;
            case 3:
                job = MAGICIAN;
                jobLevel = 1;
                break;
            case 4:
                job = WARLORD;
                jobLevel = 2;
                break;
            case 5:
                job = ASSASSIN;
                jobLevel = 2;
                break;
            case 6:
                job = WIZARD;
                jobLevel = 2;
                break;
        }

        System.out.printf("\n'%s' (으)로 %d차 전직했습니다~\n\n", job, jobLevel);
    }

    public String getJob() {
        return job;
    }

    public int getAttackDamage() {
        return attackDamage;
    }
}