public class Quiz4 {
    public static void main(String[] args) {
        int randNumA = (int) Math.random();
        int randNumB = (int) Math.random();
        randNumA = (int) (Math.random() * 6) + 1;
        System.out.println("A 주사위 결과는 = + " + randNumA);

        randNumB = (int) (Math.random() * 6) + 1;
        System.out.println("B 주사위 결과는 = + " + randNumB);
        if (randNumA > randNumB) {
            System.out.println("A주사위의 승리!");
        } else if (randNumA == randNumB) {
            System.out.println("무승부!");
        } else {
            System.out.println("B주사위의 승리!");
        }
    }
}
