package Nineteenth;

public class SynchronizedBank {
    private int money = 100000; // private로 해야 동기화가 의미가 있음. 직접 접근하면 변경 가능성이 있음

    public  int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public synchronized void plusMoney(int plus){ // sychronized로 메서드를 동기화 싱크로가 없다면 금액은 -가 발생
        int m = getMoney();

//        try {
//            Thread.sleep(80);
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }

        System.out.println("m =" + m);
        setMoney(m + plus);
    }
    // 싱크로 나이즈드 키워드를 통해서
    // 강제로 스레드간의 순서를 조정해줄수 있다.
    // 그러므로 서로 화장실 들어가겠다고 싸우는 Race Condition을 무마할 수 있다.
    public synchronized void minusMoney(int minus){
        int m = getMoney();
//        try{
//            Thread.sleep(50);
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }

        System.out.println("m =" + m);
        setMoney(m - minus);
    }
}


//컨텍스트 스위칭을 하다보면 -쪽에서 값을 갱신할 수 있어서 이전 값을 연산하고 set을 함 다시 set 읽은 애는 이상한 값을 읽어서 출력 가능성