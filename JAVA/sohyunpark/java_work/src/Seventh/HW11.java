package Seventh;

class RandomArray2{
    int Num = (int)(Math.random()*100);
    int arr1[] = new int[Num];
    int i = 0, cnt = 0;

    public void setArr2(){

        for (i = 0; i < Num; i++){
            arr1[i] = (int)(Math.random()*10)+1;
            System.out.printf("arr1[%d] = %d\n", i, arr1[i]);

            if (arr1[i] % 2 == 0){
                cnt ++;
            }
        }
        System.out.println("짝수의 개수 : " + cnt);

    }

    }

public class HW11 {
    public static void main(String[] args) {
        // 10번 문제 배열에서 짝수가 몇 개 나왔는지 체크하는 메서드를 만들어보자

        RandomArray2 ra2 = new RandomArray2();
        ra2.setArr2();
    }
}
