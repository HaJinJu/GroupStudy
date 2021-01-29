package FirstRegularTest;

class FifthRandom {
    int[][] arr;

    public void randomArr() {
        arr = new int[2][2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 50) + 1;
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.println("");
        }
    }
    public void printArr(){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i == 0){
                    System.out.printf("arr[0][" + j + "] : %3d\n", arr[0][j]);
                }else if(i == 1){
                    System.out.printf("arr[1][" + j + "] : %3d\n", arr[1][j]);
                }
            }
        }
    }
}
public class Thirteenth {
    //1 ~ 50 까지의 숫자를 임의로 배열에 할당하고 출력해보자!
    //13. 위의 문제에서 할당한 배열을 다시 정렬하여 출력해보도록 한다.
    public static void main(String[] args) {


        FifthRandom ft = new FifthRandom();

        ft.randomArr();
        ft.printArr();
    }
}
/*
//최대값 최소값을 구할 int배열
int array[] = {4,3,2,1,10,8,7,6,9,5};
int max = array[0]; //최대값
int min = array[0]; //최소값

Arrays.sort(array); // 배열 정렬

// 최소값(Min) 출력
 System.out.println("최소값은 : "+array[0]);

// 최대값(Max) 출력
System.out.println("최대값은 : " +array[array.length - 1]);
 */