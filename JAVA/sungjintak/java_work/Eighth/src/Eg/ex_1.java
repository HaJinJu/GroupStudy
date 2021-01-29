package Eg;

class Tool{
    int A=0;
    int B=0;
    public int Pl(int num){

        for(int i = 1; i <=num; i++){

            if(i % 3 ==0){
                A+=i;

            }if(i % 5==0){
                B-=i;
            }

        }
        System.out.println("3의 배수를 더한 값 = "+A);
        System.out.println("5의 배수를 뺀 값 = "+B);
        return A+B;
    }

}

public class ex_1 {
    public static void main(String[] args) {
        //1) 3 의 배수는 더하고 5 의 배수는 뺀다.
        //   덧셈만한 최종 결과값과 뺄셈만한 최종 결과를 확인해보자!
        //   마지막으로 두 값의 합을 return(반환)하도록 매서드를 만들어보자!
        Tool to = new Tool();
        System.out.println("3의배수값 + 5의배수값 = "+to.Pl(30));

    }
}
