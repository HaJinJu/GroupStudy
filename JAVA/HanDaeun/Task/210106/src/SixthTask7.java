/*
    < 문제 7 >

5회차때 풀어봤던 RandomPick 문제의 동작과정을 해석해보자!

 */


public class SixthTask7 {
    public static void main(String[] args) {
        // 총 17명의 사람이 있다.
        // 17명의 사람에게 5, 4, 4, 4 랜덤으로
        // 팀을 배치해주는 프로그램을 작성해보자!
        // 이름순으로 번호를 주고
        // 번호를 랜덤으로 배치하는 형식으로 가면 됩니다.

        //   1      2     3      4     5     6      7     8      9
        // 최현정, 장해솔, 박재민, 고동영, 이정현, 류슬기, 조진형, 한다은, 오진욱

        //   10    11     12    13     14    15     16    17
        // 노찬욱, 박소현, 박기범, 최임식, 탁성진, 하진주, 이승윤, 이범진

        // 1팀: 고동영, 장해솔, 류슬기, 박재민, 한다은
        // 2팀: 최현정, 오진욱, 조진형, 이정현
        // 3팀: 이범진, 박소현, 탁성진, 노찬욱
        // 4팀: 박기범, 하진주, 이승윤, 최임식
        final String ONE = "최현정";                              // 17명의 사람의 이름을 저장
        final String TWO = "장해솔";
        final String THREE = "박재민";
        final String FOUR = "고동영";
        final String FIVE = "이정현";
        final String SIX = "류슬기";
        final String SEVEN = "조진형";
        final String EIGHT = "한다은";
        final String NINE = "오진욱";
        final String TEN = "노찬욱";
        final String ELEVEN = "박소현";
        final String TWELVE = "박기범";
        final String THIRTEEN = "최임식";
        final String FOURTEEN = "탁성진";
        final String FIFTEEN = "하진주";
        final String SIXTEEN = "이승윤";
        final String SEVENTEEN = "이범진";

        int i, randNum, cnt = 0;
        int[] checkDup = new int[17];

        for (i = 0; i < 17; i++) {
            checkDup[i] = 0;                                    // 중복 확인 배열 초기화
        }

        System.out.println("A조 입니다.");
        // 5, 4
        for (i = 1; ; ) {
            randNum = (int) (Math.random() * 9) + 1;            // A조 1 ~ 9 번까지의 랜덤 값 할당

            if (checkDup[randNum - 1] != 0)
                continue;                                       // 이미 배정된 사람이면 이후 작업은 하지 않고 다시 처음부터 작업 시작

            cnt++;                                              // 배정된 사람수만큼 카운트

            checkDup[randNum - 1] = 1;                          // 배정된 사람임을 표시
            System.out.printf("%d 번 = %d\n", i++, randNum);     // 배정된 번호 출력

            if (cnt == 9) {
                break;                                          // A조 9명의 배정이 끝나면 작업을 그만함
            }
        }

        System.out.println("B조 입니다.");
        // 4, 4
        for (; ; ) {
            randNum = (int) (Math.random() * 8) + 10;           // B조 10 ~ 17 번까지의 랜덤 값 할당

            if (checkDup[randNum - 1] != 0)
                continue;                                       // 이미 배정된 사람이면 이후 작업은 하지 않고 다시 처음부터 작업 시작

            cnt++;                                              // 배정된 사람수만큼 카운트

            checkDup[randNum - 1] = 1;                          // 배정된 사람임을 표시
            System.out.printf("%d 번 = %d\n", i++, randNum);     // 배정된 번호 출력

            if (cnt == 17) {
                break;                                          // B조 8명의 배정이 끝나면 작업을 그만함
            }
        }
    }
}
