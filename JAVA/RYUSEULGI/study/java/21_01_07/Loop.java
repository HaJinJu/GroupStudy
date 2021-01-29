public class Loop {

    public void printValue(int start, int end){

        for(int i =start; i <= end; i++){
            System.out.println(i);
        }
    }

    public int valueSum( int start, int end){
        int sum = 0;
        for(int i = start; i <= end; i++){
            sum += i;
        }
        return sum;

    }

    // 인자가 달라지면 함수명이 같아도 오류 no
    public void printValue(int start, int end, int orderNum){  

        for(int i = start; i <= end; i++){
            if( i % orderNum == 0 ){
                System.out.println(i);
            }
        }
    }

    public final int AND =1;
    public final int OR = 2;
    
    public void printTwiceOrder(int start, int end,
                                int orderNum1, int orderNum2,
                                final int ORDER){
        
        for(int i = start; i <= end; i++) {

            switch (ORDER) {
                case AND:
                    if(i % orderNum1 == 0 && i % orderNum2 == 0) {
                        System.out.println(i);
                    }
                    break;

                case OR:
                    if(i % orderNum1 == 0 || i % orderNum2 == 0) {
                        System.out.println(i);
                    }
                    break;

                default:
                    System.out.println("잘못된 입력입니다.");
                    break;
            }
        }
    }

    public void Fibonacci(int n){
        int first = 1;
        int second = 1;
        int res = 0;

        n = n - 2;  

        System.out.printf("%d%d", first, second);  // 출력칸 갯수
        
        while(n-- > 0) {
            res = first + second;
            first = second;
            second = res;
            System.out.println(res);
        }
    }
}
