package Eighth;

import java.util.Arrays;

class BulletinBoard {
//    11) 웹 페이지에서 게시판 글을 관리하는 것과 유사한 케이스의 문제다.
//    랜덤을 활용해서 n 개의 글을 작성한다고 가정한다.
//    해당 게시물에서 랜덤한 횟수로 랜덤수를 생성한다.
//            (이때 랜덤한 횟수는 n 보다 작아야 한다)
//    이때 랜덤수로 생성한 숫자의 게시물을 지우고
//    각각의 게시물 번호를 1, 2, 3, 4, 5 형태로 만들어준다.
//            (배열을 활용해서 문제를 풀어보자!)
    final int MAX = 21;
    int writesNum = (int)(Math.random() * MAX) + 20;
    int deleteNum;

    int[] bulletinBoard;

    public void createBulletinBoard() {
        bulletinBoard = new int[writesNum];

        System.out.println("게시물 목록");

        for (int i = 0; i < bulletinBoard.length; i++) {
            bulletinBoard[i] = i + 1;
        }

        System.out.println(Arrays.toString(bulletinBoard));
    }

    public void deleteBulletin() {
        deleteNum = (int)(Math.random() * (writesNum - 1)) + 1;

        System.out.println("지운 게시물 번호: " + (deleteNum + 1));

        bulletinBoard[deleteNum] = 0;

        System.out.println("게시판 목록: " + Arrays.toString(bulletinBoard));
    }

    int cnt = 1;

    public void sortBulletinBoard() {
        for (int i = deleteNum; i < bulletinBoard.length; i++) {
            if (i < bulletinBoard.length - 1) {
                bulletinBoard[i] = i + 1;
            } else {
                bulletinBoard[bulletinBoard.length - cnt] = 0;
                cnt++;
            }
        }
        System.out.println("게시판 목록: " + Arrays.toString(bulletinBoard));
    }
}

public class Homework11 {
    public static void main(String[] args) {

        BulletinBoard bb = new BulletinBoard();

        bb.createBulletinBoard();
        bb.deleteBulletin();
        bb.sortBulletinBoard();
        bb.deleteBulletin();
        bb.sortBulletinBoard();
    }
}
