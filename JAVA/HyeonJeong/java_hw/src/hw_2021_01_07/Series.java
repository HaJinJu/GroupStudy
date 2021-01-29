package hw_2021_01_07;

public class Series {
    public final int AND = 1;
    public final int OR = 2;

    public void insertNewline(int index, int mod, int res) {
        if(index % mod == res) {
            System.out.println("");
        }
    }

    public void printValue(int start, int end) {

        for(int i = start; i <= end; i++) {
            System.out.printf("%3d",i);
            insertNewline(i, 5, 0);
        }
    }

    public void printValue(int start, int end, int mod) {

        for(int i = start; i <= end; i++) {
            if(i % mod == 0) {
                System.out.printf("%3d", i);
                insertNewline(i, 5, 0);
            }
        }
    }

    public int sumValue(int start, int end) {
        int sum = 0;

        for(int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }

    public void printValue
            (int start, int end, int order1, int order2, final int ORDER) {

        int count = 1;

        for(int i = start; i < end; i++) {
            switch (ORDER) {
                case AND :
                    if(i % order1 == 0 && i % order2 == 0) {

                        System.out.printf("%3d", i);
                        insertNewline(i, 5, 0);
                    }
                    break;

                case OR :
                    if(i % order1 == 0 || i % order2 == 0) {

                        System.out.printf("%3d", i);
                        insertNewline(count, 10, 0);
                        count++;
                    }
                    break;

                default :
                    System.out.println("잘못된 입력입니다.");
                    break;
            }
        }
    }

    public void fibonacci(int Nth) {

        int count = 1;
        int first = 1;
        int second = 1;
        int result = 0;

        Nth -= 2;

        System.out.printf("%4d%4d", first, second);

        while(Nth-- > 0) {
            result = first + second;
            first = second;
            second = result;
            System.out.printf("%4d", result);

            insertNewline(count,5, 3);
            count++;
        }
    }
}
