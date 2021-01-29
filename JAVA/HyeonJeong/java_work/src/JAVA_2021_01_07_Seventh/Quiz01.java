package JAVA_2021_01_07_Seventh;

public class Quiz01 {
    public static void main(String[] args) {
        int[] workers = new int[4];


        for(int i = 0; i < workers.length; i++) {
            workers[i] = (int)(Math.random() * 1201)+ 2400;
            System.out.printf("직원[%d]의 급여는 %d이다.\n",i+1 ,workers[i]);
        }
    }
}
