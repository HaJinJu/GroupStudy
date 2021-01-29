//package Eleventh;

//public class QuestionNote

//    mat = new int[row][col];                                                  \met 은 [][] 대괄호가 2개인 다중배열로 [row]는 행 [col]은 열을 의미한다.
//
//    // 4 by 3      ===>     3 by 4
//    // 1 2 3 4              1 2 3
//    // 2 4 6 8              4 2 4
//    // 3 6 9 12             6 8 3
//    //                      6 9 12
//    int totalLen = row * col;                                                   \  객체 totalLen에 row * col값을 대입한다.
//    int[] tmp = new int[totalLen];                                              \ tep배열에 totalLen 즉 (row * col)을 할당한다.
//
////           System.out.println("arr.length = " + arr.length);                  \ 출력해보니 3이 나왔다 행에 해당하는 값
////           System.out.println("arr[0].length = " + arr[0].length);            \ 출력해보니 4가 나왔다.열에 해당하는 값 = 0번째줄 배열의 갯수
//            for(int i = 0; i < arr.length; i++) {
//        for(int j = 0; j < arr[0].length; j++) {                                 \  3*4 배열을 만드는 for문
//            tmp[i * arr[0].length + j] = arr[i][j];                              \
////                    System.out.printf("tmp[%d] = %d\n",                        \  출력해보니 각 배열에 들어갈 값들이 출력됐다
////                           i * arr[0].length + j,
////                            tmp[i * arr[0].length + j]);
//        }
//    }
//
//            for(int i = 0; i < row; i++) {
//        for(int j = 0; j < col; j++) {
//            mat[i][j] = tmp[i * col + j];
//
//                                                                              Q: Matrix C에 해당하는 값을 출력하는 코드인데  {1, 2, 3, 4}.  이 왜  1  2  3
//                                                                                                                         {2, 4, 6, 8 }        4  2  4
//                                                                                                                         {3, 6, 9, 12}        6  8  3
//                                                                                                                                              6  9  12 로
//                                                                                                                                              3*4에서 4*3으로 변형돼서 출력되는지
//                                                                                                                                              정확히 이해하지 못했다.

//        public Matrix(int[] arr, int row) {                               \ 단일배열 int[]arr 와 int row 를 참조하는 메소드
//            if(checkAvailable(arr, row)) {                                \  즉 Matrix Wrong에 해당하는 부분?
//                mat = new int[row][col];                                  \Q: if문으로 checkAvailable을 넣은 이유를 정확히 모르겠다.
//
//                for (int i = 0; i < row; i++) {
//                    for (int j = 0; j < col; j++) {
//                        // 0 ~ 8:
//                        // i                     = 0 ~ 2     x
//                        // j                     = 0 ~ 2     x
//                        // i + j                 = 0 ~ 4     x
//                        // (i + 1)               = 1 ~ 3     x
//                        // (i + 1) * j           = 0 ~ 6     x
//                        // (i + 1) * (j + 1)     = 1 ~ 9     x
//                        // (i + 1) * (j + 1) - 1 = 0 ~ 8     x
//                        // (i + 1) * 3 + j       = 3 ~ 9 + j x
//                        // i * 3 + j             = 0 ~ 8     o
//                        mat[i][j] = arr[i * col + j];
//public Matrix(int[] arr, int row, int col) {                              \ 단일배열 int[]arr 와 row , col 을 받는 Matrix A에 해당하는 부분
//    if(checkAvailable(arr, row, col)) {
//        System.out.println("A 처리 테스트");                                \ Matrix A의 출력값을 명확히 하고자 문자열을 가시적으로 출력헀다
//        // 실제로 이 매서드 내의 모든 코드는
//        // 단일 배열에서 넘어온 값들을 행렬로 변환한다는 취지를 가짐
//        // 그러므로 동일하게 중복되는 코드들이 발생할 것이고
//        // 별도의 매서드로 분리하여 관리할 수 있음
//        mat = new int[row][col];
//
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                mat[i][j] = arr[i * col + j];                                \ 3*3 배열을 출력하는 for문과
//                                                                              \배열 안의 값 123456789를 알맞게 출력하기 위한 수식 [i * col + j]

// private boolean checkAvailable(int[] arr, int row, int col) {
//        int len = arr.length;
//
//        boolean res = (len == row * col ? true : false);
//
//        if(res) {
//            this.row = row;
//            this.col = col;
//        }
//
//        return res;
//    }
//
//    private boolean checkAvailable(int[][] arr, int num) {
//        int row = arr.length;
//        int col = arr[0].length;
//        int len = row * col;
//        // System.out.printf("[][] row = %d, col = %d\n", row, col);
//
//        /*
//        if(len % row == 0) {
//            this.row = row;
//            this.col = len / row;
//        } else {
//            System.out.printf("행렬로 변환할 수 없습니다.\n");
//            System.out.printf("올바른 차원을 입력하세요.\n");
//            System.out.printf("혹은 적절한 숫자(행)를 입력하세요\n");
//            return false;
//        }
//         */
//
//        return DivideElement(len, num);
//    }
//
//    private boolean checkAvailable(int[] arr, int row) {
//        int len = arr.length;
//
//        /*
//        if(len % row == 0) {
//            this.row = row;
//            this.col = len / row;
//        } else {
//            System.out.printf("행렬로 변환할 수 없습니다.\n");
//            System.out.printf("올바른 차원을 입력하세요.\n");
//            System.out.printf("혹은 적절한 숫자(행)를 입력하세요\n");
//            return false;
//        }
//         */
//
//        return DivideElement(len, row);                                Q: 이 3가지 boolean이 왜 들어갔는지 모르겠다.
//                                                                         한가지 유추해볼만한 것은 첫번째 boolean은 Matrix A에 적용되고
//                                                                          두번째는 B와 C에 적용되는것 세번째는 Wrong에 적용된다는 사실까지는 이해했다.

//private boolean DivideElement(int len, int row) {
//        if(len % row == 0) {
//            this.row = row;
//            this.col = len / row;
//        } else {
//            System.out.printf("행렬로 변환할 수 없습니다.\n");
//            System.out.printf("올바른 차원을 입력하세요.\n");
//            System.out.printf("혹은 적절한 숫자(행)를 입력하세요\n");
//            return false;
//        }
//
//        return true;                                                 Q:  2, 3번째 Checkavailabe boolean의 return 값으로 출력되는 boolean인데
//                                                                         len % row ==0 을 하는 것은 n * n 배열의 행과 열이 알맞게 떨어지는지를 확인하기 위해서 ?

//public boolean checkDimension(Matrix mat) {
//        int row = mat.getRow();
//        int col = mat.getCol();
//
//        return (this.row == row) && (this.col == col);                Q: CheckDimension 전반적으로 무슨 동작을 하는 코드인지 왜 필요한지 잘 모르겠다.
//    }
//
//    public boolean checkDimension(Matrix A, Matrix B) {
//        int Arow = A.getRow();
//        int Brow = B.getRow();
//        int Acol = A.getCol();
//        int Bcol = B.getCol();
//
//        return (Arow == Brow) && (Acol == Bcol);
//