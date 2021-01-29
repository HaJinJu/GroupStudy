package Thirteenth;


public class Quiz1 {
    public static void main(String[] args) {
        // Queue(ArrayList)연습문제
        // 20명이 승차할 수 있는 열차가 있다.
        // 이 열차에 50명이 예매를 하려고 한다.
        // 50명중 누가 예매에 성공했는지 출력하도록 프로그래밍 해보자
        // 랜덤을 사용해야 한다.
        // 1~20 까지 중복되지 않는 숫자가 할당된다.
        // 사용자는 0~49까지 순차적으로 예매를 하는 형식이 아니며
        // 랜덤한 숫자로 0~49까지 선별되어 예매를 할 수 있게 되어있는 시스템이다.

        int psg[] =new int[20];
        int cnt=0;

         for (int i =0; i <20;i++){
             psg[i]= 0;
         }
         for (int i =1;;){
             int randNum = (int)(Math.random()*50)+1;
             //randNum 중복검사 하는 루틴이 없음

             //1)20개의 배열 전체를 순회하면서
             // randNum 값이 있는지 검사한다.

             if(psg[i-1] !=0)
                 continue;
             cnt++;
             psg[i-1] =1;
             System.out.printf("%d번 예약자= %d\n",i++,randNum);
             if (cnt == 20) {
                 break;
             }

         }




    }
}
