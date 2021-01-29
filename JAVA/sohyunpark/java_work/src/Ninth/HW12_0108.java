package Ninth;

class WorkRate {
    final int DAYHOUR = 24;

    float rate;
    float rateA;
    float rateB;
    float completeHour;
    float amountOfWork;

    float totalHour;

    int requiredDay;
    int requiredHour;
    int requiredMinute;

    public WorkRate(float hourA, float productionA,
                    float hourB, float productionB, int day){
        rateA = productionA / hourA; // 1시간에 10개
        rateB = productionB / hourB; // 1시간에 2.5
        rate = rateA + rateB;
        completeHour = day * DAYHOUR; // 10일 * 24시간
        amountOfWork = rate * completeHour; // 원래 총 생산량
    }

    public void calcRemainHour(int accidentDay) {
        // A 공장이 가동을 몇 일 정지했는가에 따라
        // 채워야 하는 작업을 채우지 못하게 되니
        fireStop(rateA, accidentDay);

        totalHour = (amountOfWork / this.rate) +
                accidentDay * DAYHOUR;
    }

    // amountOfwork : 필요한 전체 작업량
    // A가 멈추면서 B가 3일동안 혼자 돌아야하므로
    // fireStop에서는 놀지 않는 녀석의 작업량을 차감시킴
    public void fireStop(float rate, int day) {
        // 계산이 완료되면 B가 혼자 3일 까고 남은 수치가 amountOfWork에 배치됨
        amountOfWork -= (this.rate - rate) * day * DAYHOUR;
    }

    public void printInfo() {
        System.out.println("A의 작업률 = " + rateA);
        System.out.println("B의 작업률 = " + rateB);
        System.out.println("총 작업량 = " + amountOfWork);
    }
}

public class HW12_0108 {
    public static void main(String[] args) {
        // 12) A 공장의 생산량은 10 시간에 100개
        //     B 공장의 생산량은 20 시간에 50개다.
        //     10일간 A 공장과 B 공장이 풀 가동해야 완성되는 수량이 있다 가정한다.
        //     어느날 A 공장에 불이 나서 3일간 공장이 가동 정지를 했다.
        //     그렇다면 이들은 몇 일 후에 제품을 납품할 수 있을까?
        WorkRate wr = new WorkRate(
                10, 100, 20, 50, 10);

        wr.printInfo();

        wr.calcRemainHour(3);
        wr.printInfo();
    }
}