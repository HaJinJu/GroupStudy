package Ninth;

public class Homework8 {
    public static void main(String[] args) {
        RockPaperScissors rps = new RockPaperScissors(true);

        rps.playGame();
    }
}

/*
package Homework.Eighth;

public class Homework8 {
    public static void main(String[] args) {
        // 8) 앞선 5번 문제를 승부가 날 때까지 멈추지 않는 형태로 만들어 보자 !
        Homework.Eighth.RockPaperScissors rps = new Homework.Eighth.RockPaperScissors();

        while(true) {
            rps.playerChoice();
            rps.computerChoice();
            rps.matchResult();
            rps.printResult();

            if (rps.winner != 0 && rps.winner != 1) break;
        }
    }
}
*/