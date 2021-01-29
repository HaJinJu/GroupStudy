// synchronized를 통해 
// 가ㅇ제로 thread간의 순서를 조정해 줄 수 있다. 

public class SynchronizedBank {
    private int money = 100000;

    public int getMoney() {
        return this.money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public synchronized void plusMoney(int plus) {
        int m = getMoney();
        setMoney(m + plus);
    }

    public synchronized void minusMoney(int minus) {
        int m = getMoney();
        setMoney(m - minus);
    }
}
