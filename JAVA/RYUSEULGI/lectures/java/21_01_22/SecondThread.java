import java.util.Random;

public class SecondThread implements Runnable {

    private String name;

    public SecondThread(String name) {
        this.name = name;
    }

    // 스레드가 도는 건 run
    @Override
    public void run() {
        Random random = new Random();

        for (int i = 1; i < 3; i++) {
            System.out.println(name + " : " + random.nextInt(500));

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {

            }
        }
    }

    // 실행하면 메인이 프로세스가 된다.
    public static void main(String[] args) {

        // 스ㅔ드 만들 내용을 2개로 준비
        Thread t1 = new Thread(new SecondThread("t1"));
        Thread t2 = new Thread(new SecondThread("t2"));

        // 스케쥴러에 스레드 등록
        t1.start();
        t2.start();

        // t1과 t2가 2번 실행되는 이유 --> for문 실행 범위 1~2
        // t1 t2 실행 순서는 무작위 : 프로세스들과 경쟁을 하다가 채택된 것이 t1인 것일 뿐

        // 메인 프로세스는 여기까지 실행됨
        System.out.println("main()프로세스 시행중");
    }

}
