/*
    < 연습문제 1 >
3 의 배수는 더하고 5 의 배수는 뺀다.
덧셈만한 최종 결과값과 뺄셈만한 최종 결과를 확인해보자!
마지막으로 두 값의 합을 return(반환)하도록 매서드를 만들어보자!
*/


class Calculation {
    int add, sub;
    int start, end;
    int targetAdd, targetSub;

    public void setNum(int start, int end, int targetAdd, int targetSub) {
        add = sub = 0;

        this.start = start;
        this.end = end;
        this.targetAdd = targetAdd;
        this.targetSub = targetSub;
    }

    public void numCal() {
        for(int i = start; i <= end; i++) {
            if(i % targetAdd == 0)
                add += i;
            if(i % targetSub == 0)
                sub += i;
        }
    }

    public int getSum() {
        System.out.printf("%d 의 배수의 합 = %d\n", targetAdd, add);
        System.out.printf("%d 의 배수의 합 = %d\n", targetSub, sub);

        return add - sub;
    }
}

public class EighthExercise1 {
    public static void main(String[] args) {
        Calculation cal = new Calculation();

        cal.setNum(1, 20, 3, 5);
        cal.numCal();
        System.out.printf("최종 결과 = %d", cal.getSum());
    }
}