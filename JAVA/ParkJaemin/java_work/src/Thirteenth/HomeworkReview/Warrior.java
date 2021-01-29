package Thirteenth.HomeworkReview;

public class Warrior extends Adventurer { // 1차 전직인 워리어의 능력치 중 모험가의 능력치를 상속받음
    float anger; // 새로운 능력치 부여

    // 생성자 작성
   public Warrior(int atk, int def, int dex, int intellect, int con, int mental, float anger) {
        super(atk, def, dex, intellect, con, mental);
        this.anger = anger;

    }
}
