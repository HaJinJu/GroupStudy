package ClassList;

public class DiceGame {
    private final int ONE = 1;
    private final int DICESTARTNUM = 1;
    private final int DICEENDNUM = 6;
    private final String Y = "y";
    private final String INPUT = "주사위를 굴리시려면 y를 입력해주세요.";
    private final String P1WAIT = "Player 2 가 주사위를 굴릴 준비를 하고 있습니다.";
    private final String P1WIN = "Player 1 이 이겼습니다!!";
    private final String P2WIN = "Player 2 가 이겼습니다!!";
    private final String TIE = "비겼습니다!!";
    private final String ERROR = "y도 제대로 입력을 못하시는군요ㅜㅜ";
    private String msg;
    private int diceRange;
    private int p1DiceNum, p2DiceNum;
    private boolean WrongInput;

    public void setDiceInput() {
        msg = INPUT;
    }

    public void diceGamePlay(String p2Input) {
        if(p2Input.equals(Y)) {
            diceRange = DICEENDNUM - DICESTARTNUM + ONE;
            p1DiceNum = (int)(Math.random() * diceRange) + DICESTARTNUM;
            p2DiceNum = (int)(Math.random() * diceRange) + DICESTARTNUM;
            WrongInput = false;

            // Player 1 이 이기는 경우
            if (p1DiceNum > p2DiceNum) {
                msg = P1WIN;
            }
            // Player 2 가 이기는 경우
            else if (p1DiceNum < p2DiceNum) {
                msg = P2WIN;
            }
            // 비기는 경우
            else {
                msg = TIE;
            }
        }
        else {
            WrongInput = true;
            msg = ERROR;
        }
    }

    public String getMsg() {
        return msg;
    }

    public String getINPUT() {
        return INPUT;
    }

    public int getP1DiceNum() {
        return p1DiceNum;
    }

    public int getP2DiceNum() {
        return p2DiceNum;
    }

    public String getP1WAIT() {
        return P1WAIT;
    }

    public boolean getWrongInput() {
        return WrongInput;
    }
}
