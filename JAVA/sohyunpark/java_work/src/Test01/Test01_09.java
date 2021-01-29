package Test01;

public class Test01_09 {
    public static void main(String[] args) {
        // 8번 문제에서 낭비되는 공간은 얼마인지 파악해보자
        // 또한 배치된 물품에서 물건을 꺼낼 경우 어떤 식으로 공간을 관리할지
        // 전략을 구성하여 해당 전략에 대해 프로그래밍해보도록 한다.
        PlaceGoods pg = new PlaceGoods(4096, 50000, 50001);

        pg.arrayGoods();
        pg.bestGoods(100);
    }
}
