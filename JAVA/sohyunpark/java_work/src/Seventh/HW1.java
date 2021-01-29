package Seventh;

class Number{

    public void setNumber(){
        for(int i = 1; i < 11; i++){
            System.out.println(i);
        }
    }

}

public class HW1 {
    public static void main(String[] args) {
        // 1 ~ 10 까지 출력하는 클래스 내의 메서드를 만들어보자
        Number nu = new Number();

        nu.setNumber();
    }
}
