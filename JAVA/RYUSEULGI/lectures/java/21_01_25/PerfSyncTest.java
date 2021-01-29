class X extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            synchronized (PerfSyncTest.psb) {
                PerfSyncTest.psb.plusMoney(3000);
            }
        }
        System.out.println(PerfSyncTest.psb.getPlusMsg());
        System.out.println("plusMOney(3000): " + PerfSyncTest.psb.getMoney());
    }
}

class Y extends Thread {
    public void run() {
        synchronized (PerfSyncTest.psb) {
            PerfSyncTest.psb.minusMoney(3000);
        }
        System.out.println(PerfSyncTest.psb.getMinusMsg());
        System.out.println("minusMOney(3000): " + PerfSyncTest.psb.getMoney());
    }
}

public class PerfSyncTest {

    public static PerfSyncBank psb = new PerfSyncBank();

    public static void main(String[] args) {

        System.out.println(psb.getMoney());
        X x = new X();
        Y y = new Y();

        x.start();
        y.start();

    }
}