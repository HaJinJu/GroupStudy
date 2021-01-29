class C extends Thread {
    public void run() {
        BankTest.sb.plusMoney(3000);
        System.out.println("plusMOney(3000): " + BankTest.sb.getMoney());
    }
}

class D extends Thread {
    public void run() {
        BankTest.sb.minusMoney(1000);
        System.out.println("minusMOney(1000): " + BankTest.sb.getMoney());
    }
}

public class BankTest {

    public static SynchronizedBank sb = new SynchronizedBank();

    public static void main(String[] args) {

        System.out.println("원금" + sb.getMoney());
        C c = new C();
        D d = new D();

        c.start();
        d.start();

        // 이 문제를 해결하기 위해 Mutex, Spinlock이 필요함
    }
}