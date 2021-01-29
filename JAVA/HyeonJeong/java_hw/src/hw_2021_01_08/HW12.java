package hw_2021_01_08;

class WorkRate {
    final int DAY_HOUR = 24;

    float production_rateA;
    float production_rateB;
    float production_rate;
    float complete_hour;
    float amount_of_work;
    float total_hour;

    int required_day;
    int required_hour;
    int required_minute;

    public WorkRate(float hourA, float productionA,
                    float hourB, float productionB, int day) {

        production_rateA = productionA / hourA;
        production_rateB = productionB / hourB;
        production_rate = production_rateA + production_rateB;
        complete_hour = day * DAY_HOUR;
        amount_of_work = production_rate * complete_hour;
    }

    public void calculate_remain_hour(int accident_day) {
        fire_stop(production_rateA, accident_day);

        total_hour = (amount_of_work / this.production_rate) +
                accident_day * DAY_HOUR;
    }

    public void fire_stop(float rate, int day) {
        // A 공장이 가동을 몇일 정지했는가에 따라
        // 채워야 하는 작업량을 채우지 못하게 되니
        amount_of_work -= (this.production_rate - rate) * day * DAY_HOUR;
    }


    public void print_conversion_hour_to_comfort_format() {
        System.out.printf("전체 걸리는 시간 = %.2f\n", total_hour);

        required_day = (int) total_hour / 24;
        required_hour = (int) total_hour % 24;
        required_minute = ((int)(total_hour * 10) % 10) * 6;
        // 60 * 0.6 = 60 * 6 / 10

        System.out.printf("완성일은 앞으로 %d일 %d시간 %d분이 " +
                        "더 필요할 것으로 추정되고 있습니다.\n",
                required_day, required_hour, required_minute);
    }

    public void print_info() {
        //System.out.println("A의 작업률 = " + rateA);
        //System.out.println("B의 작업률 = " + rateB);
        System.out.printf("총 작업량 = %.0f\n", amount_of_work);
    }
}

public class HW12 {
    public static void main(String[] args) {
        WorkRate wr = new WorkRate(
                10, 100,
                20, 50, 10);

        wr.print_info();

        wr.calculate_remain_hour(3);
        wr.print_info();

        wr.print_conversion_hour_to_comfort_format();
    }
}
