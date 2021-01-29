/* 

화물을 적재하는 기준이 64개 단위다.
어떤 수량의 화물이 오던지
화물을 창고에 저장할 수 있게 프로그래밍 해보자
물류 창고로 들어오는 화물의 개수는
1000 ~ 50000 개 사이로 들어온다 가정한다.

HINT
System.out.println(63 & ~3);
System.out.println(63 & ~7);
System.out.println(63 & ~15);
앞의 수가 뒤에 수+1 배수

*/

class Box{

    int boxNum;
    int start;
    int range;
    int truck;

    public Box(int boxNum, int start, int range){
        this.boxNum = boxNum;
        this.start = start;
        this.range = range;
    }

    public int setBox(){
        
        // 박스 개수 설정
        truck = (int)(Math.random() * range) + start;
        System.out.println(truck);

        // 박스를 64로 맞출경우 몇 개 들어갈까
        return truck & ~(boxNum - 1);
    }

    public boolean isBox64(){

        if((truck & ~(boxNum - 1)) % 64 == 0){
            return true;
        }else{
            return false;
        }
    }

    public int truckCount(){
        return (truck & ~(boxNum - 1)) / boxNum;
    }


}
public class Review2 {
    public static void main(String[] args) {
        
        Box box = new Box(64, 1000, 49001);
        System.out.println(box.setBox());

        if( box.isBox64() == true ){
            System.out.println("64배수입니다");
        } else {
            System.out.println("64배수가 아닙니다.");
        }

        System.out.println( "필요한 화물 수" + box.truckCount());
    }
}
