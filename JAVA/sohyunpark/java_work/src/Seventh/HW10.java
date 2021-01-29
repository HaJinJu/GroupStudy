package Seventh;

class RandomArray{
    int Num = (int)(Math.random()*100);
    int arr1[] = new int[Num];

    public void setArr1(){

        for (int i = 0; i < Num; i++){
            arr1[i] = (int)(Math.random()*10)+1;
            System.out.printf("arr1[%d] = %d\n", i, arr1[i]);
        }
    }

}

public class HW10 {
    public static void main(String[] args) {
        // 랜덤한 개수의 배열을 만든다. (범위는 알아서 지정)
        RandomArray ra = new RandomArray();

        ra.setArr1();
    }
}
