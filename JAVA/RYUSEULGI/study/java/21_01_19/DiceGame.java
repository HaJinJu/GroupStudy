class Dice {

    int random;

    public int randomDice() {
        random = (int) (Math.random() * 6) + 1;
        return random;
    }

    public void printWinner(int a, int b) {

        if (a > b) {
            System.out.println("서버 승리");
        } else if (a < b) {
            System.out.println("클라이언트의 승리");
        } else {
            System.out.println("무승부");
        }
    }
}