import java.util.Scanner;

class RSP {
    Scanner scan = new Scanner(System.in);
    final int SISSOR = 1;
    final int ROCK = 2;
    final int PEPER = 3;
    int user;
    int com;

    public void printWinner(int user, int com) {
        if (user == com) {
            System.out.println("무승부");
        } else if (user == SISSOR && com == PEPER) {
            System.out.println("user 승!");
        } else if (user == ROCK && com == SISSOR) {
            System.out.println("user 승~");
        } else if (user == PEPER && com == ROCK) {
            System.out.println("user 승");
        } else {
            System.out.println("computer 승");
        }
    }
}