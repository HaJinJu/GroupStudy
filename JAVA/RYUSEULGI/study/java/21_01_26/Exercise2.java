// 랜덤한 숫자 200개 생성 범위는 20~60 숫자들이 몇개씩 중복되었는지 체크

import java.util.ArrayList;
import java.util.HashSet;

class CheckDup {

    int randomNum;
    int[] arr;
    int[] arr2;
    int num;

    public CheckDup(int start, int range, int num) {
        arr = new int[num];

        for (int i = 0; i < num; i++) {
            randomNum = (int) (Math.random() * range) + start;
            arr[i] = randomNum;
            System.out.print(arr[i] + " ");
        }
    }

    public void isDup() {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> numberArr = new HashSet<>();

        int cnt = 0;

        for (Integer numberArr : arr) {
            if (!arr.contains(arr[i])) {
                list.add(arr[i]);
                cnt++;
                // 작동안됨
            }
        }
        System.out.println("중복" + list);
    }

}

public class Exercise2 {
    public static void main(String[] args) {
        CheckDup checkDup = new CheckDup(20, 61, 50);
        checkDup.isDup();
    }
}
