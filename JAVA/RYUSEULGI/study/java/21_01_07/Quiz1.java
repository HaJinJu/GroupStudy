// 1 ~ 10 까지 출력

class Loop2 {

    public void count(){
        for(int i = 1; i < 11; i++){
            System.out.println(i);
        }
    }
    
}

public class Quiz1 {
    public static void main(String[] args) {
    
        Loop2 loop2 = new Loop2();

        loop2.count();

        // Loop method 사용
        Loop loop = new Loop();
        loop.printValue(1, 10);

    }
}


