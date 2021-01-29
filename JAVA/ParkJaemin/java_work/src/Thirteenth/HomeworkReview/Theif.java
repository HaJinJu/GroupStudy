package Thirteenth.HomeworkReview;

public class Theif extends Adventurer { // 1차 전직인 도둑이니 기본 직업인 모험가 상속

    float successRate;

    public Theif(int atk, int def, int dex, int intellect, int con, int mental, float successRate) {
        super(atk, def, dex, intellect, con, mental);
        this.successRate = successRate;
    }
}
