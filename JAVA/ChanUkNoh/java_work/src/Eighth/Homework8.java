package Eighth;

import java.util.Scanner;

class RSP2 {
//    8) 앞선 5 번 문제를 승부가 날 때까지 멈추지 않는 형태로 만들어보자!
    int computerRSP;

    public void makeComputerRSP() {
        int rsp = (int)(Math.random() * 3);

        computerRSP = rsp;
    }

    public void playGame() {

        makeComputerRSP();

        Scanner scan = new Scanner(System.in);
        System.out.println("Rock = 0 Scissors = 1 Paper = 2");
        int myRSP = scan.nextInt();

        if (myRSP == 0 && computerRSP == 0) {
            System.out.println("Me: Rock  vs  Rock :Computer - Draw!!");
            System.out.println("Try Again!!");
            playGame();
        } else if (myRSP == 0 && computerRSP == 1) {
            System.out.println("Me: Rock  vs  Scissors :Computer - Win!!");
        } else if (myRSP == 0 && computerRSP == 2) {
            System.out.println("Me: Rock  vs  Paper :Computer - Lose!!");
        }

        if (myRSP == 1 && computerRSP == 0) {
            System.out.println("Me: Scissors  vs  Rock :Computer - Lose!!");
        } else if (myRSP == 1 && computerRSP == 1) {
            System.out.println("Me: Scissors  vs  Rock :Scissors - Draw!!");
            System.out.println("Try Again!!");
            playGame();
        } else if (myRSP == 1 && computerRSP == 2) {
            System.out.println("Me: Scissors  vs  Paper :Computer - Win!!");
        }

        if (myRSP == 2 && computerRSP == 0) {
            System.out.println("Me: Paper  vs  Rock :Computer - Win!!");
        } else if (myRSP == 2 && computerRSP == 1) {
            System.out.println("Me: Paper  vs  Scissors :Computer - Lose!!");
        } else if (myRSP == 2 && computerRSP == 2) {
            System.out.println("Me: Paper  vs  Paper :Computer - Draw!!");
            System.out.println("Try Again!!");
            playGame();
        }
    }
}

public class Homework8 {
//    8) 앞선 5 번 문제를 승부가 날 때까지 멈추지 않는 형태로 만들어보자!
    public static void main(String[] args) {
        RSP2 rsp = new RSP2();

        rsp.playGame();
    }
}