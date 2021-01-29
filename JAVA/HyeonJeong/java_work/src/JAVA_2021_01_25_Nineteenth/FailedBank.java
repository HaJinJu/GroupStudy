package JAVA_2021_01_25_Nineteenth;

public class FailedBank {
    public static int money = 100000;

    public static int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    public void plusMoney(int plus) {
        int m = this.getMoney();

        try {
            Thread.sleep(80);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        setMoney(m + plus);
    }

    public void minusMoney(int minus) {
        int m = this.getMoney();

        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        setMoney(m - minus);
    }

}
