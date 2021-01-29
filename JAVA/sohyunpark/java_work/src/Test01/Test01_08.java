package Test01;

class PlaceGoods {
    private int start, end, num, goods;
    private int takeoutNum;

    public PlaceGoods(int num, int start, int end) {
        this.num = num;
        this.start = start;
        this.end = end;
    }

    public void arrayGoods() {
        goods = (int)(Math.random() * end) + start; // 총 물품 개수
        System.out.println("현재 물품 개수 : " + goods);

        // 임의의 수 & ~(2^n - 1) = 2^n의 배수
        int res = goods & ~ (num - 1);
        int quot = goods / num;
        int remain = goods - (quot * num);
        if(res == 0) {
            System.out.printf("%d 개의 물품을 %d 개씩 배치합니다.\n", goods, (res / num));
        } else {
            System.out.printf("%d 개의 물품을 %d 개씩 배치합니다.\n", goods, (res / num));
            System.out.printf("%d 의 낭비공간이 발생합니다.\n", (goods - (quot * num)));
            //System.out.printf("%d 개의 물품을 %d 개씩 배치합니다.\n", goods, (res / num));
            //System.out.printf("%d 개 x %d 단위 = 총 %d 개이고, %d 개가 남습니다.\n",
                   // quot, num, (quot * num), remain);
        }
    }

    public int getGoods() { // 최종 몇 개씩 배치
        return (goods & ~(num - 1)) / num;
    }

    public void bestGoods(int num) {
        this.takeoutNum = num; // 총 물품 중 뺄 개수
        int restGoods = goods - num; // num개를 뺀 나머지 총 물품 개수



    }

}

public class Test01_08 {
    public static void main(String[] args) {
        // 어떤 임의의 공간 크기가 5만 ~ 10만이다
        // 이 공간에 어떤 물품을 4096 단위로 정렬하여 배치하고자 한다.
        // 이를 프로그래밍해보자
        PlaceGoods pg = new PlaceGoods(4096, 50000, 50001);

        pg.arrayGoods();
    }
}
