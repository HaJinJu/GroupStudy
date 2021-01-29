package Tenth;

public class Exercise1 {
    public static void main(String[] args) {
        Matrix mat = new Matrix(3, 3);

        mat.allocRandomMatrix();
        mat.printMatrix();
    }
}

/*
class DoubleArray {
    int doubleArr[][];
    int a, b;

    public DoubleArray(int a, int b) {
        this.a = a;
        this.b = b;
        doubleArr = new int[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                doubleArr[i][j] = i * j;
            }
        }
    }

    public void printArray() {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.printf("%2d", doubleArr[i][j]);
            }
            System.out.println("");
        }
    }
}

public class DoubleArrayTest {
    public static void main(String[] args) {
        DoubleArray da = new DoubleArray(3, 3);

        da.printArray();
    }
}
 */