package JAVA_2021_01_11_Ninth;

public class HW04_Answer {
    public static void main(String[] args) {
        MyDice md = new MyDice(5,3,6);

        md.playGame();
        md.printSumOfDice();

        System.out.printf("\n-----------정렬후-----------\n\n");

        md.insertSort();
        md.printSumOfDice();
    }
}
