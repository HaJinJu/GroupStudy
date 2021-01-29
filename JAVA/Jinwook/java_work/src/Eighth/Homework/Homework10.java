package Eighth.Homework;
//구구단을 클래스를 활용해서 프로그래밍 해보자!
class MultiTable {
    int dan;
    int[] arr;

    public MultiTable(int num) {
        dan = num;
        arr = new int[10];
        for (int i = 1; i <= 9; i++) {
            arr[i] = num * i;
            System.out.println(num + "X" + i + "=" + arr[i]);
            System.out.println("");


        }
    }

    public void allMltiTable() {
        int multiple;
        for (int time = 1; time <= 9; time++) {////변동안되는값
            for (int dan = 2; dan <= 9; dan++) {///변동되는값
                multiple = dan * time;
                System.out.print(dan + "X"+ time + "=" + multiple + "\t") ;


            }
            System.out.println();
        }


    }
}
public class Homework10 {
    public static void main(String[] args) {
        MultiTable mt = new MultiTable(2);
        mt.allMltiTable();


    }
}
