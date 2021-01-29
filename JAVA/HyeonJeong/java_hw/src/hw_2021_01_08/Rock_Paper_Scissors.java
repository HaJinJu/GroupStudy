package hw_2021_01_08;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Rock_Paper_Scissors {
    final int SCISSORS = 1;
    final int ROCK = 2;
    final int PAPER = 3;
    Scanner scanner;

    int computer_Number;
    int player_Number;

    boolean is_Duel_Mode;

    Rock_Paper_Scissors() { // 연습모드: 무승부가 나와도 게임이 끝난다.
        scanner = new Scanner(System.in);
        is_Duel_Mode = false;

        System.out.println("[practice mode]");
    }

    Rock_Paper_Scissors(boolean is_Duel_Mode) { // 결투모드: (승)(패)로만 승부가 끝난다.
        scanner = new Scanner(System.in);     // 무승부일 경우 게임이 끝나지 않음
        if(is_Duel_Mode != true) {
            System.out.println("If you want to play [duel mode] please set up [true]");
        } else if(is_Duel_Mode = true){
            System.out.println("[duel mode]");
        }
    }

    public void play_Game() { // do~while문에서 while문으로 변경
        while(is_Duel_Mode) { // true를 입력했을때에만 동작할수있도록
            computer_Number = (int)(Math.random() * 3) + 1;
            System.out.println("Insert the number! scissors[1], rock[2], paper[3]");
            player_Number = scanner.nextInt();

            if (player_Number == computer_Number) {
                System.out.println("DRAW");
            } else if (player_Number == SCISSORS && computer_Number == PAPER) {
                System.out.println("player Win!");
                break;
            } else if (player_Number == ROCK && computer_Number == SCISSORS) {
                System.out.println("player Win!");
                break;
            } else if (player_Number == PAPER && computer_Number == ROCK) {
                System.out.println("player Win!");
                break;
            } else {
                System.out.println("computer Win!");
                break;
            }
        }
    }
}
