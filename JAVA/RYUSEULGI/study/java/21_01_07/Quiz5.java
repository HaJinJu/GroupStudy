// 3 ~ 33 까지의 숫자중 2 의 배수 또는 3 의 배수인 수를 출력해보자!

class Multiple3 {
    int [] arr;

    public void setArr(){
        arr = new int[34];
    }

    public void getArr(){

        for(int i = 3; i < arr.length; i++){
            if( i % 2 == 0 || i % 3 == 0){
                System.out.println(i);
            }
        }

    }
}
public class Quiz5 {
    public static void main(String[] args) {
        
        Multiple3 multiple3 = new Multiple3();
        
        multiple3.setArr();
        multiple3.getArr();

        // Loop method 사용
        Loop loop = new Loop();
        loop.printTwiceOrder(3, 33, 2, 3, loop.OR);
    }
}
