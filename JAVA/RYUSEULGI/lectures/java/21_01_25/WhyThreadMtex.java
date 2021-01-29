class A extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            WhyThreadMtex.fb.plusMoney(3000);
        }
        System.out.println("plusMOney(3000): " + WhyThreadMtex.fb.getMoney());
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            WhyThreadMtex.fb.minusMoney(1000);
        }
        System.out.println("plusMOney(1000): " + WhyThreadMtex.fb.getMoney());
    }
}

public class WhyThreadMtex {

    public static FailedBank fb = new FailedBank();

    public static void main(String[] args) {

        System.out.println(fb.getMoney());
        A a = new A();
        B b = new B();

        a.start();
        b.start();

        // 이 문제를 해결하기 위해 Mutex, Spinlock이 필요함
    }
}