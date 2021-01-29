package Seventh;

class TriangleExtent {
    // 3) 클래스를 활용하여 삼각형의 넓이를 구하는 프로그램을 만들어보자!
    // 3-1 밑변 x 높이 1/2
    float height;
    float base;

    public void setHeight(float height) {
        this.height = height;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public double extentCalculator() {


        return height * base * (0.5);
    }

    public void print() {
        System.out.println("삼각형의 넓이: " + extentCalculator());
    }
}

public class Exercise3 {
    public static void main(String[] args) {

        // 클래스 변수(인스턴스)를 통해서 내부에 있는 메서드 호출이 가능하다.
        // 사용방법은 .  입력해서 내부에 접근하겠음을 알린다.

        TriangleExtent te = new TriangleExtent();

        te.setBase(5);
        te.setHeight(5);

        te.print();
    }
}
