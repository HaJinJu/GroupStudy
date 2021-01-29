package Seventh.Homework;
public class MySeriesClass {
    public final int AND = 1;
    public final int OR = 2;
    //이거는 가독성때문에 1,2를 지정 case 1, case 2

    // 이름이 같은 매서드의 입력 인자가 달라지면
    // 매서드 오버로딩이 일어나면서 양쪽을 모두 사용할 수 있게 된다.
    // 입력 개수가 다르기 때문에 자바 컴파일러가 알아서 구별해준다.
    public void printValue(int start, int end, int orderNum) {
        int cnt = 1;

        for(int i = start; i <= end; i++) {
            if(i % orderNum == 0) {
                System.out.printf("%3d", i);

                if(cnt % 5 == 0) {
                    System.out.println("");
                }
                cnt++;
            }
        }
    }


    public void printValue(int start, int end) {
        int cnt = 1;

        for(int i = start; i <= end; i++) {
            System.out.printf("%3d", i);

            if(cnt % 5 == 0) {
                System.out.println("");
            }
            cnt++;
        }
    }

    public void printTwiceOrder(int start, int end,
                                int orderNum1, int orderNum2,
                                final int ORDER) {
        int cnt = 1;



        for(int i = start; i <= end; i++) {
            // OR 인지 AND 인지에 따라 다른 동작을 취해야함
            switch (ORDER) {
                case AND:
                    if(i % orderNum1 == 0 && i % orderNum2 == 0) {
                        System.out.printf("%3d", i);

                        if(cnt % 5 == 0) {
                            System.out.println("");
                        }
                        cnt++;
                    }
                    break;

                case OR:
                    if(i % orderNum1 == 0 || i % orderNum2 == 0) {
                        System.out.printf("%3d", i);
                        //정수 10진수는 %d를 이용하여 표현을 합니다.
                        //근데 코드를 보면 %3d, %03d 라는 표현이 있습니다.
                        //일단 %3d부터 살펴보면..
                        //3자리의 정수형을 표현한다는 뜻으로, 앞에 빈공간 2개가 생기고 그 다음 숫자 2가 출력됩니다. 즉,   2 가 표현이 됩니다.
                        //그렇다면 %03d는 무엇일까요?
                        //%3d와는 다르게 앞의 빈공간에 0을 채워서 출력합니다. 002 처럼 말이죠


                        if(cnt % 5 == 0) {
                            System.out.println("");
                        }
                        cnt++;
                    }
                    break;

                default:
                    System.out.println("잘못된 입력입니다.");
                    break;
            }
        }
    }
    public int valueSum(int start, int end) {
        int sum = 0;

        for(int i = start; i <= end; i++) {
            sum += i;
        }

        return sum;
    }

    public void fibonacciSeries(int n) {
        int first = 1;
        int second = 1;
        int res = 0;
        int cnt = 1;

        n -= 2;

        System.out.printf("%4d%4d", first, second);

        while(n-- > 0) {
            res = first + second;
            first = second;
            second = res;
            System.out.printf("%4d", res);

            if(cnt % 5 == 3) {
                System.out.println("");
            }
            cnt++;
        }
    }
}
