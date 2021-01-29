package Ninteenth;

public class SynchronizedBank {
    private int money = 100000;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public synchronized void plusMoney(int plus) {
        int m = getMoney();

        System.out.println("m = " + m);

        setMoney(m + plus);
    }

    public synchronized void minusMoney(int minus) {
        int m = getMoney();

        System.out.println("m = " + m);

        setMoney(m - minus);
    }
}
