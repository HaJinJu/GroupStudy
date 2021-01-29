package 정기역략평가01;

public class Exercise09 {
    public static void main(String[] args) {
        SpaceManager sm = new SpaceManager(4096,50000,100000);
        sm.processSpace();
        System.out.println("정렬 단위: "+sm.getBase());
        System.out.println("정렬할 수 있는 갯수: " + sm.orderSpace());
        System.out.println("낭비되는 공간: " + sm.wasteSpace());
        System.out.println("검산:" + sm.orderSpace() * sm.getBase());

    }
}
