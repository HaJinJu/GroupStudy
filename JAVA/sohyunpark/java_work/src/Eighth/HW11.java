package Eighth;

class PostMessage {
    int postnum, cnt = 0, count = 0, rand = 0;
    int[] randnum;
    int [] checkDup;
    int [] board;

    public void setPost() { // 랜덤 활용해 n개의 글 작성
        postnum = (int) (Math.random() * 10) + 1;
        System.out.println("웹페이지 작성 글 : " + postnum);
        board = new int[postnum];

        for (int i = 0; i < postnum; i++) {
            board[i] = i + 1;
            System.out.printf("%3d", board[i]);
        }
        System.out.println();
    }

    public void setCount() { // 랜덤한 횟수로 랜덤수 생성
        for (int i = 0; i < postnum; i++) {
            cnt = (int) (Math.random() * (postnum - 1)) + 1;
        }
        System.out.printf("삭제 횟수 : " + cnt);
    }

//    public void countNum() {
//        System.out.printf("\n삭제 번호 :");
//        for (int i = 0; i < cnt ; i++) {
//            rand = (int) (Math.random() * postnum) + 1;
//
//            System.out.printf("%2d", rand);
//
//            if (board[rand - 1] == rand){
//                board[rand - 1] = 0;
//            }
//
//        }
//    }

    public void resPost(){
        System.out.println("\n삭제 결과 :");
        board = new int[postnum - cnt];

        for(int i = 0; i < postnum - cnt; i++){
            board[i] = i + 1;
            System.out.printf("%3d", board[i]);
        }
    }
}

public class HW11 {
    public static void main(String[] args) {
        // 웹페이지에 n개의 글을 작성한다고 가정.(해당 게시물에서 랜덤한 횟수로 랜덤수 생성)
        // 랜덤한 횟수는 n보다 작아야 한다.
        // 이때 랜덤수로 생성한 숫자의 게시물을 지우고 각각의 게시물 번호를 1, 2, 3, 4, 5 형태로 만든다.
        // (배열 활용)
        PostMessage pm = new PostMessage();

        pm.setPost();
        pm.setCount();
//        pm.countNum();
        pm.resPost();
    }
}
