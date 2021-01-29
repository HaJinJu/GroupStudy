package jan0125;

import java.util.EmptyStackException;
                        //Runnable이라는 인터페이스를 사용(해당 클래스에는 필수적으로 run함수 필요)
class RamenCook implements Runnable{
                //라면의 수
    private int ramenCount;
                //버너의 상태 (버너 = 쓰레드)
    private String[] burners = {"_","_","_","_"};
                    //끓일 라면의 개수를 입력받는다.
    public RamenCook(int count){
        ramenCount = count;
    }
    //Thread에서 진행할 작업을 여기에 정의한다.
    @Override
    public void run(){
        //끓일 라면의 수가 0이 될때까지
        while(ramenCount > 0) {

            synchronized (this) {
                //쓰레드가 동시에 라면 두개를 가져가는 경우 카운트는 하나만 줄어들어서 이를
                //방지하기 위해 32번줄 synchronized를 만듬.(한번에 한 쓰레드만 손댈 수 있다.)
                ramenCount--;
                System.out.println(
                        Thread.currentThread().getName()
                                + ": " + ramenCount + "개 남음");

            }
                    //버너 4개중 빈 것을 찾는
                for (int i = 0; i < burners.length; i++) {
                    if (!burners[i].equals("_")) continue;
                    //라면을 두개 못가져가게 하는게 아닌
                    //한 쓰레드가 두개의 버너를 차지하지 않게 하기 위해 사용
                    synchronized (this) {
                        //if(burners[i].equals("stop"){
                        //해당 쓰레드(버너)의 이름으로 버너를 차지하고 라면을 얹음.
                        burners[i] = Thread.currentThread().getName();
                        System.out.println(
                                "            "
                                        + Thread.currentThread().getName()
                                        + ": [" + (i + 1) + "]번 버너 on");
                        //버너의 상태 출력
                        showBurners();
                        //}
                    }
                    //라면 끓는 시간을 줌 굳이 필요한건 아님 그냥 편하게 보기 위해
                    try {
                        Thread.sleep(2000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    //라면을 다 끓익고 해당 버너를 끄고 비우기 위해
                    synchronized (this) {
                        burners[i] = "_";
                        System.out.println(
                                "                               "
                                        + Thread.currentThread().getName()
                                        + ": [" + (i + 1) + "]번 버너 OFF");
                        showBurners();
                    }
                    break;
                }
                //다음라면을 끓이기까지 정지해야 하는 시간을 랜덤
                //쓰레드 정지.
                try {
                    Thread.sleep(Math.round(1000 * Math.random()));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
                //실행될때마다 버너의 상태를 알려
    private void showBurners(){
        String stringToPrint
                = "                                                 ";
        for(int i = 0; i < burners.length; i++){
            stringToPrint += ("  " + burners[i]);
        }
        System.out.println(stringToPrint);
    }
}
public class selfThreadSyncTest {
    public static void main(String[] args) {
        try {
            RamenCook ramenCook = new RamenCook(10);
            new Thread(ramenCook, "A").start();//쓰레드 A
            new Thread(ramenCook, "B").start();//쓰레드 B
            new Thread(ramenCook, "C").start();//쓰레드 C
            new Thread(ramenCook, "D").start();//쓰레드 D
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

