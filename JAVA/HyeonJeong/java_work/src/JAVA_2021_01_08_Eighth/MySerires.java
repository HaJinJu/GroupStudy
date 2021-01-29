package JAVA_2021_01_08_Eighth;

public class MySerires {
    public final int AND = 1;
    public final int OR = 2;

    // 이름이 같은 매서드의 입력 인자가 달라지면
    // 매서드 오버로딩이 일어나면서 양쪽을 모두 사용할 수 있게 된다.
    // 입력 개수가 다르기 때문에 자바 컴파일러가 알아서 구별해준다.

    public void printValue(int start, int end, int orderNum) {
        int count = 1;

        for (int i = start; i <= end; i++) {
            if (i % orderNum == 0) {
                System.out.printf("%3d", i);

                if (count % 5 == 0) {
                    System.out.println("");
                }
                count++;
            }
        }
    }

    public void printValue(int start, int end) {
        int count = 1;

        for(int i = start; i <= end; i++) {
            System.out.printf("%3d", i);

            if(count % 5 == 0) {
                System.out.println("");
            }
            count++;
        }
    }

    public int valueSum(int start, int end) {
        int sum = 0;

        for(int i = start; i <= end; i++) {
            sum += i;
        }

        return sum;
    }

    public void printTwiceOrder
      (int start, int end, int orderNum1, int orderNum2, final int ORDER) {
        int count = 1;

        for(int i = start; i <= end; i++) {

            switch (ORDER) {
                case AND:
                    if(i % orderNum1 == 0 && i % orderNum2 == 0) {
                        System.out.printf("%3d", i);

                        if(count % 5 == 0) {
                            System.out.println("");
                        }
                        count++;
                    }
                    break;

                case OR:
                    if(i % orderNum1 == 0 || i % orderNum2 == 0) {
                        System.out.printf("%3d", i);

                        if(count % 5 == 0) {
                            System.out.println("");
                        }
                        count++;
                    }
                    break;

                default:
                    System.out.println("잘못된 입력입니다.");
                    break;
            }
        }
    }

    public void fibonacciSeries(int nth) {
        int first = 1;
        int second = 1;
        int result = 0;
        int count = 1;

        nth -= 2;

        System.out.printf("%4d%4d",first ,second);

        while(nth-- > 0) {
            result = first + second;
            first = second;
            second = result;
            System.out.printf("%4d", result);

            if(count % 5 == 3) {
                System.out.println("");
            }
            count++;
        }
    }
}
