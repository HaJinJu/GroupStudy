package Test01;

class RandomNumArr {
    private int randomArrNum;
    private int[] randomArr, checkDup, odd, even;

    public RandomNumArr() {
        randomArrNum = (int) (Math.random() * 10) + 1; // 1 ~ 10
        System.out.printf("임의의 값 : %d\n", randomArrNum);
        randomArr = new int[randomArrNum]; // 임의의 난수값으로 배열 크기 할당
        checkDup = new int[randomArrNum];
    }

    public void setArr() {
        int cnt = 1;
        for (int i = 1; ; ) {
            int randomNum = (int) (Math.random() * randomArrNum) + 1;

            if (checkDup[randomNum - 1] != 0) {
                continue;
            }

            randomArr[cnt - 1] = randomNum;

            checkDup[randomNum - 1] = 1;
            //System.out.printf("arr[%d] = %d\n", i++, randomNum);
            System.out.printf("arr[%d] = %d\n", i++, randomArr[cnt - 1]);

            if (cnt == randomArrNum) {
                break;
            }
            cnt++;
        }


    }

    public void oddArr() {
        System.out.println("홀수");
        for(int i = 0; i < randomArrNum; i++) {
            if(randomArr[i] % 2 != 0) {
                System.out.printf("%3d", randomArr[i]);
            }
        }
    }

    public void evenArr() {
        System.out.println("\n짝수");
        for(int i = 0; i < randomArrNum; i++) {
            if(randomArr[i] % 2 == 0) {
                System.out.printf("%3d", randomArr[i]);
            }
        }
    }

    public void printArr() {
        for (int i = 0; i < randomArrNum; i++) {
            System.out.println(randomArr[i]);
        }
    }
}

public class Test01_19 {
    public static void main(String[] args) {
        // 임의의 난수들을 임의의 배열 크기에 저장하도록 한다.
        // 그리고 이 값들을 출력해보자
        // 또한 여기서 짝수만 따로 홀수만 따로 출력할 수 있게 메서드를 작성해보자
        RandomNumArr rn = new RandomNumArr();

        rn.setArr();
        //rn.printArr();
        rn.oddArr();
        rn.evenArr();
    }
}
