package Eighth.Homework;

//생성자를 사용해서 1 ~ 10 까지 출력하는 프로그램을 작성해보자!
class Num {
    int[] arr;
    int firstNum;
    int lastNum;
    int divNum;

    public Num(int fistNum, int lastNum) {
        this.firstNum = fistNum;
        this.lastNum = lastNum;

        arr = new int[lastNum];

        int cnt = 1;
        for (int i = fistNum; i <= lastNum; i++) {
            System.out.printf("%4d", i);

            if (cnt % 5 == 0) {
                System.out.println("");
            }
            cnt++;


        }


    }

    public Num(int fistNum, int lastNum, int divNum) {
        this.firstNum = fistNum;
        this.lastNum = lastNum;
        this.divNum = divNum;

        arr = new int[lastNum];

        int cnt = 1;
        for (int i = fistNum; i <= lastNum; i++) {
            if (i % divNum == 0) {
                System.out.printf("%3d", i);
            }
            if (cnt % 5 == 0) {
                System.out.println("");
            }
        }
        cnt++;

    }

}