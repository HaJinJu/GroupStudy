package Seventh.Seventh_Quiz;


public class Quiz3_2 {
    public static void main(String[] args) {
    Triangle tri = new Triangle();

    tri.setLine1(2f);
    tri.setLine2(2f);
    tri.setTheta(90.0f);
    System.out.println("삼각형의 넓이는 = "+ tri.calcArea2());
 }
}
