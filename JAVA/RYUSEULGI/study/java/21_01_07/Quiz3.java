// 1 ~ 20 까지의 숫자중 2 의 배수를 출력하도록 매서드를 만들어보자

class Multiple {
    int [] arr;

    public void setArr(){
        arr = new int[21];
    }

    public void getArr(){

        for(int i = 1; i < arr.length; i++){
            if( i % 2 == 0 ){
                System.out.println(i);
            }
        }

    }
}

public class Quiz3 {
    public static void main(String[] args) {
        
        Multiple multiple = new Multiple();
        
        multiple.setArr();
        multiple.getArr();

        // Loop method 사용
        Loop loop = new Loop();
        loop.printValue(1, 20, 2);
    }
}