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
            System.out.println(name + ": " + random.nextInt(100));

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {

            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new ThirdThreadTest("t1"));
        Thread t2 = new Thread(new ThirdThreadTest("t2"));

        // 데몬 프로세스:
        t2.setDaemon(true);

        t1.start();

        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {

        }

        t2.start();
        System.out.println("Main 실행");
    }
}