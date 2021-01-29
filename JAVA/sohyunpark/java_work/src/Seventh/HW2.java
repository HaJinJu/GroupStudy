package Seventh;

class AddNumber {
    int sum = 0;

    public void setAddNumber(){

        for(int i = 1; i <11; i++){
            sum += i;
        }
        System.out.println("합 : " + sum);
    }


}

public class HW2 {
    public static void main(String[] args) {
        // 1 ~ 10 까지 숫자를 더한 결과를 출력하는 메서드를 만들어보자
        AddNumber an = new AddNumber();

        an.setAddNumber();
    }
}
