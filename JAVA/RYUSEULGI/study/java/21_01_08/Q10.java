// 구구단을 클래스를 활용해서 프로그래밍 해보자!

class Test{
    
    int number;

    public Test(int number){
        this.number = number;
    } 

    public void printGoogoo(){
        for (int i = 1; i <= 9; i++){
            System.out.println(number + "x" + i + "=" + (number * i));
        }
    }

    public void printGoogoo2(){
        for(int i = 2; i <= 9; i++){
            for(int j = 1; j <= 9; j++){
                System.out.printf("%d x %d = %3d\n", i, j, i * j);
            }
        }
    }
}

public class Q10 {
    public static void main(String[] args) {
        Test test = new Test(4);
        test.printGoogoo();
        test.printGoogoo2();
    }
}
