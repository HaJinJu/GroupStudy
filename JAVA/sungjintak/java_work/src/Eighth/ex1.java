package Eighth;

class San{
    public void Pl(){
        int A =0;
        for(int i = 0; i < 10; i ++){
            if(i %3 ==0){
                A+=i;
                System.out.println("dd " + A);
            }
        }
    }


}

public class ex1 {
    public static void main(String[] args) {
        //1) 3의 배수는 더하고 5의 배수는 뺀다.
        //   덧샘만한 최종 결과 값과 뺼셈만한 최종 결과를 확인해보자
        //   마지막으로 두 값의 합을 return(반환) 하도록 매서드를 만들어보자
            San sa = new San();
            sa.Pl();

    }
}
