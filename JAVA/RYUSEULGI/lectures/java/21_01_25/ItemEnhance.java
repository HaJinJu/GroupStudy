import java.util.Random;
import java.util.concurrent.Semaphore;

public class ItemEnhance {
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

        private void enhance(ItemEnhance ih) {
            System.out.println("가ㅇ화 시작");

            Random random = new Random();

            try {
                Thread.sleep(random.nextInt(5000) + 5000);
            } catch (Exception e) {

            }
            System.out.println(num + "번 아이템 강화종료");
        }

        // 싱크로나이즈드는 뮤텍스 개념으로 스레드 여러개 동시다발적으로 구현 불가
        // 세마포어는 뮤텍스 리스트 같은 개념으로 스레드 여러개가 동시다발적으로 구동이 가능하다.
        // 대기열이 있다 없다의 차이
        // 입출력 관련된 문제
        // 싱크로나이즈가 없을 때 왜 그렇게 나오는지?
        // Synchronized allows only one thread of execution to access the resource at
        // the same time. Semaphore allows up to n (you get to choose n) threads of
        // execution to access the resource at the same time.
        public static void main(String[] args) {
            final ItemEnhance ih = new ItemEnhance();

            for (int i = 0; i < 6; i++) {
                Thread t = new Thread(new Runnable() {

                    @Override
                    public void run() {
                        Item item = new Item();
                        ih.enter(item);
                    }
                });
                t.start();
            }
        }
    }
}
