package Test;

class DiceGame {
    int player;
    int computer;

    public DiceGame() {
        player = (int) (Math.random() * 6) + 1;
        computer = (int) (Math.random() * 6) + 1;
    }

    public void GamePlay() {
        if (player > computer) {
            System.out.println("플레이어가 이겼습니다.");
        } else if (player < computer) {
            System.out.println("컴퓨터가 이겼습니다.");
        } else {
            System.out.println("비겼습니다.");
        }
        System.out.printf("플레이어 주사위: %d, 컴퓨터 주사위: %d ", player, computer);
    }
}

public class Quiz7 {
    public static void main(String[] args) {
        DiceGame dg = new DiceGame();
        dg.GamePlay();
    }
}

