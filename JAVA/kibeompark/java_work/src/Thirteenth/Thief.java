package Thirteenth;

public class Thief extends Adventurer {
    float successRate; // 성공률

    public Thief(int atk, int def, int dex, int intel,
                 int con, int mental, float successRate) {
        super(atk, def, dex, intel, con, mental);
        this.successRate = successRate;
    }

    @Override
    public void skill1() {
        System.out.println("출혈 단검 : " + atk * 5);
        System.out.println("4초 간 dex만큼 출혈 데미지, 이동 속도 저하 30%");
    }

    @Override
    public void skill2() {
        System.out.println("백스텝 : " + dex * 8);
        System.out.println("후방 타격 시 추가 데미지 250");
    }
}
