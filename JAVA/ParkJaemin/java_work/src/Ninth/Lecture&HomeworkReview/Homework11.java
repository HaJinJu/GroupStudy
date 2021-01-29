package Eighth.HomeworkReview;

class AllocRandom {
    final int RANGEARR = 6;
    final int BIASARR = 5;

    final int RANGEVALUE = 101;
    final int BIASVALUE = 10;

    int numOfRandom;
    int[] randArr;
    int[] idxArr;

    int randPick;

    // 재활용을 용이하게 만드려면
    // 딱 필요한 기능만 구현하고 빠진다.
    // 부가적으로 더 덕지덕지 붙일려고 하는 순간 오염도가 높아진다.
    // 결국 나중에 재활용을 못하게 되고
    // 재활용을 못하게 되면 유지보수가 힘들어진다.
    // 유지보수가 힘들어지면 야근을 반드시 할 수 밖에 없어진다.

    // 생성자: 초기화
    public AllocRandom() {
        numOfRandom = (int)(Math.random() * RANGEARR) + BIASARR;

        randArr = new int[numOfRandom];
        idxArr = new int[numOfRandom];
    }

    //  Random Number(랜덤번호) -> Array(배열) to
    public void allocRandomNumber2Arr() {
        for(int i = 0; i < randArr.length; i++) {
            randArr[i] = (int)(Math.random() * RANGEVALUE) + BIASVALUE;
            idxArr[i] = i;
        }
    }

    public void deleteRandomNumberValue() {
        randPick = (int)(Math.random() * numOfRandom);

        System.out.println("지워진 값 = " + randArr[randPick]);

        randArr[randPick] = -1;
    }

    public void printRandomArr() {
        int cnt = 1;

        for(int i = 0; i < randArr.length; i++) {
            if(randArr[i] == -1) {
                continue;
            }

            System.out.printf("%4d", randArr[i]);

            if(cnt % 5 == 0) {
                System.out.println("");
            }

            cnt++;
        }
        System.out.println("");
    }
}


public class Homework11 {
    public static void main(String[] args) {
        // 웹 페이지에서 게시판 글을 관리하는 것과 유사한 케이스의 문제다.
        // 랜덤을 활용해서 n 개의 글을 작성한다고 가정한다.
        // 해당 게시물에서 랜덤한 횟수로 랜덤수를 생성한다.
        // (이때 랜덤한 횟수는 n 보다 작아야 한다)
        // 이때 랜덤수로 생성한 숫자의 게시물을 지우고
        // 각각의 게시물 번호를 1, 2, 3, 4, 5 형태로 만들어준다.
        // (배열을 활용해서 문제를 풀어보자!)
        // 요약:
        // 1. 랜덤한 개수의 배열에 랜덤한 숫자를 배치하세요.
        // 2. 배열 내부에 들어있는 랜덤한 숫자를 랜덤하게 지운다.
        // ex)   123     64     23    345     10
        //       [1]    [2]    [3]    [4]    [5]
        //       여기서 23 을 지우면
        //       123     64    345     10: 숫자를 다 땡기던
        //                     혹은
        //       123     64           345     10
        //       [1]    [2]           [3]    [4]: 배열 번호를 관리하던
        AllocRandom ar = new AllocRandom();

        ar.allocRandomNumber2Arr();
        ar.printRandomArr();

        ar.deleteRandomNumberValue();
        ar.printRandomArr();
    }
}