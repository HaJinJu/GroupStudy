package Eighth;

import java.util.Scanner;

class RSP {
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
        } else if (myRSP == 0 && computerRSP == 1) {
            System.out.println("Me: Rock  vs  Scissors :Computer - Win!!");
        } else if (myRSP == 0 && computerRSP == 2) {
            System.out.println("Me: Rock  vs  Paper :Computer - Lose!!");
        }

        if (myRSP == 1 && computerRSP == 0) {
            System.out.println("Me: Scissors  vs  Rock :Computer - Lose!!");
        } else if (myRSP == 1 && computerRSP == 1) {
            System.out.println("Me: Scissors  vs  Rock :Scissors - Draw!!");
        } else if (myRSP == 1 && computerRSP == 2) {
            System.out.println("Me: Scissors  vs  Paper :Computer - Win!!");
        }

        if (myRSP == 2 && computerRSP == 0) {
            System.out.println("Me: Paper  vs  Rock :Computer - Win!!");
        } else if (myRSP == 2 && computerRSP == 1) {
            System.out.println("Me: Paper  vs  Scissors :Computer - Lose!!");
        } else if (myRSP == 2 && computerRSP == 2) {
            System.out.println("Me: Paper  vs  Paper :Computer - Draw!!");
        }
    }
}

public class Homework5 {
    public static void main(String[] args) {
        // 5) 컴퓨터와 가위 바위 보 게임을 할 수 있도록 프로그램을 만들어보자!

        RSP rsp = new RSP();

        rsp.playGame();

    }
}
