package Eighth.Homework;
//앞선 5 번 문제를 승부가 날 때까지 멈추지 않는 형태로 만들어보자!
public class Homework08 {
    public static void main(String[] args) {
        RSPGame rg = new RSPGame();
        rg.playerWant();
        rg.comWant();
        rg.result();
        rg.draw(rg.DRAW);
    }
}
