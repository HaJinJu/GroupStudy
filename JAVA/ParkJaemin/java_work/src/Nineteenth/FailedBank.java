package Nineteenth;

public class FailedBank {
    private int money = 100000;

    public  int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public  void plusMoney(int plus){
        int m = getMoney(); //컨텍스트 스위칭을 하다보면 -쪽에서 값을 갱신할 수 있어서 이전 값을 연산하고 set을 함 다시 set 읽은 애는 이상한 값을 읽어서 출력 가능성

        try {
            Thread.sleep(80);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        setMoney(m + plus);
    }
    public  void minusMoney(int minus){
        int m = getMoney();
        try{
            Thread.sleep(50);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
           setMoney(m - minus);
    }
}
