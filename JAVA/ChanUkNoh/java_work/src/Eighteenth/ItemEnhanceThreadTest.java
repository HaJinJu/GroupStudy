package Eighteenth;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class ItemEnhanceThreadTest {
    private Semaphore sem = new Semaphore(3);

    public void enter(Item item) {
        try {
            sem.acquire();
        } catch (InterruptedException e) {
            return;
        }

        try {
            item.enhance(this);
        } finally {
            sem.release();
        }
    }

    public static class Item {
        private static int cnt = 0;
        private int num = ++cnt;

        private void enhance(ItemEnhanceThreadTest iet) {
            System.out.println("강화 시작");

            Random rand = new Random();

            try {
                Thread.sleep(rand.nextInt(5000) + 5000);
            } catch (InterruptedException e) {

            }

            System.out.println(num + "번 아이템 강화 종료!");
        }
    }

    public static void main(String[] args) {
        final ItemEnhanceThreadTest iet = new ItemEnhanceThreadTest();

        for (int i = 0; i < 6; i++) {
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    Item item = new Item();
                    iet.enter(item);
                }
            });
            t.start();
        }
    }
}
