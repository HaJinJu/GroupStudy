package SeventhHomeWork;

class numberStudy {
    int num;
    int sum;
    final int number1 = 11;


    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        for (int i = num; i < 11; i++) {
            System.out.println("값 출력 :" + i);
        }
        this.num = num;
    }


    public void setSum(int sum) {
        for (int i = sum; i < 11; i++) {
            if (i < 100) {
                sum += i;
                System.out.println("값 출력 :" + sum);

            }


            this.sum = sum;
        }
    }

    public int getSum() {
        return sum;
    }
}
