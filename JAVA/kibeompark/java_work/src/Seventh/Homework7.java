package Seventh;

public class Homework7 {
    public static void main(String[] args) {
        // 총 17명의 사람이 있다.
        // 17명의 사람에게 5, 4, 4, 4 랜덤으로
        // 팀을 배치해주는 프로그램을 작성해 보자 !
        // 이름 순으로 번호를 주고
        // 번호를 랜덤으로 배치하는 형식으로 가면 됩니다.

        //   1     2      3     4      5     6      7     8      9
        // 최현정, 장해솔, 박재민, 고동영, 이정현, 류슬기, 조진형, 한다은, 오진욱

        //  10     11    12     13    14     15    16     17
        // 노진욱, 박소현, 박기범, 최임식, 탁성진, 하진주, 이승윤, 이범진

        // 1팀: 고동영, 장해솔, 류슬기, 박재민, 한다은
        // 2팀: 최현정, 오진욱, 조진형, 이정현
        // 3팀: 이범진, 박소현, 탁성진, 노찬욱
        // 4팀: 박기범, 하진주, 이승윤, 최임식
        final String ONE = "최현정";
        final String TWO = "정해솔";
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

        // i 의 용도는 for loop 를 돌리기 위한 변수
        // randNum 은 랜덤 번호를 할당 받기 위한 변수
        // checkDup 은 중복을 검사하기 위한 배열
        // cnt 는 실제 중복 없이 할당 받은 사람의 숫자를 의미하는 변수
        int i, randNum, cnt = 0;
        int[] checkDup = new int[17];

        // 초기엔 중복이 없으므로 전부 0으로 설정
        for(i = 0; i < 17; i++) {
            checkDup[i] = 0;
        }

        System.out.println("A팀 입니다.");
        // 1번 - 누구, 2번 - 누구 형식으로 진행하므로 1부터 시작
        for (i = 1; ; ) {
            // 랜덤 번호 할당 : 1팀 - 5명, 2팀 - 4명
            randNum = (int) (Math.random() * 9) + 1;

            // -------------------------------------
            // | 0 | 0 | 1 | 0 | 0 | 0 | 1 | 0 | 0 | .......
            // -------------------------------------
            //  [0] [1] [2] [3] [4] [5] [6] [7] [8]
            //   1   2   3   4   5   6   7   8   9

            // 할당 받은 번호 - 1 의 자리가 0이 아니라면
            // 중복이 된 것이므로 다시 재할당 받으세요.
            if(checkDup[randNum - 1] != 0)
                continue;

            cnt++;

            // 같은 숫자가 나오면 중복이 되도록 만들어 주는 코드
            checkDup[randNum - 1] = 1;
            System.out.printf("%d 번 = %d\n", i++, randNum);

            if(cnt == 9) {
                break;
            }
        }

        System.out.println("\nB팀 입니다.");
        // 4, 4
        for (;;) {
            // B조는 8명이고, 앞에서 이미 9명이 체크 되었음
            // A조가 1 ~ 9번까지 이미 할당 받음
            // B조는 시작을 10번부터 해야 하므로 + 10
            randNum = (int) (Math.random() * 8) + 10;

            if(checkDup[randNum - 1] != 0)
            {
                System.out.println("중복 발생");
                continue;
            }

            cnt++;

            checkDup[randNum - 1] = 1;
            System.out.printf("%d 번 = %d\n", i++, randNum);

            // 전체 17명이 체크가 되면 종료
            if(cnt == 17) {
                break;
            }
        }
    }
}