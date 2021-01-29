package hw_2021_01_08;

import java.util.Scanner;

public class Dice_Games {
    int rule_number;
    int player_number;
    int dice_number;
    int[] sum_of_dice; // player의 주사위 눈금 합
    int[] array_player;
    int[][] dice_per_player;
    boolean is_game_running;
    Scanner scan;

    public Dice_Games(int number_of_player, int number_of_dice, int number_of_rule) {
        this.player_number = number_of_player;
        this.dice_number = number_of_dice;
        this.rule_number = number_of_rule;
        // player_number: 사용자 숫자를 받기 위한 변수
        // dice_number: 주사위 숫자
        // rule_number: 6이 나오면 0으로 만들기 위한 특수 규칙이 적용되는 수
        dice_per_player = new int[number_of_player][number_of_dice];

        array_player = new int[number_of_player];
        sum_of_dice = new int[number_of_player];

        for(int i = 0; i < number_of_player; i++) {

            sum_of_dice[i] = 0;
            array_player[i] = i + 1; // player 1번부터 시작하기 위해 + 1
        }
    }

    public Dice_Games(int player_number) {
        this.player_number = player_number;

        sum_of_dice = new int[player_number];
    }

    public void playGame() {
        for(int i = 0; i < player_number; i++) {
            for(int j = 0; j < dice_number; j++) {
                dice_per_player[i][j] =
                        (int) (Math.random() * 6) + 1;
                if (dice_per_player[i][j] == rule_number) {
                    continue;
                }
                sum_of_dice[i] += dice_per_player[i][j];
            }
        }
//        for(int i = 0; i < player_number; i++) {
//            for(int j = 0; j < dice_number; j++) {
//                int dice = (int) (Math.random() * 6) + 1;
//
//                if (dice == rule_number) {
//                    continue;
//                }
//                sum_of_dice[i] += dice;
//            }
//        }
    }

    public void play_octahedron_dice() {
        final int MINUS_3_TO_MYSELF = 2;
        final int KILL_THE_PLAYER = 4;
        final int MINUS_2_ALL_PLAYER = 6;
        final int PLUS_3_EXCEPT_MYSELF = 8;

        int dice_octahedron;
        int trial = 0;

        for(int i = 0; i < player_number; i++) {
            System.out.printf("%d번 사용자 게임 시작!\n", i);
            is_game_running = true;

            while (is_game_running) {
                // 8면체 주사위라서 1 ~ 8까지
                dice_octahedron = (int) (Math.random() * 8) + 1;
                trial++;

                if(trial == 3) {
                    // 다음 player의 게임시작을 위한 시도 횟수 초기화
                    trial = 0;
                    break;
                }

                System.out.printf("%d번 사용자, %d번째 시도, 주사위 눈금 = %d\n",
                        i + 1, trial, dice_octahedron);

                sum_of_dice[i] += dice_octahedron;

                if (trial == 1 && dice_octahedron % 2 == 0) {
                    // 첫번째 시도에서 짝수가 나오면 그대로 게임 종료

                    is_game_running = false;
                    trial = 0; // 다음 player의 게임시작을 위한 시도 회수 초기
                } else if(trial == 2 && dice_octahedron % 2 == 0) {
                    // 2번째 시도에서 짝수가 나올경우 다음과 같은 효과가 실행된다.

                    switch (dice_octahedron) {
                        // 2: 이미 주사위를 얻은 사람의 주사위 값을 3 파괴한다.
                        case MINUS_3_TO_MYSELF:
                            for(int j = i - 1; j >= 0; j--) {
                                sum_of_dice[j] -= 3;
                            }
                            break;
                        // 4: 지정한 사용자의 주사위 값을 0 으로 만든다.
                        case KILL_THE_PLAYER:
                            // 1번 player가 이 능력을 3번 player에게 사용했을경우 능력이 적용되지 않았다.
                            System.out.print("누굴 작살낼까요 ? ");
                            int tmp = scan.nextInt();
                            sum_of_dice[tmp] = 0;
                            break;
                        // 6: 모든 플레이어의 주사위 값을 2 파괴한다.
                        case MINUS_2_ALL_PLAYER:
                            for(int j = i; j >= 0; j--) {
                                sum_of_dice[j] -= 2;
                            }
                            break;
                        // 8: 자신을 제외한 모든 플레이어의 주사위 값을 3 상승시킨다.
                        case PLUS_3_EXCEPT_MYSELF:
                            for(int j = 0; j < player_number; j++) {
                                if(j == i) {
                                    continue;
                                }
                                sum_of_dice[j] += 3;
                            }
                            break;
                    }
                }
            }
        }
    }

    public void print_sum_of_octahedron_dice() {
        for(int i = 0; i < player_number; i++) {
            System.out.printf(
                    "%d 번째 사용자의 주사위 눈금합 = %d\n",
                    i + 1, sum_of_dice[i]);
        }
    }

    public void print_sum_of_dice() {
        for(int i = 0; i < player_number; i++) {

            System.out.printf(
                    "%d 번째 사용자의 주사위 눈금합 = %d\n",
                    array_player[i], sum_of_dice[i]);
        }
    }

    public int print_winner() {
        int biggest_num = sum_of_dice[0];
        for(int i = 0; i < player_number; i++) {
            if(biggest_num < sum_of_dice[i]) {
                biggest_num = sum_of_dice[i];
            }
        }
        return biggest_num;
    }

    public void insert_sort() {
        int i, j, number_key, player_number_key = sum_of_dice.length;
        // len = 플레이어의 숫자
        // 로직 자체를 이해하지 못한 것 같다 ;ㅅ; 변수명을 바꿔봐도 모르겠다~ len?이건 뭐지?
        // i가 기준점 j는 i보다 앞에 있는 모든 대상들
        // 기준점 아에 있는 값들이 기준점보다 큰가?
        // 크다면 위치를 조정한다.
        // 뽑은 번호(number_key)로 앞의 번호를 판단
        for(i = 1; i < sum_of_dice.length; i++) { // 비교한 번호로 인해 자리가 변경될 경우를 생각하여 tmp에 저장;
            number_key = sum_of_dice[i]; // sum_of_dice[1]
            player_number_key = array_player[i]; // array_player[1]
                                    // number_key의 앞 숫자 > 뽑은 숫자
            for(j = i - 1; (j != -1) && (sum_of_dice[j] > number_key); j--) {
                sum_of_dice[j + 1] = sum_of_dice[j]; // sum_of_dice[1] = sum_of_dice[0]
                array_player[j + 1] = array_player[j]; // array_player[1] =  array_player[0]
            }

            sum_of_dice[j + 1] = number_key; // sum_of_dice[0 + 1] -> sum_of_dice[1] = number_key
            array_player[j + 1] = player_number_key; // array_player[0 + 1] -> array_player[1] = player_number_key

            //  1      2      3     - 사용자 번호
            //  8      4      6     - 주사위 눈금
            // [0]    [1]    [2]    - 배열의 인덱스

            // 1 번째
            //  1      1      3     - 사용자 번호
            //  8      8      6     - 주사위 눈금
            // [0]    [1]    [2]    - 배열의 인덱스

            // 2 번째
            //  2      1      1     - 사용자 번호
            //  4      8      8     - 주사위 눈금
            // [0]    [1]    [2]    - 배열의 인덱스
        }
    }
}
