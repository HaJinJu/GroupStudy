// 3 의 배수는 더하고 5 의 배수는 뺀다.
// 덧셈만한 최종 결과값과 뺄셈만한 최종 결과를 확인해보자!
// 마지막으로 두 값의 합을 return(반환)하도록 매서드를 만들어보자!

class CalcNumber {
    
    int result3;
    int result5;
    int sum;

    public void setNumber(int num){
        for(int i = 0; i < num; i++){
            if( i % 3 == 0){
                result3 += i;
            }
            if ( i % 5 == 0){
                result5 -= i;
            }
        }
    }

    public void getNumber(){
        System.out.println(result3);
        System.out.println(result5);
    }

    public int calc(){
        sum = 0;
        sum = result3 + result5;
        return sum;
    }
}

public class Q1 {
    public static void main(String[] args) {
        CalcNumber calcNumber = new CalcNumber();
        
        calcNumber.setNumber(20);
        calcNumber.getNumber();
        System.out.println(calcNumber.calc());
    }
}