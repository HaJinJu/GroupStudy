public class PerfSyncBank {
    private int money = 100000;

    private String plusMsg = "";
    private String minusMsg = "";

    public String getPlusMsg() {
        return this.plusMsg;
    }

    public String getMinusMsg() {
        return this.minusMsg;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void plusMoney(int plus) {
        int m = getMoney();
        setMoney(m + plus);
    }

    public void minusMoney(int minus) {
        int m = getMoney();
        setMoney(m - minus);
    }
}
