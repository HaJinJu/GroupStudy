package jan0126;
class SpeedRun implements Runnable {
    int trdNum;
    int max = 1000000;
    int sum = 0;
    long start;
    long end;
    int i;
    int iNum;

    public SpeedRun(int trdCnt) {
        trdNum = trdCnt;
    }

    String[] Trd = {"A", "B", "", "", ""};
//쓰레드 각각 같은 연산이지만 시작점이 달라
    //다른 연산을 하게 해야하는데...
    public void run() {
        iNum = 1;
        synchronized (this){
            try {
                System.out.println(Thread.currentThread().getName());
                for (i = 1; i < 100; i++) {
                    sum = i * ( 1* i);

//                    if (i == 200000) {
//                        i += 200001;
//                        System.out.println(Thread.currentThread().getName() + "번 쓰레드 2십만대 입장");
//                        break;
//                    } else if (i == 400000) {
//
//                        i += 400001;
//                        System.out.println(Thread.currentThread().getName() + "번 쓰레드 4십만대 입장");
//                        break;
//                    } else if (i == 600000) {
//
//                        i += 600001;
//                        System.out.println(Thread.currentThread().getName() + "번 쓰레드 6십만대 입장");
//                        break;
//                    } else if (i == 800000) {
//
//                        i += 800001;
//                        System.out.println(Thread.currentThread().getName() + "번 쓰레드 8십만대 입장");
//                        break;
//                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("sum = "+sum);

        }

    }




///*
//    public void run() {
//        for (int i = 1; i < max; i++) {
//            if (Trd[i].equals("")) continue;
//            System.out.println(Thread.currentThread().getName()+"번쓰레드 들어있");
//            sum += i + i;
//            synchronized (this) {
//                Trd[i] = Thread.currentThread().getName();
//                System.out.println(Thread.currentThread().getName() + "번쓰레드가 사용");
//            }
//            try{
//                Thread.sleep(2000);
//            }catch (Exception e){
//                e.printStackTrace();
//            }
//        }
//
//        System.out.println("sum = " + sum);
//
//    }

    public void SpeedCheck() {
        start = System.currentTimeMillis();
    }

    public void printSpeed() {
        System.out.println("총 걸린시간" + (System.currentTimeMillis() - start) / 1000.0 + "초");
    }

    public void Trdsplit(){
    }

}
public class Third {
    public static void main(String[] args) {
        //연산할 사람을 5명 추가로 불렀다.
        SpeedRun sr = new SpeedRun(5);
            new Thread(sr, "A").start();
            new Thread(sr, "B").start();
            new Thread(sr, "C").start();
            new Thread(sr, "D").start();
            new Thread(sr, "F").start();

        sr.run();
        sr.printSpeed();

    }
}
