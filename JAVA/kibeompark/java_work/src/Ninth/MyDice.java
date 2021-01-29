package Ninth;

import java.util.Scanner;

public class MyDice {
    int ruleNum;
    int playerNum;
    int numOfDice;
    int[] sumOfDice;
    int[] playerArr;

    boolean octahedronGame;
    Scanner scan;

    public MyDice(int playerNum, int numOfDice, int ruleNum) {
        this.playerNum = playerNum;
        this.numOfDice = numOfDice;
        this.ruleNum = ruleNum;
        // playerNum : 사용자 숫자를 받기 위한 변수
        // numOfDice : 주사위 숫자
        // ruleNum : 6이 나오면 0으로 만들기 위한 특수 규칙이 적용되는 수

        playerArr = new int[playerNum];
        sumOfDice = new int[playerNum];
        // 정렬을 하다 보니까 주사위 합산 배열 정렬할 때
        // 사용자를 같이 이동시켜줘야 하므로 사용자 배열도 같이 만듦

        for (int i = 0; i < playerNum; i++) {
            // 초기 합산을 하기 위해서 0으로 초기화
            sumOfDice[i] = 0;
            // 사용자 번호를 1 ~ 순서대로 배치하기 위한 작업
            playerArr[i] = i + 1;
        }
    }

    public MyDice(int playerNum) {
        this.playerNum = playerNum;

        sumOfDice = new int[playerNum];
        scan = new Scanner(System.in);
    }

    // 무한루프 돌리는 조건 Game을 참, 두 번째 반복에서 옵션 여부를 줄 Option을 거짓
    public void playOctahedron() {
        int octahedronDice;
        int cnt = 0;

        for (int i = 0; i < playerNum; i++) {
            System.out.printf("%d번 사용자 게임 시작 !\n", i);
            octahedronGame = true;

            while (octahedronGame) {
                octahedronDice = (int) (Math.random() * 8) + 1;
                cnt++;

                if (cnt == 3) {
                    cnt = 0;
                    break;
                }

                System.out.printf("%d번 사용자, %d번째 시도, 주사위 눈금 = %d\n", i, cnt, octahedronDice);

                sumOfDice[i] += octahedronDice;

                if (cnt == 1 && octahedronDice % 2 == 0) {
                    octahedronGame = false;
                    cnt = 0;
                } else if (cnt == 2 && octahedronDice % 2 == 0) {
                    switch (octahedronDice) {
                        // 2: 이미 주사위를 얻은 사람의 주사위 값을 3 파괴한다.
                        case 2:
                            for (int j = i - 1; j >= 0; j--) {
                                sumOfDice[j] -= 3;
                            }
                            break;
                        // 4: 지정한 사용자의 주사위 값을 0 으로 만든다.
                        case 4:
                            System.out.print("누굴 작살낼까요 ? ");
                            int tmp = scan.nextInt();
                            sumOfDice[tmp] = 0;
                            break;
                        // 6: 모든 플레이어의 주사위 값을 2 파괴한다.
                        case 6:
                            for (int j = i; j >= 0; j--) {
                                sumOfDice[j] -= 2;
                            }
                            break;
                        // 8: 자신을 제외한 모든 플레이어의 주사위 값을 3 상승시킨다.
                        case 8:
                            for (int j = 0; j <= 2; j++) {
                                if (j == i) {
                                    continue;
                                }

                                sumOfDice[j] += 3;
                            }
                            break;
                    }
                }
            }
        }
    }

    public void playGame() {
        // 사용자 숫자 만큼 반복
        for (int i = 0; i < playerNum; i++) {
            // 사용자가 가지고 있는 주사위 숫자 만큼 반복
            for (int j = 0; j < numOfDice; j++) {
                int dice = (int) (Math.random() * 6) + 1;

                // 6이면 제끼고
                if (dice == ruleNum) {
                    continue;
                }

                // 아니면 합산
                sumOfDice[i] += dice;
            }
        }
    }

    public void printSumOfOctahedronDice() {
        for(int i = 0; i < playerNum; i++) {
            System.out.printf("%d 번째 사용자의 주사위 눈금 합 = %d\n",
                    i, sumOfDice[i]);
        }
    }

    // 통합을 위해 수정이 필요한 메서드
    public void printSumOfDice() {
        for (int i = 0; i < playerNum; i++) {
            // sumOfDice[playerArr[i] - 1]
            // playerArr[i] = 1 ~ 5 전체  - 1 = 0 ~ 4
            // sumOfDice[0 ~ 4]
            // 여기 나오는 숫자 0 ~ 4는 플레이어 번호가 되므로
            // 결국 플레이어의 출력 숫자가 그대로 유지한 상태로 나온다.
            // 사용자 번호는 바뀌지만 sumOfDice 값은 그대로 유지되어 나왔음
            // 정렬을 안 했다면 괜찮지만 정렬을 했기 때문에
            // 정렬된 상태인 sumOfDice 를 그대로 뿌려야 정렬값을 볼 수 있었음
            System.out.printf("%d 번째 사용자의 주사위 눈금합 = %d\n",
                    playerArr[i], sumOfDice[i]);
        }
    }

    // 오직 개수가 적은 것에서만 유리한 정렬 알고리즘 (삽입 정렬)
    public void insertSort() {
        int i, j, numKey, playerNoKey, len = sumOfDice.length;

        // numKey 값은 교체 대상의 백업
        // playerNoKey 도 마찬가지

        // 현재 케이스에서는 숫자만 정렬하면 안 되고
        // 사용자 번호를 같이 처리(핸들링)해줘야 한다.

        //  1     2     3       - 사용자 번호
        //  8     4     6       - 주사위 눈금
        // [0]   [1]   [2]      - 배열의 인덱스

        // 요약 :
        // i 가 기준점
        // j 는 i 보다 앞에 있는 모든 대상들
        // 기준점 앞에 있는 값들이 기준점보다 큰가 ?
        // 크다면 위치를 조정한다.
        for (i = 1; i < len; i++) {
            numKey = sumOfDice[i];
            playerNoKey = playerArr[i];

            // (j != -1) 은 sumOfDice[-1] 에 의해 배열 인덱스 오류를 방지하기 위해 도입
            for (j = i - 1; (j != -1) && (sumOfDice[j] > numKey); j--) {
                sumOfDice[j + 1] = sumOfDice[j];
                playerArr[j + 1] = playerArr[j];
            }

            // 1 번째
            //  1     1     3       - 사용자 번호
            //  8     8     6       - 주사위 눈금
            // [0]   [1]   [2]      - 배열의 인덱스

            // 2 번째
            //  2     1     1       - 사용자 번호
            //  4     8     8       - 주사위 눈금
            // [0]   [1]   [2]      - 배열의 인덱스

            sumOfDice[j + 1] = numKey;
            playerArr[j + 1] = playerNoKey;

            // 1 번째
            //  2     1     3       - 사용자 번호
            //  4     8     6       - 주사위 눈금
            // [0]   [1]   [2]      - 배열의 인덱스

            // 2 번째
            //  2     3     1       - 사용자 번호
            //  4     6     8       - 주사위 눈금
            // [0]   [1]   [2]      - 배열의 인덱스

            // 카드 주어졌을 때
            // 카드를 순서대로 배치한다고 생각했을 때 동작하는 메커니즘과 동일
        }
    }
}

/*
Homework4
class DiceGame {
    int playerNum, max, maxIndex;
    int player[];

    public DiceGame(int playerNum, int dice) {
        this.playerNum = playerNum;
        player = new int[playerNum];

        for (int i = 0; i < playerNum; i++) {
            for (int j = 0; j < dice; j++) {
                int randNum = (int) (Math.random() * 6) + 1;

                if (randNum == 6) {
                    continue;
                }

                player[i] += randNum;
            }
            System.out.printf("%3d", player[i]);
        }
    }

    public void findMax() {
        maxIndex = 0;

        for (int i = 0; i < playerNum; i++) {
            if (player[maxIndex] <= player[i]) {
                maxIndex = i;
                max = player[i];
            }
        }
    }

    public void printWinner() {
        System.out.printf("\n합산 결과 %d점으로 ", max);
        for (int i = 0; i < maxIndex; i++) {
            if (player[i] == max) {
                System.out.printf("%d, ", i + 1);
            }
        }
        System.out.printf("%d번째 플레이어 승리 !\n", maxIndex + 1);
    }
}

Homework6
class SpecialDiceGame {
    int gamer, maxIndex, winner;
    int[] player, diceNum1, diceNum2;

    Scanner scan = new Scanner(System.in);

    public void setDiceGame(int gamer) { // 플레이어 수 지정
        this.gamer = gamer;
        player = new int[gamer];
        diceNum1 = new int[gamer];
        diceNum2 = new int[gamer];

        for (int i = 0; i < gamer; i++) { // 점수 초기화
            player[i] = 0;
            diceNum2[i] = 0;
        }
    }

    public void playDiceGame() {
        for (int i = 0; i < gamer; i++) {
            diceNum1[i] = (int)(Math.random() * 8) + 1;

            player[i] += diceNum1[i]; // 주사위 굴린 결과 저장

            if (diceNum1[i] % 2 != 0) { // 홀수가 나오면 한 번 더 굴릴 수 있다.
                diceNum2[i] = (int) (Math.random() * 8) + 1;

                player[i] += diceNum2[i]; // 홀수만 아니라면 앞서 얻은 값에 두 번째 나온 값을 추가한다.

                switch (diceNum2[i]) {
                    case 2: // 2: 이미 주사위를 얻은 사람의 주사위 값을 3 파괴한다. (본인 제외. 본인 포함이면 j <= i)
                        for (int j = 0; j < i; j++) {
                            player[j] -= 3;
                        }

                        break;
                    case 4: // 4: 지정한 사용자의 주사위 값을 0 으로 만든다.
                        System.out.printf("Player %d 두 번째 결과 %d !\n" +
                                "점수를 초기화 시킬 Player 번호를 입력하세요. ", i + 1, diceNum2[i]);
                        int zero = scan.nextInt();

                        player[zero - 1] = 0;
                        System.out.printf("Player %d 점수 삭제\n\n", zero);

                        break;
                    case 6: // 6: 모든 플레이어의 주사위 값을 2 파괴한다.
                        for (int j = 0; j < gamer; j++) {
                            player[j] -= 2;
                        }

                        break;
                    case 8: // 8: 자신을 제외한 모든 플레이어의 주사위 값을 3 상승시킨다.
                        for (int j = 0; j < gamer; j++) {
                            if (j != i) {
                                player[j] += 3;
                            }
                        }

                        break;
                    default: // 연속해서 홀수가 나오면 0점 처리된다.
                        player[i] = 0;
                }
            }

            for (int j = 0; j < gamer; j++) { // 합산 결과는 최소 0 이상이다.
                if (player[j] < 0) { // 음수일 시 0으로 값 변경
                    player[j] = 0;
                }
            }
        }
    }

    public void resultDiceGame() {
        maxIndex = 0;

        for (int i = 1; i < gamer; i++) {
            if (player[maxIndex] <= player[i]) { // 배열의 가장 높은 값을 가진 인덱스 검색
                maxIndex = i; // 값 중복 시 마지막 인덱스 저장됨
            }
        }
    }

    public void printGameResult() {
        winner = 1; // 가장 높은 점수를 얻은 인원 수 (기본 1명)

        System.out.println("중간 결과"); // 규칙 3 적용 전
        for (int i = 0; i < gamer; i++) {
            System.out.printf("Player %d : %d (%d + %d)   ",
                    i + 1, diceNum1[i] + diceNum2[i], diceNum1[i], diceNum2[i]);
        }
        System.out.println();

        System.out.println("\n최종 결과");
        for (int i = 0; i < gamer; i++) {
            System.out.printf("Player %d : %d점\t", i + 1, player[i]);
        }
        System.out.println();

        // 무승부 확인
        for (int i = 0; i < maxIndex; i++) { // 배열 최대값을 가진 인덱스 중 마지막까지 반복
            if (player[i] == player[maxIndex]) { // 그 전까지 같은 값이 또 있는지 확인
                System.out.printf("Player %d - ", i + 1);
                winner++; // 있다면 인원 수 증가
            }
        }

        // 배열 최대값을 가진 마지막 인덱스 값 출력
        System.out.printf("Player %d ", maxIndex + 1);

        if (winner == 1) { // 가장 높은 점수를 얻은 인원이 1명이면 승리
            System.out.println("승리 !");
        } else { // 2명 이상이면 무승부
            System.out.println("무승부 !\n\n게임을 재시작 합니다.\n");
        }
    }
}
 */