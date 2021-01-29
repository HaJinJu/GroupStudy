/*
    < 문제 6 >

5번 문제에서 출력한 값들을 출력하지 않고
배열에 저장하고 출력하도록 한다.

 */


public class SixthTask6 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int[] printArr = new int[100/3];
        int j = 0;

        for(int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;

            if(arr[i] % 3 == 0) {
                printArr[j] = arr[i];
                System.out.printf("printArr[%d] = %d\n", j, printArr[j]);
                j++;
            }
        }
    }
}
