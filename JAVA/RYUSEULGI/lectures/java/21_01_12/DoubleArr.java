public class DoubleArr {
    public static void main(String[] args) {

        int[][] arr = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                // 이중 배열의 경우 안쪽이 큰 공간
                // 바깥쪽은 큰 공간을 나눈 작은 공간
                System.out.printf("%2d", arr[i][j]);
            }
            System.out.println("");
        }

        System.out.println("new 사용");

        int[][] arr2 = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr2[i][j] = (i + 1) * (j + 1);
                System.out.printf("%2d", arr2[i][j]);
            }
            System.out.println("");
        }
    }
}
