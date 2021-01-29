package Homework.Tenth;

import java.util.Scanner;

public class Matrix {
    private int row, col, count;
    private int[][] mat;
    private int[] arr;
    private int[][] matA, matB;

    private boolean check;

    Scanner scan;

    public Matrix() {
        scan = new Scanner(System.in);

        System.out.print("몇 개의 행렬이 필요하세요 ? ");
        count = scan.nextInt();

        if (count == 1) { // 나눗셈 준비... but, 구하는 것 실패
            System.out.print("배열의 크기를 입력하세요. (행, 열 순서대로) ");
            row = scan.nextInt();
            col = scan.nextInt();

            mat = new int[row][col];

            System.out.println("행렬");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    mat[i][j] = (int) (Math.random() * 10) + 1;
                    System.out.printf("%3d", mat[i][j]);
                }
                System.out.println();
            }
        } if (count == 2) {
            System.out.print("배열의 크기를 입력하세요. (행, 열 순서대로) ");
            row = scan.nextInt();
            col = scan.nextInt();

            matA = new int[row][col];

            System.out.println("행렬 1");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    matA[i][j] = (int) (Math.random() * 10) + 1;
                    System.out.printf("%3d", matA[i][j]);
                }
                System.out.println();
            }

            System.out.print("배열의 크기를 입력하세요. (행, 열 순서대로) ");
            row = scan.nextInt();
            col = scan.nextInt();

            matB = new int[row][col];

            System.out.println("행렬 2");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    matB[i][j] = (int) (Math.random() * 10) + 1;
                    System.out.printf("%3d", matB[i][j]);
                }
                System.out.println();
            }
        } else {
            check = false;
        }
    }

    public Matrix(int[] arr, int row, int col) {
        this.arr = arr;
        this.row = row;
        this.col = col;

        if (arr.length == row * col) {
            check = true;
            mat = new int[row][col];

            changeArr();
        } else {
            check = false;
        }
    }

    public Matrix(int[] arr, int row) {
        this.arr = arr;
        this.row = row;

        if (arr.length % row == 0) {
            check = true;
            col = arr.length / row;
            mat = new int[row][col];

            changeArr();
        } else {
            check = false;
        }
    }

    public Matrix(int row, int col) {
        this.row = row;
        this.col = col;

        mat = new int [row][col];
    }

    public void sumMatrix() {
        if (matA.length == matB.length && matA[0].length == matB[0].length) {
            check = true;
            mat = new int[row][col];

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    mat[i][j] = matA[i][j] + matB[i][j];
                }
            }

            System.out.println("\n두 행렬의 합");
        } else {
            check = false;
        }
    }

    public void subMatrix() {
        if (matA.length == matB.length && matA[0].length == matB[0].length) {
            check = true;
            mat = new int[row][col];

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    mat[i][j] = matA[i][j] - matB[i][j];
                }
            }

            System.out.println("\n두 행렬의 차");
        } else {
            check = false;
        }
    }

    //       1 X 2           2 X 1                      1 X 1
    // | [0][0] [0][1] | * | [0][0] | = | [0][0] * [0][0] + [0][1] * [1][0] |
    //                     | [1][0] |
    //
    //           2 X 3                  3 X 2
    // | [0][0] [0][1] [0][2] |   | [0][0] [0][1] |
    // |                      | * | [1][0] [1][1] |
    // | [1][0] [1][1] [1][2] |   | [2][0] [2][1] |
    //                                                       2 X 2
    //   | [0][0] * [0][0] + [0][1] * [1][0] + [0][2] * [2][0]   [0][O] * [0][1] + [0][1] * [1][1] + [0][2] * [2][1] |
    // = |                                                                                                           |
    //   | [1][0] * [0][0] + [1][1] * [1][0] + [1][2] * [2][0]   [1][0] * [0][1] + [1][1] * [1][1] + [1][2] * [2][1] |
    // 행렬 곱[첫 번째 행렬 행 크기만큼 반복][두 번째 행렬 열 크기만큼 반복]
    // = 첫 번째 행렬[행 크기만큼 반복][첫 번째 행렬 열 or 두 번째 행렬 행 크기만큼 반복]
    //   * 두 번째 행렬[첫 번째 행렬 열 or 두 번째 행렬 행 크기만큼 반복][열 크기만큼 반복]
    // => 위 경우 for ( 2번 for ( 2번 for ( 3번 ) )
    public void mulMatrix() {
        if (matA[0].length == matB.length) {
            check = true;
            mat = new int[matA.length][matB[0].length];

            for (int i = 0; i < matA.length; i++) {
                for (int j = 0; j < matB[0].length; j++) {
                    for (int k = 0; k < matB.length; k++) {
                        mat[i][j] += matA[i][k] * matB[k][j];
                    }
                }
            }
        } else {
            check = false;
        }

        System.out.println("\n두 행렬의 곱");
    }

    public void inverseMatrix() {
        if (row == col) {
            check = true;
            // 역행렬 식 ?
        } else {
            check = false;
        }
    }

    public void changeArr() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = arr[i * col + j];
            }
        }
    }

    public void allocRandomMatrix() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = (int)(Math.random() * 10);
            }
        }
    }

    public void printMatrix() {
        if (check) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.printf("%3d", mat[i][j]);
                }
                System.out.println("");
            }
        } else {
            System.out.println("잘못 입력하셨습니다. 수행 불가능 합니다.");
        }
    }
}
