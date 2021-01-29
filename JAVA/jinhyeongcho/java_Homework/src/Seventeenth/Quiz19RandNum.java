package Seventeenth;

public class Quiz19RandNum {
    int rN;
    int[] arr;


    public void nanSu(){

        int rN =(int)(Math.random()*20);
        arr = new int[rN];
        this.rN = rN;

        System.out.println(rN+"개의 배열이 생성되었습니다.");
        if(rN == 0){
            System.out.println("배열갯수가 0개입니다 다시 생성하세요");
        }

        for (int i= 0 ; i< rN;i++) {
               int cnt = 0;
               arr[i] = (int) (Math.random() * 50) + 1;
               System.out.printf("[%d]번 배열 = %d\n",i,arr[i]);

        }

    }
    public void nanSuEven(){
        System.out.println("짝수값");
        for (int i= 0 ; i< rN;i++)
            if(arr[i] %2 ==0){
                System.out.printf("[%d]번 배열 = %d\n",i,arr[i]);
            }
    }
    public void nanSuOdd(){
        System.out.println("홀수");
        for (int i= 0 ; i< rN;i++)
            if(arr[i] %2 !=0){
                System.out.printf("[%d]번 배열 = %d\n",i,arr[i]);
            }

    }
}
