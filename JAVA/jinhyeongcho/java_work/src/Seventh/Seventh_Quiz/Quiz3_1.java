package Seventh.Seventh_Quiz;

class Triangle{
    float base;
    float height;

    float line1;
    float line2;
    float theta;

//    float[] v1;
//    float[] v2;

//    public void setV1(float[] v1) {
//        this.v1 = v1;
//    }
//
//    public void setV2(float[] v2) {
//        this.v2 = v2;
//    }

    public void setLine1(float line1) {
        this.line1 = line1;
    }

    public void setLine2(float line2) {
        this.line2 = line2;
    }

    public void setTheta(float theta) {
        this.theta = theta * (float)Math.PI/180.0f;
    }



   public float getLine1() {
        return line1;
    }

    public float getLine2() {
        return line2;
    }

    public float getTheta() {
        return theta;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float calcArea(){
        return  base * height * 0.5f;
    }
    public float calcArea2(){
        // 자바에서 지원하는 수학 라이브러리는 자동으로 호도법을 만들어주지 않음
        // 그러므로 우리가 직접 각도를 radian
        return 0.5f* line1 * line2 * (float)Math.sin(theta);
    }

}
public class Quiz3_1 {
    public static void main(String[] args) {
        Triangle tri = new Triangle();

        tri.setBase(23.5f);
        tri.setHeight(3.5f);
        System.out.println("삼각형의 넓이는 = "+ tri.calcArea());
    }
}
