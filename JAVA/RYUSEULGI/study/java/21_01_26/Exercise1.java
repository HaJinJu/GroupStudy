// 주사위 2개를 굴려서 컴퓨터와 대전하기 눈금이 크면 승
// 랜덤한 숫자 200개 생성 범위는 20~60 숫자들이 몇개씩 중복되었는지 체크 Collection
// 1~100000 까지의 수를 고속으로 적용 Thread

class Dicegame {

    int diceA;
    int diceB;

    int user;
    int com;

    public Dicegame() {
        diceA = (int) (Math.random() * 6) + 1;
        diceB = (int) (Math.random() * 6) + 1;

        user = diceA + diceB;

        int diceC = (int) (Math.random() * 6) + 1;
        int diceD = (int) (Math.random() * 6) + 1;

        com = diceC + diceD;
    }

    public void throwDice() {
        if (user > com) {
            System.out.printf("%d %d user 승리", user, com);
        } else if (user < com) {
            System.out.printf("%d %d computer 승리", user, com);
        } else {
            System.out.printf("%d %d 무승부", user, com);
        }
    }
}

public class Exercise1 {
    public static void main(String[] args) {
        Dicegame dice = new Dicegame();
        dice.throwDice();
    }
}
