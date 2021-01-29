import java.util.ArrayList;
import java.util.HashMap;

public class DuplicationCheck {
    private final String PRINTNUM = "생성된 숫자는 다음과 같다.";
    private final String RESULT = "\n중복된 숫자는 다음과 같다.";
    private final int ZERO = 0;
    private final int ONE = 1;
    private final int NUM = 200;
    private final int START = 20;
    private final int END = 60;
    private final int LINEBREAKFIVE = 5;
    private final int LINEBREAKTEN = 10;

    ArrayList<Integer> numList;
    HashMap<Integer, Integer> dupMap;


    public DuplicationCheck() {
        numList = new ArrayList<>();
        dupMap = new HashMap<>();
    }

    // 랜덤 숫자 생성해 numList 에 저장, dupMap 에 나온 횟수 기록
    public void genRandNum() {
        int randNum;
        int range = END - START + ONE;

        for(int i = ZERO; i < NUM; i++) {
            randNum = (int)(Math.random() * range) + START;
            numList.add(randNum);
            checkDup(randNum);
        }
    }

    // 숫자가 나온 횟수를 기록
    public void checkDup(int num) {
        if(dupMap.containsKey(num)) {
            dupMap.put(num, dupMap.get(num) + ONE);
        } else {
            dupMap.put(num, ONE);
        }
    }

    public void printResult() {
        printNumList();
        printDupNum();
    }

    // 생성된 랜덤 숫자 출력
    public void printNumList() {
        int cnt = 0;

        System.out.println(PRINTNUM);

        for(int i = ZERO; i < numList.size(); i++) {
            System.out.printf("%3d ", numList.get(i));
            cnt++;

            if(cnt % LINEBREAKTEN == ZERO) {
                System.out.println();
            }
        }
    }

    // 각각의 숫자들이 몇 번 중복되었는지 출력
    public void printDupNum() {
        int cnt = 0;

        System.out.println(RESULT);

        for(int i = START; i <= END; i++) {
            if(dupMap.containsKey(i) && (dupMap.get(i) > ONE)) {
                System.out.printf("%3d: %2d개\t", i, dupMap.get(i));
                cnt++;

                if(cnt % LINEBREAKFIVE == ZERO) {
                    System.out.println();
                }
            }
        }
    }
}