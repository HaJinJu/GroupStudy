package Eighth;

class MyOrder {
    int thirdSum = 0;
    int fifthSum = 0;

    int start = 0;
    int end;

    public void setRange(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void processRange() {
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0) {
                thirdSum += i;
            }

            if (i % 5 == 0) {
                fifthSum += i;
            }
        }
    }

    public int getTargetVaule() {
        System.out.println("3의 배수 합 = " + thirdSum);
        System.out.println("5의 배수 합 = " + fifthSum);

        return thirdSum - fifthSum;
    }
}

public class Exercise1 {
    public static void main(String[] args) {
        // 1) 3의 배수는 더하고 5의 배수는 뺀다.
        //    덧셈만 한 최종 결과값과 뺄셈만 한 최종 결과를 확인해 보자.
        //    마지막으로 두 값의 합을 return(반환)하도록 메서드를 만들어 보자 !
        MyOrder mo = new MyOrder();

        mo.setRange(1, 30);
        mo.processRange();

        System.out.println("3의 배수 합 - 5의 배수 합 = " + mo.getTargetVaule());
    }
}

/*
package Eighth;

class PlusMinos {
    int sum = 0
    int sub = 0;

    public void valueSum(int start, int end, int orderNum1, int orderNum2) {
        for (int i = start; i <= end; i++) {
            if (i % orderNum1 == 0) {
                sum += i;

            if (i % orderNum2 == 0) {
                sub += i;
            }
        }
    }

    public int printValue(int start, int end) {
        System.out.println("덧셈만 한 결과 : " + sum);
        System.out.println("뺄셈만 한 결과 : " + sub);

        return sum - sub;
    }
}

public class Quiz1 {
    public static void main(String[] args) {
        // 1) 3의 배수는 더하고 5의 배수는 뺀다.
        //    덧셈만 한 최종 결과값과 뺄셈만 한 최종 결과를 확인해 보자.
        //    마지막으로 두 값의 합을 return(반환)하도록 메서드를 만들어 보자 !
        PlusMinos pm = new PlusMinos();

        pm.valueSum(1, 10, 3, 5);
        System.out.println("두 값의 합 = " + pm.printValue(1, 15));
    }
}
 */