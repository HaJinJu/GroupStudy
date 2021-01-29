package hw_2021_01_21;

public class Test_19 {
    public static void main(String[] args) {
        System.out.println(
                "임의의 난수들을 임의의 배열 크기에 저장하도록 한다.\n" +
                "그리고 이 값들을 출력해보자!\n" +
                "또한 여기서 짝수만 따로 홀수만 따로 출력할 수 있게 매서드를 작성해보도록 한다.\n");
        int randomNum = (int)(Math.random() * 10) + 10;

        AraayTest at = new AraayTest(randomNum);
        int[] test_19 = at.setArray();

        System.out.println("전체 배열을 출력하세요!");
        at.printArray(test_19);

        System.out.println("배열의 값의 홀수만 출력하세요!");
        at.printOddNum(test_19);

        System.out.println("배열의 값의 짝수만 출력하세요!");
        at.printEvenNum(test_19);
    }
}
