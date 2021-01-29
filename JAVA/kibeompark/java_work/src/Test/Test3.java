package Test;

import java.util.ArrayList;

class RandomArr {
    private int sizeOfArr;
    private ArrayList<Integer> arr;

    public RandomArr() {
        sizeOfArr = (int) (Math.random() * 20) + 10;

        arr = new ArrayList<>();
    }

    public void setArr() {
        int random;

        for (int i = 0; ; ) {
            random = (int) (Math.random() * 100) + 1;

            if (!arr.contains(random)) {
                arr.add(random);
                i++;
            }

            if (i == sizeOfArr) break;
        }
    }

    public void printArr() {
        int cnt = 1;

        System.out.println("배열 크기 : " + sizeOfArr);
        System.out.println("배열 요소");
        for (int i = 0; i < sizeOfArr; i++) {
            System.out.printf("%3d", arr.get(i));

            if (cnt % 10 == 0) {
                System.out.println();
            }
            cnt++;
        }
    }
}

public class Test3 {
    public static void main(String[] args) {
        // 클래스를 사용하여 임의의 난수 배열을 생성하도록
        // 프로그램을 작성한다.
        RandomArr ra = new RandomArr();

        ra.setArr();
        ra.printArr();
    }
}
