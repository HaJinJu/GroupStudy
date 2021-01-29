package Eleventh;

public class Matrix {
    // 공용으로 사용될 변수 row, col 과 이중 배열 mat 를 선언한다.
    // Matrix 클래스 내부에서 범용적으로 사용하기 때문에 전역 변수로
    // 선언하고 객체화 시에 셋팅하여 불필요한 할당을 방지한다.
    // 이 변수는 외부에서의 접근이 불필요하기 때문에 접근제한자 private 을
    // 사용한다.
    // 정말 필요하다면 getter를 사용한다.
    private int row, col;
    private int[][] mat;

    // row 행 col 열 행렬을 만드는 생성자
    public Matrix (int row, int col) {
        this.row = row;
        this.col = col;

        mat = new int[row][col];
    }

    // 입력받은 행렬 arr 을 row 행으로 만드는 생성자
    // 4 by 3      ===>     3 by 4
    // 1 2 3 4              1 2 3
    // 2 4 6 8              4 2 4
    // 3 6 9 12             6 8 3
    //                      6 9 12
    public Matrix (int[][] arr, int row) { // 인자가 하나인 이유: 행을 정하면 열은 자동으로 정해지기 때문

        // 바꾸는 것이 가능한지 boolean 값을 반환하는 메서드 checkAvailable 을 만들어 확인한다.
        // 가능하다면 true 를 불가능하다면 false 를 반환해 조건문을 수행할지 말지 판정한다.
        // (I) 예외 처리는 객체화 시에 해주는 것이 좋다.
        //     예외 케이스가 발생할 경우 불필요하게 값을 할당하지 않아도 되기 때문!
        if (checkAvailable(arr, row)) {
            // Boolean 값이 들어가야 할 조건부에 메서드를 호출하는 경우
            // 그 메서드의 리턴 값은 Boolean 이다.
            // 무언가 판정하는 알고리즘을 짜고 판정 기준에 따라 true 와 false 를 사용함.

            // row 와 col 의 색이 다른 이유: 출처가 다르기 때문
            // row 행으로 만들 수 있다는 조건이기 때문에 인자로 받은 row 를 사용해도 되고
            // checkDivideElement() 에서 값을 할당했기 때문에 this.row 를 사용해도 된다.
            // col 은 인자로 받고 있지 않아 checkDivideElement()에서 값을 구해 할당한다.
            mat = new int[row][col];

            // 행렬의 형태를 바꾸는 알고리즘:
            // 행렬을 배열로 분해한 후 다시 행렬의 구조를 짠다.

            // 배열의 길이 == 행렬의 크기 == 행렬 요소의 합
            int totalLen = row * col;
            // 분해한 행렬을 담을 배열
            int[] tmp = new int[totalLen];

            int arrRow = arr.length;    // 행
            int arrCol = arr[0].length; // 열

            // 행렬을 분해하는 반복문
            // * 2중 반복문에서 (0 ~ 배열의 길이) 만큼을 표현하는 방법: i * arrCol + j
            for (int i = 0; i < arrRow; i++) {
                for (int j = 0; j < arrCol; j++) {
                    tmp[i * arrCol + j] = arr[i][j];
                    // 범위 판단하는 법: "무엇"을 반복하는 지 생각해본다.
                    // 입력받은 행렬을 반복해 분해하기 때문에 입력 받은 arr 을 기준으로 범위를 찾고,
                    // 행렬에서는 행이 이중 배열의 큰 범위를 차지하기 때문에 외부 반복문에 행을
                    // 내부 반복문에 열을 범위로 선정한다.
                }
            }

            // 분해된 배열을 행렬로 만드는 반복문
            // "배열"을 반복해 새로 행렬의 구조를 만들기 때문에 범위는 입력받은 row,와 col
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    mat[i][j] = tmp[i * col + j];
                }
            }
        }
    }

    // 배열을 row 행 행렬로 만드는 생성자
    public Matrix(int[] arr, int row) {
        // 행렬이 아닌 배열을 입력받기 때문에 새로운 checkAvailable 을 만들어야한다.
        if (checkAvailable(arr, row)) {

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    mat[i][j] = arr[i * col + j];
                }
            }
        }
    }

    // 배열을 row 행 col 열로 만드는 생성자
    public Matrix(int[] arr, int row, int col) {
        if(checkAvailable(arr, row, col)) {
            // 실제로 이 생성자 내의 모든 코드는
            // 단일 배열에서 넘어온 값들을 행렬로 변환한다는 취지를 가짐
            // 그러므로 동일하게 중복되는 코드들이 발생할 것이고
            // 별도의 메서드로 분리하여 관리할 수 있음
            mat = new int[row][col];

            for(int i = 0; i < row; i++) {
                for(int j = 0; j < col; j++) {
                    mat[i][j] = arr[i * col + j];
                }
            }
        }
    }

    // 이 메서드는 외부에서의 접근이 불필요하기 때문에 접근제한자 private 을 사용한다.
    private boolean checkDivideElement(int len, int row) {

        // 행렬의 크기는 행 X 열 이다.
        // 배열을 행렬로 바꾸는 경우:
        // 배열의 길이와 행렬의 크기가 같아야한다.
        // 배열의 요소들이 빠짐없이 행렬의 요소로 들어가야 하기 때문...
        // 그렇기 때문에 배열의 길이를 행 혹은 열로 나누었을 때
        // 나누어 떨어져야만 행렬로 변환이 가능하다.

        // 행렬을 다른 차원의 행렬로 바꾸는 경우:
        // 위와 마찬가지로
        // 행렬의 크기를 행 혹은 열로 나누었을 때
        // 나누어 떨어져야만 행렬로 변환이 가능하다.
        if (len % row == 0) {
            this.row = row;
            this.col = len / row;
        } else {
            System.out.printf("행렬로 변환할 수 없습니다.\n");
            System.out.printf("올바른 차원을 입력하세요.\n");
            System.out.printf("혹은 적절한 숫자(행)를 입력하세요\n");

            return false;
        }

        return true;
    }

    //                                          (!)변수 명이 겹치는 경우를 조심하자! row : insertRow
    private boolean checkAvailable(int[][] arr, int insertRow) {

        int row = arr.length;    // 입력 받은 행렬의 행
        int col = arr[0].length; // 입력 받은 행렬의 열
        int len = row * col;     // 행  X 열 = 배열의 길이 or 행렬의 크기

        // if (checkAvailable(arr, row)) {} 와 마찬가지로
        // Boolean 값이 와야 하는 경우에 메서드가 온 경우
        return checkDivideElement(len, insertRow);
    }

    private boolean checkAvailable(int[] arr, int row) {
        int len = arr.length;

        return checkDivideElement(len, row);
    }

    private boolean checkAvailable(int[] arr, int row, int col) {
        int len = arr.length;

        // 배열의 길이(행렬의 크기)가 행 X 열 의 값과 같으면 true 를 같지 않다면 false 를 res 에 대입한다.
        boolean res = (len == row * col ? true : false);

        // res 가 참이면 입력 받은 row 와 col 을 해당 클래스의 row 와 col 에 할당한다.
        if (res) {
            this.row = row;
            this.col = col;
        }

        // res 에 담긴 boolean 값을 반환한다.
        return res;
    }

    // 행렬의 덧셈과 뺄셈은 행렬의 크기가 서로 같아야만 계산이 가능하다.
    // 행렬의 크기가 같은지 판정하는 메서드
    private boolean checkDimension(Matrix A, Matrix B) {
        // 계산하고자 하는 행렬들의 행, 열을 가져와 비교
        int Arow = A.getRow();
        int Acol = A.getCol();

        int Brow = B.getRow();
        int Bcol = B.getCol();

        return (Arow == Brow) && (Acol == Bcol);
    }

    // 행렬의 곱셈은 계산하고자 하는 행렬 A의 열과
    // B의 행이 같아야만 계산이 가능하다.
    // 곱셈이 가능한 메서드인지 판정하는 메서드
    private boolean checkMulDimension(Matrix A, Matrix B) {
        int Acol = A.getCol();
        int Brow = B.getRow();

        return Acol == Brow;
    }

    public void addMatrix(Matrix A, Matrix B) {
        if (checkDimension(A, B)) {
            int[][] matA = A.getMat();
            int[][] matB = B.getMat();

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    mat[i][j] = matA[i][j] + matB[i][j];
                }
            }
        }
    }

    public void subMatrix(Matrix A, Matrix B) {
        if (checkDimension(A, B)) {
            int[][] matA = A.getMat();
            int[][] matB = B.getMat();

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    mat[i][j] = matA[i][j] - matB[i][j];
                }
            }
        }
    }

    public void multiplyMatrix(Matrix A, Matrix B) {
        if (checkMulDimension(A, B)) {

            int[][] matA = A.getMat();
            int[][] matB = B.getMat();

            int Arow = matA.length;
//            int Acol = matA[0].length;

            int Brow = matB.length;
            int Bcol = matB[0].length;

            // 두 행렬을 곱셈한 행렬의 행은
            // 계산하고자 하는 A 행렬의 행과 같고,
            // B 행렬의 열과 같다.
            mat = new int[Arow][Bcol];

            // 곱셈 과정에서 발생하는 누산의 데이터를
            // 백업하기 위한 변수 key 를 선언
            int key = 0;
            // 3중 for 문을 사용하기 위해 index 로 사용할
            // 변수 a 를 선언
            int a;

            for (int i = 0; i < Arow; i++) { // A의 행을 증가시키기 위함

                for (a = 0; a < Bcol; a++) { // B의 열을 증가시키기 위함
                                             // 열 -> 행 순으로 증가함

                    for (int j = 0; j < Brow; j++) { // 계산(곱셈과 누산)을 위함
                        // 내가 어떻게 곱셈 알고리즘을 파악했는지:
                        // 1. A의 열과 B의 행은 항상 같은 수이다.
                        // 2. 가장 내부의 for 문이 돌고나면
                        //    (즉, 곱셈의 요소를 하나 구했다면)
                        //    A의 행은 그대로이지만 B의 열은 1증가한다.
                        //    (A의 0행과 다음 B의 열을 계산 한다는 뜻.)
                        // 3. A의 0행과 모든 B 열 계산을 모두 반복했으면
                        //    A의 다음 행과 모든 B 열 계산을 한다.
                        // 4. 반복이 끝날 때 까지 반복한다.

                        // 곱셈을 한 번 마친 경우 백업 데이터에 값을 누산해
                        // 온전한 값을 key 에 담는다.
                        key += (matA[i][j] * matB[j][a]);
                    }
                    // 이중 배열 mat 에 key 값을 대입
                    mat[i][a] = key;
                    // 다시 key 를 사용하기 위해 key 를 0으로 초기화
                    key = 0;
                }
            }
        }
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public int[][] getMat() {
        return mat;
    }

    public void printMatrix() {
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                System.out.printf("%4d", mat[i][j]);
            }
            System.out.println("");
        }
    }

    public void allocRandomMatrix() {
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                mat[i][j] = (int)(Math.random() * 10);
            }
        }
    }
}
