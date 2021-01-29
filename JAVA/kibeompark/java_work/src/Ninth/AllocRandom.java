package Ninth;

public class AllocRandom {
    final int RANGEARR = 6;
    final int BIASARR = 5;

    final int RANGEVALUE = 101;
    final int BIASVALUE = 10;

    int numOfRandom;
    int[] randArr;
    int[] idxArr;

    int randPick;

    // 재활용을 용이하게 만들려면
    // 딱 필요한 기능만 구현하고 빠진다.
    // 부가적으로 더 덕지덕지 붙이려고 하는 순간 오염도가 높아진다.
    // 결국 나중에 재활용을 못하게 되고
    // 재활용을 못하게 되면 유지보수가 힘들어진다.
    // 유지보수가 힘들어지면 야근을 반드시 할 수 밖에 없어진다.

    // 생성자 : 초기화
    public AllocRandom() {
        numOfRandom = (int) (Math.random() * RANGEARR) + BIASARR;

        randArr = new int[numOfRandom];
        idxArr = new int[numOfRandom];
    }

    // RandomA Number (랜덤번호) -> Array(배열) to
    public void allocRandomNumber2Arr() {
        for (int i = 0; i < randArr.length; i++) {
            randArr[i] = (int) (Math.random() * RANGEVALUE) + BIASVALUE;
            idxArr[i] = i;
        }
    }

    public void deleteRandomNumberValue() {
        randPick = (int) (Math.random() * numOfRandom);

        System.out.println("지워진 값 = " + randArr[randPick]);

        randArr[randPick] = -1;
    }

    public void printRandomArr() {
        int cnt = 1;

        for (int i = 0; i < randArr.length; i++) {
            if(randArr[i] == -1) {
                continue;
            }

            System.out.printf("%4d", randArr[i]);

            if (cnt % 5 == 0) {
                System.out.println("");
            }

            cnt++;
        }
        System.out.println("");
    }
}

/*
class BulletinBoard {
    int postsNum, deleteNum, randNum, cnt;
    int[] board;

    public void setpostsNum() {
        postsNum = (int)(Math.random() * 50) + 10;
        board = new int[postsNum];
        System.out.println("게시판 글 갯수 : " + postsNum);
    }

    public void setBoard() {
        System.out.print("게시판 글 번호 :");
        for (int i = 0; i < postsNum; i++) {
            board[i] = i + 1;
            System.out.printf("%3d", board[i]);
        }
        System.out.println();
    }

    public void deletePosts() {
        cnt = 0;
        randNum = (int)(Math.random() * (postsNum - 1)) + 1;
        System.out.println("삭제 횟수 : " + randNum);

        System.out.print("삭제 번호 :");
        for (int i = 0; i < randNum; i++) {
            deleteNum = (int)(Math.random() * postsNum) + 1;

            System.out.printf("%3d", deleteNum);

            if (board[deleteNum - 1] == deleteNum) {
                board[deleteNum - 1] = 0;
                cnt++;
            }
        }

        System.out.printf("\n중복 제외 삭제 횟수 : %d\n", cnt);

        System.out.print("삭제 결과 :");
        for (int i = 0; i < postsNum; i++) {
            System.out.printf("%3d", board[i]);
        }
        System.out.println();
    }

    public void modifiedBoard() {
        board = new int[postsNum - cnt];

        System.out.print("수정 결과 :");
        for (int i = 0; i < postsNum - cnt; i++) {
            board[i] = i + 1;
            System.out.printf("%3d", board[i]);
        }
    }
}
 */