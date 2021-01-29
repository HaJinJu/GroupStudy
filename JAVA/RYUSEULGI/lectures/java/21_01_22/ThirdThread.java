import java.util.Random;

public class ThirdThread implements Runnable {

    private String name;

    public ThirdThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        Random rand = new Random();

        for (int i = 0; i < 15; i++) {
            System.out.println(name + ": " + rand.nextInt(100));

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new ThirdThread("t1"));
        Thread t2 = new Thread(new ThirdThread("t2"));

        // 데몬 프로세스 자식이 부모를 죽이는 것
        // 데몬 프로세스는 init이 와서 죽이지 않는 이상 살아있는 프로세스
        // 주로 서비스 운영체제에서 사용됨
        t2.setDaemon(true);

        t1.start();

        // 스레드 동작을 완료한 이후에 sleep 시키도록 함
        // 그렇지 않으면 결과가ㅄ이 증발할 수 있음
        // 이 케이스의 경우 메인 실행 이후에 넣어야 함
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {

        }

        t2.start();
        System.out.println("메인 실행");
    }
}