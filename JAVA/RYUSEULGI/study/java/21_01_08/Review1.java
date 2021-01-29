// 3 의 배수는 더하고 5 의 배수는 뺀다.
// 덧셈만한 최종 결과값과 뺄셈만한 최종 결과를 확인해보자!
// 마지막으로 두 값의 합을 return(반환)하도록 매서드를 만들어보자!
// > 생성자로 변경해보기

class Number2{

    int a;
    int b;
    int sum;

    public Number2(int randomNum) {

        for(int i =0; i < randomNum; i++){
            if( i % 3 == 0){
                a += i;
            } else if ( i % 5 == 0){
                b -= i;
            }
        }
    }

    public void getNum() {
        System.out.println(a);
        System.out.println(b);
    }

    public int sum(){
        sum = a + b;
        return sum;
    }

}
public class Review1 {
    public static void main(String[] args) {
        Number2 number = new Number2(16);

        number.getNum();
        System.out.println(number.sum());
    }
}
