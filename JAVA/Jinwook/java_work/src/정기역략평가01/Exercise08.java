package 정기역략평가01;
//어떤 임의의 공간 크기가 5만 ~ 10만이다.
//이 공간에 어떤 물품을 4096 단위로 정렬하여 배치하고자 한다. 이를 프로그래밍 해보자!

// 64의 제곱 = 4096 -> & ~연산 하기

class SpaceManager{
   private int start;
   private int range;
   private int space;
   private int base;
   private int waste;



    public SpaceManager(int base, int start, int range ){
       this.base = base;
       this.start = start;
       this.range = range;

    }
    public int processSpace(){
        space = (int)(Math.random() * range) + start;
        System.out.println("공간 크기: "+ space);

        return space & ~(base -1);
    }

    public int getBase() {
        return base;
    }

    public int orderSpace(){

        return (space & ~(base - 1)) / base;
    }
    public int wasteSpace(){
        waste = space - (space & ~(base - 1));
        return waste;
    }

}

public class Exercise08 {
    public static void main(String[] args) {
        SpaceManager sm = new SpaceManager(4096,50000,100000);
        sm.processSpace();
        System.out.println("정렬 단위: "+sm.getBase());
        System.out.println("정렬할 수 있는 갯수: " + sm.orderSpace());



    }
}
