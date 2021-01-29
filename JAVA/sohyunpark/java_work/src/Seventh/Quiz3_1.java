package Seventh;

class Triangle {
    float base;
    float height;

    float line1;
    float line2;
    float theta;

    public void setLine1(float line1) {

        this.line1 = line1;
    }

    public void setLine2(float line2) {

        this.line2 = line2;
    }

    // return 타입이 void이므로 반환값은 없음
    // 입력은 외부에서 들어오는 base라는 값
    public void setBase(float base) {
        // 클래스 내부의 base에 외부에서 들어오는 base를 대입해서 저장
        this.base = base;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    // 360 = 2 * pi
    // 90 = 1/2 * pi
    // theta = 2 * pi / 360 = pi / 180
    public void setTheta(float theta) {
        this.theta = theta * (float)Math.PI / 180.0f;
    }

    // 밑변 * 높이 * 0.5 = 삼각형 넓이
    public float calcArea() {
        return base * height * 0.5f;
    }

    // 두 변(a, b)의 길이를 알고 그 사이 각도를 알 때 삼각형의 넓이
    // 1/2 * a * b * sin(사이 각도) = 삼각형의 넓이
    public float calcArea2() {
        // 자바에서 지원하는 수학 라이브러리는 자동으로 호도법을 만들어주지 않음
        // 그러므로 우리가 직접 각도를 radian으로 변환해야 한다.
        return 0.5f * line1 * line2 * (float)Math.sin(theta);
    }
}

public class Quiz3_1 {
    public static void main(String[] args) {
        // 클래스를 활용하여 삼각형의 넓이를 구한다.
        // 밑변 * 높이 * 0.5

        Triangle tri = new Triangle();

        // 클래스 변수(인스턴스)를 통해서 내부에 있는 메서드 호출이 가능하다.
        // 사용방법은 .을 입력해서 내부에 접근하겠음을 알린다.
        tri.setBase(2.0f);
        tri.setHeight(3.5f);
        System.out.println("삼각형의 넓이 : " + tri.calcArea());
    }
}
