package Fifteenth.Homework;

import java.util.Scanner;

public class RSP_Game extends RSPClient implements Game {

    public RSP_Game() {
        System.out.println("가위 = 1 바위 = 2 보 = 3");
    }

    public int game(int my, int your) {
        int tmpNum1 = my - 1;
        int tmpNum2 = my + 1;

        if (tmpNum1 < 0) {
            tmpNum1 = 3;
        }

        if (tmpNum2 > 3) {
            tmpNum2 = 1;
        }

        if(tmpNum1 == your) {
            System.out.println("승리!");
        } else if (tmpNum2 == your) {
            System.out.println("패배!");
        } else {
            System.out.println("무승부!");
        }

        return 0;
    }

    public void printRSP(int my) {

        if (my == 1) System.out.println("가위!");
        if (my == 2) System.out.println("바위!");
        if (my == 3) System.out.println("보!!");
    }
}
