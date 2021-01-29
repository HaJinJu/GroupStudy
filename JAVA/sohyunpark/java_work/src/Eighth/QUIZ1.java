package Eighth;

class ThreeFive {

    public int addNumber(int num){
        int sum = 0;

        for(int i = 1; i < num; i++){
            if(i % 3 == 0){
                sum += i;
            }
        }
        return sum;
    }

    public int subNumber(int num) {
        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (i % 5 == 0) {
                sum += i;
            }
        }
        return sum;

    }}

public class QUIZ1 {
    public static void main(String[] args) {
        // 3 의 배수는 더하고 5 의 배수는 뺀다.
        // 덧셈만한 최종 결과값과 뺄셈만한 최종 결과를 확인해보자
        // 마지막으로 두 값의 합을 return(반환)하도록 메서드를 만들어보자

        ThreeFive tt = new ThreeFive();
        int res = 0;

        System.out.println("3 의 배수 합 : " + tt.addNumber(100));
        System.out.println("5 의 배수 빼기 : " + tt.subNumber(100));

        res = tt.addNumber(100) - tt.subNumber(100);

        System.out.println("최종 값 : "+ res);

    }
}

//class MyOrder{
//    int thirdSum = 0;
//    int fifthSum = 0;
//
//    int start = 0;
//    int end;
//
//    public void setRange(int start, int end){
//        this.start = start;
//        this.end = end;
//    }
//
//    public void processRange(){
//        for(int i = start; i <= end; i++){
//            if(i % 3 == 0){
//                thirdSum += i;
//            }
//
//            if(i % 5 == 0){
//                fifthSum += i;
//            }
//        }
//    }
//
//    public int getTargetValue(){
//        System.out.println("3의 배수 합 = " + thirdSum);
//        System.out.println("5의 배수 합 = " + fifthSum);
//        return thirdSum - fifthSum;
//    }
//}
//
//public class QUIZ1{
//    public static void main(String[] args) {
//        MyOrder mo = new MyOrder();
//
//        mo.setRange(1, 30);
//        mo.processRange();
//
//        System.out.println("3의 배수 합 - 5의 배수 합 = " + mo.getTargetValue());
//    }
//}
