package Tenth_HomeWork;

public class TESTMAT {
    // int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    // Matrix A = new Matrix(arr, 3 ,3);
    // 혹은
    // Matrix A = new Matrix(arr,3);
    // 둘다 동작이 되어야 할 것이다.
    int start;
    int end;

    int[][] mat;
    int[][] mat2;
    int [][] sum;
    int [][] sub;
    int [][] multi;


    public TESTMAT(int start, int end){
        this.start = start;
        this.end = end;
        mat = new int[start][end];
        mat2 =new int[start][end];
        sum = new int[start][end];
        sub = new int[start][end];
        multi = new int[start][end];

    }

    public void mat1(){int i;int j;
        for ( i = 0; i < start; i++){
            for ( j =0 ; j<end; j++){
                mat[i][j] = (int) (Math.random()*10);
            }
        }

    }

    public void printArray(){int i,j;
        //mat = new int[start][end];
        for ( i =0; i <start;i++){
            for(j =0; j <end;j++){
                System.out.printf("%2d",mat[i][j]);
            }
            System.out.println("");
        }System.out.println("---------2번째행렬");
        for ( i =0; i <start;i++){
            for(j =0; j <end;j++){
                System.out.printf("%2d",mat2[i][j]);
            }
            System.out.println("");

        }System.out.println("합");

        for ( i =0; i <start;i++){
            for(j =0; j <end;j++){
                System.out.printf("%2d",sum[i][j]);
            }
            System.out.println("");
        }System.out.println("차");

        for ( i =0; i <start;i++){
            for(j =0; j <end;j++){
                System.out.printf("%2d",sub[i][j]);
            }
            System.out.println("");
        }System.out.println("곱");

        for ( i =0; i <start;i++){
            for(j =0; j <end;j++){
                System.out.printf("%3d",multi[i][j]);
            }
            System.out.println("");
        }
    }


    public void mat2(){int i,j;
        for (i = 0; i < start; i++){
            for (j =0 ; j<end; j++){
                mat2[i][j] = (int) (Math.random()*10);

            }
        }
    }

    public void sumMat(){int i,j;
        for (i = 0; i < start; i++){
            for (j =0 ; j<end; j++){
                sum[i][j] = mat[i][j] +mat2[i][j];

            }
        }
    }
    public void subMat(){int i,j;
        for (i = 0; i < start; i++){
            for (j =0 ; j<end; j++){
                sub[i][j] = mat[i][j] - mat2[i][j];

            }
        }
    }
    public void multiMat(){int i,j;
        for (i = 0; i < start; i++){
            for (j =0 ; j<end; j++){
                multi[i][j] = mat[i][j] * mat2[i][j];

            }
        }
    }
}

