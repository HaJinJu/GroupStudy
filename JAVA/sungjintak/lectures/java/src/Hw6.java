public class Hw6 {
    public static void main(String[] args) {
        //5번 문제에서 출력한 값들을 출력하지 않고 배열에 저장하고 출력하도록 한다.

        int[] arr = new int[100];

        for(int i = 1; i <= 100; i++){

            if(i % 3 == 0){
               arr[i] = i;



            }
            System.out.printf(("arr[%d] = %d\n"),i,+arr[i]);

        }
    }
}
