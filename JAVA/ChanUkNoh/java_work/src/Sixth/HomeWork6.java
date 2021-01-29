package Sixth;

public class HomeWork6 {
    public static void main(String[] args) {
        // 6) 5회차의 RandomPick 문제의 동작 과정을 해석해보자!

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
//        final String ONE = "최현정";
//        final String TWO = "장해솔";
//        final String THREE = "박재민";
//        final String FOUR = "고동영";
//        final String FIVE = "이정현";
//        final String SIX = "류슬기";
//        final String SEVEN = "조진형";
//        final String EIGHT = "한다은";              배열을 사용했기 때문에 쓸모 없어진 변수들
//        final String NINE = "오진욱";
//        final String TEN = "노찬욱";
//        final String ELEVEN = "박소현";
//        final String TWELVE = "박기범";
//        final String THIRTEEN = "최임식";
//        final String FOURTEEN = "탁성진";
//        final String FIFTEEN = "하진주";
//        final String SIXTEEN = "이승윤";
//        final String SEVENTEEN = "이범진";

        int i, randNum, cnt = 0;
        int[] checkDup = new int[17];               // 인원수 크기의 배열 생성

        for(i = 0; i < 17; i++) {
            checkDup[i] = 0;                        // 배열의 초기값을 0으로 설정킴, 뽑힌 사람과 뽑히지 않은 사람을 구별하기 위함
        }
        System.out.println("A조 입니다.");
        // 5, 4
        for(i = 1; ;) {                             // 무한 반복문을 돌리고 특정 조건에 특정 동작을 하도록 함
            randNum = (int)(Math.random() * 9) + 1; // 배정할 랜덤 숫자를 생성, A조는 9명

            if(checkDup[randNum - 1] != 0)          // 이미 뽑힌사람은 패스!
                continue;
            cnt++;                                  // 뽑은 사람의 숫자를 센다

            checkDup[randNum - 1] = 1;              // 뽑힌 사람은 값으로 1을 할당해 다음번 뽑힐 시 패스 하도록 만듬.
            System.out.printf("%d 번 = %d\n", i++, randNum); // 번호 배정

            if(cnt == 9) {                          // 모두 뽑으면 즉, cnt가 9가 되면 뽑기를 끝냄.
                break;
            }
        }

        System.out.println("B조 입니다.");
        // 4, 4
        for(;;) {
            randNum = (int)(Math.random() * 8) + 10;

            if (checkDup[randNum - 1] != 0)
                continue;

            cnt++;

            checkDup[randNum - 1] = 1;
            System.out.printf("%d 번 = %d\n", i++, randNum);

            if (cnt == 17) {
                break;
            }
        }
    }
}

