package Thirteenth.HomeworkReview;

public class Adventurer implements SkillTree {
// 모험가의 스킬트리를 구현하다
    int atk, def, dex, intellect, con, mental;
    // 능력치 변수 부여

    public Adventurer(int atk, int def, int dex, int intellect, int con, int mental) {
            // 생성자 작성 ㅡ> 나머지 직업도 동일 다만 모험가가 기본이기에 나머지는 모험가에 상속하여
           // 기본능력치 부여받고 클래스 작성
       this.atk = atk;
        this.def = def;
        this.dex = dex;
        this.intellect = intellect;
        this.con = con;
        this.mental = mental;
    }
// 인터페이스에서 프로토타입 매서드를 설정해놨기에 다른 클래스에서 동일한 매서드 적용이 가능하다
// 인터페이스 스킬 메서드 작성 ㅡ> 각클래스 시작 때 implement 구현 해줘야 가능
// 그리고 오버라이딩을 통하여 실제 구현할 스킬을 출력(추상매서드 몸통 만들기)
    @Override
    public void skill1() {
        System.out.println("쎄게 치기: " + atk * 10);

    }

    @Override
    public void skill2() {
        System.out.println("돌팔매: " + (atk + dex));
    }
}
