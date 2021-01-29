package Seventh.SeventhHomework;

class Number {
    int num;
    int sum;
    int[] arr;

    public void setArr() {
        arr = new int[21];
    }

    public void setArr2() {
        arr = new int[20];
    }

    public void setArr3() {
        arr = new int[33];
    }

    public void getNum() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public int getSum() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;


        }

        return sum;
    }

    public void mutiple() {
        for (int i = 1; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }
    }

    public void mutiple2() {
        for (int i = 1; i <= arr.length; ++i) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    public void mutiple3() {
        for (int i = 3; i <= 33; ++i) {
            if (i % 2 == 0 || i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}









