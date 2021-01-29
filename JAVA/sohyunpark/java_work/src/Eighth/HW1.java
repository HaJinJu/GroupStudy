package Eighth;

class PrintNumber {
    int sum = 0, sum2 = 0;

    public PrintNumber(int start, int end){

        for (int i = start; i <= end; i++){
            sum += i;

            if(i % 2 == 1){
                sum2 += i;
            }
        }
    }

    public void printValue(){
        System.out.println("합 : " + sum);
    }

    public void printValue2(){
        System.out.println("합 : " + sum2);
    }
}

public class HW1 {
    public static void main(String[] args) {
        // 생성자를 사용해서 1 ~ 10까지 출력하는 프로그램을 작성해보자
        PrintNumber pn = new PrintNumber(1, 10);

        pn.printValue();
    }
}
