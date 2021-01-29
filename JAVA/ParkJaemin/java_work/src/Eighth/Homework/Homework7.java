package Eighth.Homework;

class oddsum {
    int start;
    int end;
    int sum;

    public oddsum(int start, int end) {
        this.start = start;
        this.end = end;



        for (int i = start; i <= end; i++) {
            if (i % 2 == 1) {
                sum += i;
//
            }
        }
    }
}

public class Homework7 {
    public static void main(String[] args) {
        oddsum A = new oddsum(3,33);
        System.out.println("3~33 중 홀수의 합은 = " + A.sum);


    }
}