package Eighteenth;

import Thirteenth.RandomPick;

import java.util.Random;

public class SecondThreadTest implements Runnable {
    private String name;

    public SecondThreadTest(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        Random random = new Random();

        for (int i = 1;i < 3; i++) {
            System.out.println(name + ": " + random.nextInt(100));

            try {
                Thread.sleep(500);

            } catch (InterruptedException e) {

            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new SecondThreadTest("t1"));
        Thread t2 = new Thread(new SecondThreadTest("t2"));


        t2.start();
        t1.start();

        System.out.println("메인 실행중");
    }
}
