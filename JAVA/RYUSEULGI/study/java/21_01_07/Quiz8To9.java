// 총 20명의 사원이 있다고 가정한다.
// 20명 모두에게 랜덤한 번호가 할당되도록 만든다(중복 불가)
// 8번 문제에서 번호별로 상금과 꽝이 존재하도록 하여
// 당첨되면 '상금을 xxx 받았습니다.'
// 꽝이면 '아쉽네요 ~ 다음에 재도전을!' 이 출력되도록 만든다

public class Quiz8To9 {
    public static void main(String[] args) {
        // Random method 사용
        Random random = new Random();

        random.setMember(20);
        random.setRandom(random.NONDUPLICATE);
        random.printPrice();
    }
}
