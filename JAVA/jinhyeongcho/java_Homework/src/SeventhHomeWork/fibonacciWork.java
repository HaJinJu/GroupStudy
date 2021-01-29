package SeventhHomeWork;

class fibonacciWork {
    int first = 1;
    int second = 1;
    int res;

    public void setRes(int res) {
        //res = first + second;
        this.res = res;
    }

    public void setFirst(int first) {
        //first = second;
        this.first = first;
    }

    public void setSecond(int second) {
        // second = res;
        this.second = second;
    }

    public void third(int num) {
        System.out.printf("값:%d\n값:%d\n", first, second);
        for (int i = 1; i < num; i++) {
            res = first + second;
            first = second;
            second = res;
            System.out.println("값:" + res);
        }


    }
}
