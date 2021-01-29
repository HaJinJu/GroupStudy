package ClassList;

public class RockPaperScissors {
    private final String ROCK = "바위";
    private final String PAPER = "보";
    private final String SCISSORS = "가위";
    private final String INPUT = "가위 바위 보 중 하나를 입력해주세요.";
    private final String P1WAIT = "Player 2 가 가위바위보 선택 중입니다.";
    private final String P1WIN = "Player 1 이 이겼습니다!!";
    private final String P2WIN = "Player 2 가 이겼습니다!!";
    private final String TIE = "비겼습니다!!";
    private final String ERROR = "가위바위보도 제대로 입력을 못하시는군요ㅜㅜ";
    private String msg;

    public void setRpsInput() {
        msg = INPUT;
    }

    public void rpsPlay(String p1, String p2) {
        // Player 1 이 이기는 경우 ( 바위-가위 | 보-바위 | 가위-보 )
        if((p1.equals(ROCK) && p2.equals(SCISSORS)) ||
                (p1.equals(PAPER) && p2.equals(ROCK)) ||
                (p1.equals(SCISSORS) && p2.equals(PAPER))) {
            msg = P1WIN;
        }
        // Player 2 가 이기는 경우 ( 바위-보 | 보-가위 | 가위-바위 )
        else if((p1.equals(ROCK) && p2.equals(PAPER)) ||
                (p1.equals(PAPER) && p2.equals(SCISSORS)) ||
                (p1.equals(SCISSORS) && p2.equals(ROCK))) {
            msg = P2WIN;
        }
        // 비기는 경우 ( 바위-바위 | 보-보 | 가위-가위 )
        else if((p1.equals(ROCK) && p2.equals(ROCK)) ||
                (p1.equals(PAPER) && p2.equals(PAPER)) ||
                (p1.equals(SCISSORS) && p2.equals(SCISSORS))) {
            msg = TIE;
        }
        // 잘못 입력한 경우
        else {
            msg = ERROR;
        }
    }

    public String randRpsPick() {
        int randNum = (int)(Math.random() * 3) + 1;

        if(randNum == 1) {
            return ROCK;
        }
        else if(randNum == 2) {
            return PAPER;
        }
        else {
            return SCISSORS;
        }
    }

    public String getMsg() {
        return msg;
    }

    public String getINPUT() {
        return INPUT;
    }

    public String getP1WAIT() {
        return P1WAIT;
    }
}