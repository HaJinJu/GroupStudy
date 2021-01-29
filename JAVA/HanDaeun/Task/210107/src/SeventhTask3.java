/*
    < 연습 문제 3 >

클래스를 활용하여 삼각형의 넓이를 구하는 프로그램을 만들어보자!
   3-1) 밑변 * 높이 * 0.5
   3-2) 1/2 ab sin x
   3-3) 외적

 */


class TriangleAreaCalculator {
    float base, height;
    float a, b, theta;

    public void setBase(float base) {
        this.base = base;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setA(float a) {
        this.a = a;
    }

    public void setB(float b) {
        this.b = b;
    }

    public void setTheta(float theta) {
        this.theta = theta * (float)Math.PI / 180.0f;
    }


    public float calcArea1() {
        return (base * height) / 2.0f;
    }

    public float calcArea2() {
        return (a * b * (float)Math.sin(theta)) / 2.0f;
    }

}


public class SeventhTask3 {
    public static void main(String[] args) {
        TriangleAreaCalculator tri = new TriangleAreaCalculator();

        tri.setBase(4.5f);
        tri.setHeight(6.2f);
        System.out.println("삼각형의 넓이는 = " + tri.calcArea1());

        tri.setA(4.5f);
        tri.setB(6.2f);
        tri.setTheta(90.0f);
        System.out.println("삼각형의 넓이는 = " + tri.calcArea2());
    }
}
