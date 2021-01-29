package Seventeenth;

import java.util.Arrays;
import java.util.Random;

public class RandomArr {
    //Random rand = new Random();

    public void setRandNum(){
        int rN =(int)(Math.random()*5);
        int [] arr = new int[rN];
        System.out.println(rN+"개의 배열이 생성되었습니다.");
        for (int i= 0 ; i< rN;i++){
            arr[i] =(int)(Math.random()*20)+1;
            System.out.printf("[%d]번 배열 = %d\n",i,arr[i]);
        }
        if(rN == 0){
            System.out.println("배열갯수가 0개입니다 다시 생성하세요");
        }
    }
    public void randNumArr(){
        int rN =(int)(Math.random()*5);
        int [] arr = new int[rN];
        System.out.println(rN+"개의 배열이 생성되었습니다.");
        for (int i= 0 ; i< rN;i++){
            arr[i] =(int)(Math.random()*20)+1;
            System.out.printf("[%d]번 배열 = %d\n",i,arr[i]);
        }
        if(rN == 0){
            System.out.println("배열갯수가 0개입니다 다시 생성하세요");
        }
    }


    public void randNumArr2(){
        int rN =(int)(Math.random()*10)+1;
        int [] arr = new int[rN];

        System.out.println(rN+"개의 배열이 생성되었습니다.");


        for (int i= 0 ; i<rN;i++){
            arr[i] =(int)(Math.random()*50)+1;
            System.out.printf("[%d]번 배열 = %d\n",i,arr[i]);
        }
        System.out.println("오름차순 정렬");
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++)
            System.out.printf("[%d]번 배열 = %d%n", i, arr[i]);


    }

    public static void insertSort(int[] arr, int[] cn) {
        int i, j, arrkey, len = arr.length;
        int cnkey;

        for(i = 1; i < len; i++) {
            cnkey = arr[i];
            arrkey = cn[i];

            for(j = i - 1; (j != -1) && (arr[j] > cnkey); j--) {
                arr[j + 1] = arr[j];
                cn[j + 1] = cn[j];
            }

            arr[j + 1] = cnkey;
            cn[j + 1] = arrkey;
        }
    }




}
