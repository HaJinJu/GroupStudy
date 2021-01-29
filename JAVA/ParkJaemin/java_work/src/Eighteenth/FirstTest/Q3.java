package Eighteenth.FirstTest;

public class Q3 {
    int[] arr = new int[10];
    int i;

    public void setRandom() {

          for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*10)+1;
              System.out.printf("arr[%d] = %d%n", i, arr[i]);
        }

    }
}
class Q3randomArray {
    public static void main(String[] args) {


        Q3 Random = new Q3();

        Random.setRandom();

    }
}


//