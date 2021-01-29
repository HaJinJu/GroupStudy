import java.util.Random;

// 스레드를 runnable 객체를 생성하면 스레드는 cpu를 획득하기 위해
// f12 누르면 runnable 정의 볼 수 있음 - runnable에 run이 있음
class Worker implements Runnable {
    String name;
    private int sleepTime;
    private final static Random generator = new Random();

    public Worker(String name) {
        this.name = name;
        sleepTime = generator.nextInt(3000) + 500;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            // 딱히 할게 없을 땐 빈칸으로 둬도 괜찮다.
        }
        System.out.println(name + "SCV가 미네랄을 채취했습니다.");
    }
}

public class FirstThread {
    public static void main(String[] args) {
        // "ps -alx | grep 폴더명" 으로 프로세스를 볼 수 있음
        // thread가 존재하는 것을 확인하는 용도 "ps -eLx"
        // 윈도우의 경우에는 프로세스 내부에 여러 스레드들이 존재하게됨
        // 리눅스는 스레드

        // 프로세스에 소소된 스레드가 하나 생성된다.
        // main()에 소속되고 main은 프로세스가 된다.
        Thread t1 = new Thread(new Worker("대머리독수리"));
        Thread t2 = new Thread(new Worker("이름없음"));
        Thread t3 = new Thread(new Worker("고양이"));
        // 여기에는 main까지 포함해서 총 4개의 프로세스가 있음
        // 스레드들이 돌면서 작동하는 것을 볼 수 있다.
        // 매번 결과가 다름

        // 리눅스 : 스레드는 모두 독립적인 task라고 한다.(윈도우가 아니기 때문에 구분하지 않음)

        t1.start();
        t2.start();
        t3.start();
    }
}
