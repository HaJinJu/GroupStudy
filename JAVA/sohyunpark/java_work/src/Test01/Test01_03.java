package Test01;

class RandomArr {
    private int randomNum;
    private int[] randomArray;

    public RandomArr() {
        randomNum = (int)(Math.random() * 10);
        System.out.println("임의의 난수 값 : " + randomNum);
    }

    public void randomArray() {
        randomArray = new int[randomNum];

        for(int i = 0; i < randomNum; i++) {
            randomArray[i] = (int)(Math.random() * 10);
            System.out.printf("arr[%d] = %d\n", i, randomArray[i]);
        }
    }
}

public class Test01_03 {
    public static void main(String[] args) {
        // 클래스를 사용하여 임의의 난수 배열을 생성하도록 프로그램을 작성해보자
        RandomArr ra = new RandomArr();

        System.out.println("임의의 난수 배열을 생성해보자");
        ra.randomArray();
    }
}
