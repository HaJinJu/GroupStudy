package Eighteenth;

import java.util.Random;

public class ThirdThreadTest implements Runnable {
    private String name;

    public ThirdThreadTest(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            System.out.println(name + " : " + random.nextInt(100));
            try {
                Thread.sleep(100); // t1 만 적용, 0.1. 초
            } catch (InterruptedException e) {
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new ThirdThreadTest("t1"));
        Thread t2 = new Thread(new ThirdThreadTest("t2"));

        // 데몬 프로세스 : init(1) 프로세스가 직접 개입하여
        //              심판을 내리기 전까지는 죽지 않는 불멸의 프로세스
        //              (서비스 운영에서 밥먹듯이 사용됨)
        t2.setDaemon(true); // (t2.start() - 주 스레드) 전에 반드시 호출

        t1.start(); // 0.1 초 쉬면서 돌고 있음


        try {
            Thread.sleep(800); //0.8초
            // 대장 프로세스의 슬립이므로 대장 시간에 맞춰 t1은 8번 까지 출력되고, t1과 t2가 번갈아 가면서 출력된다.
        } catch (InterruptedException e) {
            // sleep을 중간에 두면 안된다 ㅡ> 데이터가 날아 간다.
            // main() sleep() 하고자 한다면
            // 반드시 Thread의 동작을 모두 완료한 이후에 sleep() 시키도록 한다.
            // 현재 메서드에서 작성된 코드는 잘못 된 것을 보여주기 위해 작성된 코드임.
        }
        t2.start();
        System.out.println("main()실행중");
    }
}
