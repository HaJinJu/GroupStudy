package Eighth;

class DiceGame2 {
    final int FIXEDNUM = 2;

    int player1Score = 0;
    int player2Score = 0;
    int player3Score = 0;

    int dice;

    public void player1Turn() {
        roll();
        player1Score += dice;
    }

    public void player2Turn() {
        roll();
        player2Score += dice;
    }

    public void player3Turn() {
        roll();
        player3Score += dice;
    }

    public void roll() {
        dice = (int)(Math.random() * 8) + 1;


        if (dice % 2 != 0) {
            reRoll();
        }
    }

    public void reRoll() {
        dice = (int)(Math.random() * 8) + 1;

        if (dice % 2 != 0) {
            dice = 0;
        }

        if (dice == 2) {

        }

        if (dice == 4) {

        }

        if (dice == 6) {
            player1Score -= 2;
            player2Score -= 2;
            player3Score -= 2;
        }

        if (dice == 8) {

        }
    }
}

public class Homework6 {
    public static void main(String[] args) {

    }
}