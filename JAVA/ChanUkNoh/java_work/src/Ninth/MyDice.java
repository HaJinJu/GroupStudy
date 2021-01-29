package Ninth;

import java.util.Scanner;

public class MyDice {
    //  4) 주사위 게임을 한다.
//     5명의 플레이어가 있다.
//     이들은 모두 3개의 주사위를 가지고 있다.
//     3개의 주사위를 굴려서 합산 결과가 가장 큰 사람이 이긴다.
//     (숫자 6은 0 으로 무효화 된다)
//     프로그램으로 이를 만들어보자!
    int ruleNum;
    int playerNum;
    int numOfDice;
    int[] sumOfDice;
    int[] playerArr;

    Scanner scan;
    boolean octahedronGame;

    public MyDice(int playerNum, int numOfDice, int ruleNum) {
        this.playerNum  = playerNum; // 몇명의 플레이어가 참가하는지
        this.numOfDice  = numOfDice; // 주사위 개수
        this.ruleNum    = ruleNum;   // 특수 규칙 숫자

        sumOfDice = new int[playerNum]; // 정렬을 위한 배열
        playerArr = new int[playerNum]; // 플레이어 번호도 정렬하기 위한 배열

        for (int i = 0; i < playerNum; i++) {
            sumOfDice[i] = 0;       // 초기 합산을 위해 0으로 초기화
            playerArr[i] = 0 + 1;   // 플레이어 번호 매김
        }
    }

    public MyDice(int playerNum) {
        this.playerNum = playerNum; // 총 몇명이 플레이 하는지

        sumOfDice = new int[playerNum];
        // 주사위 눈금의 총합을 플레이어 순서에 맞게 담음
        scan = new Scanner(System.in);
    }

    public void playOctahedron() {
        int octahedronDice; // 8면 주사위

        for (int i = 0; i < playerNum; i++) { // 플레이어 수 만큼 게임을 진행
            System.out.printf("%d번 사용자 게임 시작!\n", i + 1);
            octahedronGame = true;
            int cnt = 0;

            // octahedronGame이 true면 무한반복!
            // 트정 조건에 false를 할당해 반복문을 빠져나오는 코드
            while (octahedronGame) {
                octahedronDice = (int)(Math.random() * 8) + 1;
                cnt++;

                if (cnt == 3) break; // 주사위를 2번 돌리면 끝!

                System.out.printf("%d번 사용자 %d번째 시도 주사위 눈금: %d\n",
                        i + 1, cnt, octahedronDice);

                sumOfDice[i] += octahedronDice;
                // 주사위 총합을 더함

                // 주사위를 처음 던질 때 짝수가 나오면 false를 할당해 반복문을
                // 빠져나옴
                if (cnt == 1 && octahedronDice % 2 == 0) {
                    octahedronGame = false;

                    // 주사위를 두 번째 던질 때 짝수가 나오면 규칙 발생!
                } else if (cnt == 2 && octahedronDice % 2 == 0) {
                    switch (octahedronDice) {
                        // 2: 이미 주사위를 얻은 사람의 주사위 값을 3 파괴한다.
                        case 2:

                            // (j = i - 1; i >= 0; j--)의 해석:
                            // 최소 한 명 이상의 플레이어가 차례를 마치고
                            // (즉 j가 1이상일 때 만 조건이 시작)
                            // j--로 내림 순으로 판단을 시작해
                            // 모든 요소를 판단한다.
                            for (int j = i - 1; j >= 0; j--) {
                                sumOfDice[j] -= 3;
                            }
                            break;
                        // 4: 지정한 사용자의 주사위 값을 0 으로 만든다.
                        case 4:
                            System.out.println("누구의 점수를 없앨까요?");
                            int tmp = scan.nextInt();
                            // scanner로 받아온 숫자를 index로 사용해
                            // 해당 플레이어의 점수를 없애버림
                            sumOfDice[tmp] = 0;
                            break;
                        // 6: 모든 플레이어의 주사위 값을 2 파괴한다.
                        case 6:

                            // 모든 요소를 내림순으로 판단해
                            // 점수를 2점씩 깎음
                            for (int j = i; j >= 0; j--) {
                                sumOfDice[j] -= 2;
                            }
                            break;
                        // 8: 자신을 제외한 모든 플레이어의 주사위 값을 3 상승시킨다.
                        case 8:

                            // 모든 요소를 내림순으로 판단하고
                            for (int j = 0; j <= 2; j++) {
                                // 나의 순서는 넘어가고
                                if (j == i) {
                                    continue;
                                }
                                // 나머지 플레이어에게 3점씩 상승
                                sumOfDice[j] += 3;
                            }
                            break;

                    }
                } else if (cnt == 2 && octahedronDice % 2 != 0) {
                    sumOfDice[i] = 0;
                    octahedronGame = false;
                }
            }
        }
    }
    public void playGame() {

        for (int i = 0; i < playerNum; i++) { // 플레이어 숫자만큼 게임을 진행

            for (int j = 0; j < numOfDice; j++) { // 주사위 개수만큼 진행
                int dice = (int)(Math.random() * 6) + 1;

                if (dice == ruleNum) continue; // 6인 경우 0을 할당 (무시)

                sumOfDice[i] += dice; // 그 외의 눈금은 합산
            }
        }
    }

    public void printSumOfOctahedronDice() {

        for (int i = 0; i < playerNum; i++) {
            System.out.printf(
                    "%d번째 사용자의 주사위 눈금합: %d\n",
                    i + 1, sumOfDice[i]);
        }
    }

    public void printSumOfDice() {
        for (int i = 0; i < playerNum; i++) {
            System.out.printf("%d 번째 사용자의 주사위 눈금합 = %d\n",
                    playerArr[i], sumOfDice[i]);
        }
    }

    // 삽입 정렬 알고리즘 -> 사이즈가 작은 배열에만 적합하다.
    public void insertSort() {
        int i, j;
        int numKey, playNoKey; // 백업 데이터를 담을 변수
        int len = sumOfDice.length;

        // 현재 케이스 에서는 숫자만 정렬하면 안되고
        // 사용자 번호를 같이 처리해줘야 한다.

        for (i = 1; i < len; i++) {
            numKey      = sumOfDice[i]; // 현재 판단하고자 하는 요소의 다음 값의
            // 데이터 백업
            playNoKey   = playerArr[i];

            for (j = i - 1; (j != -1) && (sumOfDice[j] > numKey); j--) {
                // 내림 순으로 배열의 요소를 판단함 0번 부터 시작하며
                // 다음 순서의 요소와 현재요소를 비교한다.
                // (j != -1) && 으로 sumOfDice[-1]의 오류를 방지한다.

                // 앞 순서의 요소가 뒷 순서의 요소보다 크다면
                // 뒷 요소의 값을 앞 요소의 값으로 덮어 씌운다.
                // (추후에 백업 데이터로 작은 값을 다시 덮어씌울 예정)
                sumOfDice[j + 1] = sumOfDice[j];
                playerArr[j + 1] = playerArr[j];
            }
            // 앞 순서의 요소가 뒷 순서의 요소보다 작다면
            // sumOfDice[0]에 백업 데이터를 덮어씌운다.
            // 반복문을 전부 마치고 나올 때에 j는 -1이 되기 때문에
            // 가장 작은 값을 가진 요소가 가장 앞 순서의 요소가 된다.
            sumOfDice[j + 1] = numKey;
            playerArr[j + 1] = playNoKey;
        }
    }
}
