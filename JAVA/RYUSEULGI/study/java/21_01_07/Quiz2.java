//  1 ~ 10 까지의 숫자를 더한 결과

class Add {
    int sum;

    public void setSum() {
        this.sum = 0;
    }

    public void getplus(){
        for(int i = 1; i < 11; i++){
            sum +=i;
        }
        System.out.println(sum);
    }
}
public class Quiz2 {
    public static void main(String[] args) {
        
        Add add = new Add();

        add.getplus();
        
        // Loop method 사용
        Loop loop = new Loop();
        loop.valueSum(1,10);
    }
}
