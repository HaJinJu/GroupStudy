package Seventh;

class Random {
    int randNum = (int)(Math.random() * 300) + 1;
    int[] arr = new int[randNum];

    public void makeRandomArr() {

        System.out.println(randNum + "개 짜리 배열을 만들었습니다.");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 300) + 1;
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }

    public void checkEvenNumber() {
        int cnt = 0;

        System.out.println(randNum + "개 짜리 배열을 만들었습니다.");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 300) + 1;
            System.out.println("arr[" + i + "] = " + arr[i]);
            if (arr[i] % 2 == 0) {
                cnt++;
            }
        }
        System.out.println(cnt + "개의 짝수가 나왔습니다.");
    }
}

public class Homework10 {
    public static void main(String[] args) {
        // 10. 랜덤한 개수의 값도 랜덤한 수를 가 배열을 만든다.

        Random rnd = new Random();

        rnd.makeRandomArr();
    }
}
