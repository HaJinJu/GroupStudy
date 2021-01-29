import java.util.Scanner;

public class DiceGame {
    private final String WELCOME = "****** 주사위게임에 오신 것을 환영합니다 ******";
    private final String RULE = "<게임룰> 주사위 2개를 굴려 컴퓨터보다 합이 크면 승리!";
    private final String SELECT = "\n게임 시작은 y, 종료는 n을 입력하세요 : ";
    private final String END = "**** 주사위 게임을 종료합니다 다음에 만나요! ****";
    private final String ERROR = "타자도 못치는 바보가 있네요??";
    private final String ROLLDICEC = "\n컴퓨터가 주사위를 굴렸습니다! 도르르~";
    private final String ROLLDICEP = "당신이 주사위를 굴렸습니다! 도르르르~";
    private final String DICEC = "\n컴퓨터의 주사위 눈금 : ";
    private final String DICEP = "\n당신의 주사위 눈금 : ";
    private final String WIN = "\n당신이 이겼습니다!!";
    private final String LOSE = "\n당신의 패배입니다...";
    private final String TIE = "\n비겼습니다~";
    private final int ZERO = 0;
    private final int DICE = 2;
    private final int DICESTARTNUM = 1;
    private final int DICEENDNUM = 6;

    private Scanner scan;
    private int[] arrDiceC, arrDiceP;
    private int computerSum, playerSum;


    public DiceGame() {
        System.out.println(WELCOME);
        System.out.println(RULE);

        setScan();
        setDiceArr();
        setDiceSumZero();
    }

    public void setScan() {
        scan = new Scanner(System.in);
    }

    // 컴퓨터와 플레이어의 주사위 눈금을 저장할 배열 준비
    public void setDiceArr() {
        arrDiceC = new int[DICE];
        arrDiceP = new int[DICE];
    }

    // 주사위 눈금 합 0으로 초기화
    public void setDiceSumZero() {
        computerSum = ZERO;
        playerSum = ZERO;
    }

    public void playGame() {
        String gameStart;

        while(true) {
            System.out.print(SELECT);
            gameStart = scan.nextLine();

            // 게임 진행
            if(gameStart.equals("y")) {
                takeTurns();
                judgeVictory();
            }
            // 게임 종료
            else if(gameStart.equals("n")) {
                System.out.println(END);
                break;
            }
            // 잘못된 입력 예외 처리
            else {
                System.out.println(ERROR);
            }
        }
    }

    // 컴퓨터 - 플레이어 순으로 각자 차례 진행
    public void takeTurns() {
        System.out.println(ROLLDICEC);
        rollDice(arrDiceC);

        System.out.println(ROLLDICEP);
        rollDice(arrDiceP);
    }

    // 주사위 수만큼 랜덤값을 배열에 저장
    public void rollDice(int[] diceArr) {
        for(int i = ZERO; i < diceArr.length; i++) {
            diceArr[i] = (int)(Math.random() * DICEENDNUM) + DICESTARTNUM;
        }
    }

    // 승패 판정 및 결과 출력
    public void judgeVictory() {
        System.out.print(DICEC);
        computerSum = calcDiceSum(arrDiceC, computerSum);
        System.out.print(DICEP);
        playerSum = calcDiceSum(arrDiceP, playerSum);

        if(playerSum > computerSum) {
            System.out.println(WIN);
        } else if(playerSum < computerSum) {
            System.out.println(LOSE);
        } else {
            System.out.println(TIE);
        }

        setDiceSumZero();
    }

    // 주사위 눈금 출력 및 합계 계산
    public int calcDiceSum(int[] diceArr, int sum) {
        for(int i = ZERO; i < diceArr.length; i++) {
            System.out.printf("%2d ", diceArr[i]);
            sum += diceArr[i];
        }

        return sum;
    }
}