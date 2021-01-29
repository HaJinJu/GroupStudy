package FirstRegularTest;
//클래스를 사용하여 임의의 난수 배열을 생성하도록 프로그램을 작성한다.,
class RandArr {
    private int randNum;
    private int [] randArr;
    public RandArr(){
        randNum = (int)(Math.random()*10);
    }
    public void randArr(){
        randArr = new int [randNum];

        for(int i = 0; i < randArr.length; i++){
            randArr[i] = (int)(Math.random()*50);
            System.out.printf("%3d",randArr[i]);
        }
    }
}
public class Third {
    public static void main(String[] args) {
        RandArr ra = new RandArr();

        ra.randArr();

    }



}