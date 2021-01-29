package jan0126;

class diceBattle {
    int myDice;
    int comDice;

    public diceBattle(){
        myDice = (int) (Math.random() * 6) + 1;
        comDice = (int) (Math.random() * 6) + 1;
    }
        public void makeDouble() {
            for (int i = 0; i < 1; i++) {
                    myDice += myDice;
                    comDice += comDice;
                }
            }

        public void seeWhoWin () {
            System.out.println("두번돌린 comDice의 총합 = " + comDice);
            System.out.println("두번돌린 myDice의 총합 = " + myDice);
            if (myDice > comDice) {
                System.out.println("I win");
            } else if (myDice < comDice) {
                System.out.println("Computer win");
            } else {
                System.out.println("Draw");
            }

        }
    }

public class First {
    public static void main(String[] args) {

        diceBattle db = new diceBattle();
        db.makeDouble();
        db.seeWhoWin();
    }
}
