package Tenth.Homework;

public class MatrixQnA {
    // Matrix wrong = new Matrix(arr1, 4);
    // wrong.allocRandomMatrix();
    // wrong.printMatrix();
    // ----이 값이 왜 아래와 같이 나오는지 다시 설명 부탁드리겠습니다.-----
    // 행렬로 변환할 수 없습니다.
    // 올바른 차원을 입력하세요.
    // 혹은 적절한 숫자(행)를 입력하세요
    // -----이렇게 나오는 이유가 배열안의 상수(1~9의 수)들이 row 4로 나누었을때 나머지가 0이 아니기때문에 위 와같이 나오는건가요?
    // -----{{1,2,3}{4,5,6}{7,8,9}{값이 없음}} 이렇게 되서 false 처리를 하는건인가요?
    // -----그렇다면 {{1,2,3}{4,5,6}{7,8,9}{10,값이 없음,값이 없음}} 이것도 불가능한 것 인가요?
    // -----그렇다면 동적배열을 할때는 row 는 무조건적으로 상수의 값이 할당이 되어야 하나요?
    // -----만약에 맞다면 이유는 만약에 비어있는 이중 배열값이 있으면
    //      데이터 처리 속도가 늦어지 때문에 이것을 방지하기 위해 이렇게 예외 처리를 진행한것인가요?



    // Matrix 34줄에서
    //  int totalLen = row * col;
    //            int[] tmp = new int[totalLen];
    //
    //            System.out.println("arr.length = " + arr.length);
    //            System.out.println("arr[0].length = " + arr[0].length);
    //            for(int i = 0; i < arr.length; i++) {
    //                for(int j = 0; j < arr[0].length; j++) {
    //                    tmp[i * arr[0].length + j] = arr[i][j];
    //                    System.out.printf("tmp[%d] = %d\n",
    //                            i * arr[0].length + j,
    //                            tmp[i * arr[0].length + j]);
    // ------------------이부분에서 ------------------------
    //                    System.out.printf("tmp[%d] = %d\n",
    //                            i * arr[0].length + j,
    //                            tmp[i * arr[0].length + j]);
    // i * arr[0].length + j 이것은 0~8까지의 값이라고 이해하였는데
    // 왜 tmp[%d] 는 0부터 시작 하고 뒤 %d는 1부터 시작하는지 다시 한번 설명 부탁드리겠습니다.?
}
