package Homework.Seventh;

class RandomArray {
    int cnt = 0;
    int randArr = (int)(Math.random() * 100) + 1;
    int arr[] = new int[randArr];

    public void Array() {
        System.out.printf("크기가 %d인 배열\n", randArr);
        for (int i = 0; i < randArr; i++) {
            arr[i] = (int)(Math.random() * 100) + 1;
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }
    }

    public void EvenNumber() {
        for (int i = 0; i < randArr; i++) {
            if (arr[i] % 2 == 0) cnt++;
        }
        System.out.println("배열 요소 중 짝수 개수 : " + cnt);
    }
}

public class Homework10 {
    public static void main(String[] args) {
        // 10) 랜덤한 개수의 배열을 만든다. (범위는 적당히 알아서 지정하자)
        RandomArray ra = new RandomArray();

        ra.Array();
    }
}
