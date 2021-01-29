package SecondToFiveth;

public class MathRandom {
    public static void main(String[] args) {
        int randNum = (int)Math.random();

        System.out.println("임의의 난수 = " + randNum);
        // 이 결과는 계속 0이 나올 것이다.
        // 왜? 0.0 이상 1.0 미만의 값이 나오기 때문이다.
        // int형에 맞게 숫자를 고치고 형변환 해주면 된다.

        randNum = (int)(Math.random() * 10);
        System.out.println("0 이상 10 미만의 랜덤 숫자 : " + randNum);

        randNum = (int)(Math.random() * 2);
        System.out.println("0 이상 2 미만의 랜덤 숫자 :" + randNum);

        randNum = (int)((Math.random() * 6) + 1);
        System.out.println("주사위를 굴리자: " + randNum);
    }
}
