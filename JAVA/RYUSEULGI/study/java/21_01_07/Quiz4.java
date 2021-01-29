// 1 ~ 20 까지의 숫자중 2 의 배수이고 3 의 배수인 수를 출력해보자!

class Multiple2 {
    int [] arr;

    public void setArr(){
        arr = new int[21];
    }

    public void getArr(){

        for(int i = 1; i < arr.length; i++){
            if( i % 2 == 0 && i % 3 == 0){
                System.out.println(i);
            }
        }

    }
}

public class Quiz4 {
    public static void main(String[] args) {
        
        Multiple2 multiple2 = new Multiple2();
        
        multiple2.setArr();
        multiple2.getArr();

        // // Loop method 사용
        // Loop loop = new Loop();
        // loop.printTwiceOrder(1, 20, 2, 3, loop.AND);
    }
}
