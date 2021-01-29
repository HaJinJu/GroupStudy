package 정기역략평가01;

class RandomArrNUM{
    private int ran;
    private int [] arr;


    public void randomArr(){
        ran = (int)(Math.random()*10)+1;
        arr = new int[ran];
        for(int i = 0; i < ran; i++){
            arr[i] = i;
            System.out.printf("arr[%d]\n",arr[i]);
        }



    }


}
public class Exercise03 {
    public static void main(String[] args) {
        RandomArrNUM ran = new RandomArrNUM();
        ran.randomArr();
    }
}
