package Ninth;

public class HW11_0108 {
    public static void main(String[] args) {
//        웹 페이지에서 게시판 글을 관리하는 것과 유사한 케이스의 문제다.
//        랜덤을 활용해서 n 개의 글을 작성한다고 가정한다.
//        해당 게시물에서 랜덤한 횟수로 랜덤수를 생성한다.
//        (이때 랜덤한 횟수는 n 보다 작아야 한다)
//        이때 랜덤수로 생성한 숫자의 게시물을 지우고
//        각각의 게시물 번호를 1, 2, 3, 4, 5 형태로 만들어준다.
//        (배열을 활용해서 문제를 풀어보자!)
        // 요약 :
        // 1. 랜덤한 개수의 배열에 랜덤한 숫자를 배치하세요.
        // 2. 배열 내부에 들어있는 랜덤한 숫자를 랜덤하게 지운다.

        AllocRandom ar = new AllocRandom();

        ar.allocRandomNumber2Arr();
        ar.printRandomArr();
    }
}
