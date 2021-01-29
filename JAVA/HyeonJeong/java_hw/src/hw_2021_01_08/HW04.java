package hw_2021_01_08;

public class HW04 {
    public static void main(String[] args) {
        // 주사위 게임을 한다.
        //   5명의 플레이어가 있다.
        //   이들은 모두 3개의 주사위를 가지고 있다.
        //   3개의 주사위를 굴려서 합산 결과가 가장 큰 사람이 이긴다.
        //   (숫자 6은 0 으로 무효화 된다)
        //   프로그램으로 이를 만들어보자!
        Dice_Games dg = new Dice_Games(
                5, 3, 6);

        dg.playGame();
        dg.print_sum_of_dice();

        System.out.printf("\n========== 정렬 후! ==========\n\n");

        dg.insert_sort();
        dg.print_sum_of_dice();
        System.out.printf("\n가장 큰 주사위의 합산 값: %d\n", dg.print_winner());
    }
}
