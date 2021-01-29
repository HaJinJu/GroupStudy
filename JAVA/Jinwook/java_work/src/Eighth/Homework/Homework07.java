package Eighth.Homework;
//3 ~ 33 까지의 홀수 합산 결과를 출력해보자!
class Num2 {
    int firstNum;
    int lastNum;
    int divNum;
    int sum;

    public int printSum(int fistNum, int lastNum, int divNum) {
        this.firstNum = fistNum;
        this.lastNum = lastNum;
        this.divNum = divNum;
        sum = 0;
        for (int i = fistNum; i <= lastNum; i++) {
            if (i % divNum != 0) {
                System.out.println("holsu = "+ i);

                sum += i;
            }


        }
        return sum;


    }
}

    public class Homework07 {
        public static void main(String[] args) {
            Num2 nu2 = new Num2();
            System.out.println("sum = " + nu2.printSum(3, 33, 2));
        }
    }
