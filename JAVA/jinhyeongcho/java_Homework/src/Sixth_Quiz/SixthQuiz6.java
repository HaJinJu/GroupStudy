package Sixth_Quiz;

public class SixthQuiz6 {
    public static void main(String[] args) {
        //6) 1 ~ 100 까지 숫자중 3 의 배수만 출력해보자!
        int[] apple = new int[100];
        for(int i =1;i <=100;i++){
            apple[i] = i;
            if(apple[i] % 3==0){
                //int[] arr = new int[100];

                System.out.printf("apple[%d] = %d는 3의 배수다\n",i,apple[i]);
               /* for(int num= 1;num <apple.length;num++){
                    apple[num]=i;
                    System.out.printf("arr[%d] = %d\n",num,i);*/

            }
        }
    }
}
