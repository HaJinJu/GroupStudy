package SeventhHomeWork;

public class Homework8 {
    public static void main(String[] args) {
        System.out.printf("직원 20명이 1~20의 숫자를 랜덤으로 받자! 중복은 없다!\n");
        Lotto lotto = new Lotto();
        lotto.setNoduplicate(20);
    }
}
