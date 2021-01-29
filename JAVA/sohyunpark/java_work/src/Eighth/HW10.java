package Eighth;

class Table {
    int res = 0;
    int num = ((int)(Math.random() * 9) + 1);
    final int finalnum = 9;

    public void table (){

        System.out.printf("<%d의 구구단>\n", num);

            for(int x = 1; x <= finalnum; x++){
                res = num * x;
                System.out.printf("%d * %d = %d\n", num, x, res);
            }
        }

    }


public class HW10 {
    public static void main(String[] args) {
        // 구구단을 활용해서 프로그래밍 해보자
        Table ta = new Table();

        ta.table();
    }
}
