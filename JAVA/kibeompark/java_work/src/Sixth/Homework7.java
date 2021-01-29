package Sixth;

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

        int i, randNum, cnt = 0; // 변수 선
        int[] checkDup = new int[17]; // 배열 선언

        for(i = 0; i < 17; i++) { // 배열 값 0으로 초기화
            checkDup[i] = 0;
        }

        System.out.println("A팀 입니다."); // A팀 선발
        // 5, 4
        for (i = 1; ; ) { // 무한 루프
            randNum = (int) (Math.random() * 9) + 1; // 1 ~ 9 숫자 중 랜덤 값 추출

            if(checkDup[randNum - 1] != 0) // 배열 값이 0이 아니면
                continue; // 반복 넘어감

            cnt++; // 완료된 만큼 카운트

            checkDup[randNum - 1] = 1; // 완료된 것 체크
            System.out.printf("%d 번 = %d\n", i++, randNum); // 각 번호 당 랜덤 값 출력

            if(cnt == 9) { // 9명 다 정해지면
                break; // 무한 루프 탈출
            }
        }

        System.out.println("\nB팀 입니다."); // B팀 선발
        // 4, 4
        for (;;) { // 무한 루프
            randNum = (int) (Math.random() * 8) + 10; // 10 ~ 17 숫자 중 랜덤 값 추출

            if(checkDup[randNum - 1] != 0) // 배열 값이 0이 아니면
                continue; // 반복 넘어감

            cnt++; // 완료된 만큼 카운트

            checkDup[randNum - 1] = 1; // 완료된 것 체크
            System.out.printf("%d 번 = %d\n", i++, randNum); // 각 번호 당 랜덤 값 출력

            if(cnt == 17) { // 나머지 8명 다 정해지면
                break; // 무한 루프 탈출
            }
        }
    }
}
