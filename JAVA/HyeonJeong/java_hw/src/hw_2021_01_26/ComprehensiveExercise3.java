package JAVA_2021_01_26_Twentieth;

class Serial implements Runnable {
    int start;
    int end;
    double sum;

    public Serial(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public double getSum() {
        return sum;
    }

    @Override
    public void run() {
        for(int i = start; i < end; i++) {
            double res = i *(i * 0.0001);
            //System.out.printf("%d: = %f\n",i ,res);
            sum += res;
        }
    }
}

public class ComprehensiveExercise3 {
    public static void main(String[] args) {
        System.out.println("3. 1 ~ 1000000 까지의 숫자에 아래 연산을 고속으로 적용해보도록 한다.\n" +
                           "1 ~ 1000000 의 숫자는 표기상 n0 ... n1000000 으로 표기하겠다.\n" +
                           "nX * 0.0001 + n(X + 1) * 0.0002 + n(X + 2) * 0.0003 .....\n" +
                           "위 계산의 결과를 빠르게 계산할 수 있도록 프로그래밍 해보자!");
        JAVA_2021_01_26_Twentieth.Serial s1 = new JAVA_2021_01_26_Twentieth.Serial(1, 200000);
        JAVA_2021_01_26_Twentieth.Serial s2 = new JAVA_2021_01_26_Twentieth.Serial(200001, 400000);
        JAVA_2021_01_26_Twentieth.Serial s3 = new JAVA_2021_01_26_Twentieth.Serial(400001, 600000);
        JAVA_2021_01_26_Twentieth.Serial s4 = new JAVA_2021_01_26_Twentieth.Serial(600001, 800000);
        JAVA_2021_01_26_Twentieth.Serial s5 = new JAVA_2021_01_26_Twentieth.Serial(800001, 1000000);

        Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s2);
        Thread t3 = new Thread(s3);
        Thread t4 = new Thread(s4);
        Thread t5 = new Thread(s5);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        double totalSum = s1.getSum() + s2.getSum() + s3.getSum() + s4.getSum() + s5.getSum();
        System.out.println("totalSum = " + totalSum);
    }
}
