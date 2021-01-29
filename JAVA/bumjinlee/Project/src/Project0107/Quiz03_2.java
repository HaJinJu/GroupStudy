package Project0107;

public class Quiz03_2 {
    public static void main(String[] args) {
        Triangle tri = new Triangle();

        tri.setLine1(2);
        tri.setLine2(2);
        tri.setTheta(90.0f);

        System.out.println("삼각형의 넓이는 = " + tri.calcArea2());
    }
}