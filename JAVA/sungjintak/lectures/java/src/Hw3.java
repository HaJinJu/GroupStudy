public class Hw3 {
    public static void main(String[] args) {
        //1, 1, 3, 4, 5, 8, 12, 17, 25, . . .


        int[] arr = new int[20];

        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 2;

        for(int i=3; i < arr.length; i++){
            arr[i] =  arr[i-1] + arr[i-2];
            arr[i] =  arr[i-1] + arr[i-3];

            System.out.printf("arr[%d] = %d\n", i, arr[i]);

        }
    }
}
