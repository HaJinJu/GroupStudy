/* 

★★★★★★★★★★★★이해 잘 안됨★★★★★★★★★★★★

여기는 A 사의 B-23 물류창고다.
이 물류 창고에는 많은 수의 화물이 적재되는데
화물을 적재하는 기준이 64개 단위다.
어떤 수량의 화물이 오던지
화물을 창고에 저장할 수 있게 프로그래밍 해보자
(화물의 크기는 균일하다고 가정한다)
물류 창고로 들어오는 화물의 개수는
1000 ~ 50000 개 사이로 들어온다 가정한다.

HINT
System.out.println(63 & ~3);
System.out.println(63 & ~7);
System.out.println(63 & ~15);
앞의 수가 뒤에 수+1 배수

*/

class Garage {

    int box;
    int start;
    int range;
    int container;

    public void setBox(int box, int start, int range){
        this.box = box;
        this.start = start;
        this.range = range;
    }

    public int process(){
        container = (int)(Math.random() * range ) + start;
        System.out.println(container);
        // 화물차에 꽉차게 담기 위함
        return container & ~(box - 1);
    }

    public int getBox(){
        return box;
    }

    public int getContainerCount(){
        return (container & ~(box - 1)) / box;
    }

}
public class Q2 {
    public static void main(String[] args) {
        Garage garage = new Garage();

        garage.setBox(64, 1000, 49001);
        System.out.println(garage.process());
        garage.getBox();
        System.out.println("최종 개수는" + garage.getContainerCount());
    }
}