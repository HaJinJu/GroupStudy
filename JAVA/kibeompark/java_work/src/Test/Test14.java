package Test;

import java.util.Arrays;
import java.util.Scanner;

class GasStation {
    // 4차원이므로 축 4개 설정
    private final int FOUR = 4;

    private int numOfGasStation;
    private int[][] gas;
    private int[] myLocation;
    private float[] sum, distance;
    private int[] pointOfArr;

    private Scanner scan;

    public GasStation() {
        scan = new Scanner(System.in);

        System.out.print("주유소 개수를 입력하세요. ");
        numOfGasStation = scan.nextInt();

        gas = new int[numOfGasStation][FOUR];
        myLocation = new int[FOUR];
        sum = new float[numOfGasStation];
        distance = new float[numOfGasStation];
        pointOfArr = new int[numOfGasStation];

        for (int i = 0; i < numOfGasStation; i++) {
            pointOfArr[i] = i + 1;
        }
    }

    public void setLocation() {
        for (int i = 0; i < FOUR; i++) {
            myLocation[i] = (int) (Math.random() * 10);
        }
        System.out.println("내 위치 좌표 : " + Arrays.toString(myLocation));

        for (int i = 0; i < numOfGasStation; i++) {
            for (int j = 0; j < FOUR; j++) {
                gas[i][j] = (int) (Math.random() * 10);
            }
            System.out.println("주유소 " + (i + 1)
                    + " 위치 좌표 : " + Arrays.toString(gas[i]));
        }
        System.out.println();
    }

    public void calcDistance() {
        for (int i = 0; i < numOfGasStation; i++) {
            for (int j = 0; j < FOUR; j++) {
                sum[i] += Math.pow((myLocation[j] - gas[i][j]), 2);
            }
            distance[i] = (float) Math.sqrt(sum[i]);
            System.out.println("나와 주유소 " + (i + 1) + " 까지의 거리 : " + distance[i]);
        }
        System.out.println();
    }

    public void insertSort() {
        int i, j, point;
        float num;

        for (i = 1; i < numOfGasStation; i++) {
            num = distance[i];
            point = pointOfArr[i];
            for (j = i - 1; j >= 0 && distance[j] > num; j--) {
                distance[j + 1] = distance[j];
                pointOfArr[j + 1] = pointOfArr[j];
            }
            distance[j + 1] = num;
            pointOfArr[j + 1] = point;
        }
    }

    public void printResult() {
        int cnt = 0;

        for (int i = 0; i < numOfGasStation; i++) {
            if (distance[0] == distance[i]) cnt++;
        }

        System.out.println("오름차순 정렬 결과");
        for (int i = 0; i < numOfGasStation; i++) {
            System.out.printf("%d : %4.2f\t", pointOfArr[i], distance[i]);
        }
        System.out.println("\n");

        System.out.printf("나와 가장 가까운 거리에 있는 주유소 : %d개소 (", cnt);
        for (int i = 0; i < cnt; i++) {
            System.out.printf("주유소 %d", pointOfArr[i]);

            if (i < cnt - 1) System.out.print(", ");
            else System.out.print("), ");
        }
        System.out.printf("거리 : %4.2f", distance[0]);
    }
}

public class Test14 {
    public static void main(String[] args) {
        // 현재 차량을 타고 운전 중이다.
        // 기름이 떨어져서 주유소에 들러야 한다.
        // 우리가 사는 세계가 아닌 다른 4차원의 세계라
        // 지도 상에 주유소의 x 좌표, y 좌표가 랜덤하게 출력된다.
        // 한 번 나타난 좌표는 사라지지 않는다.
        // 이 정보를 기반으로 가장 가까운 거리의 주유소를 찾도록 프로그램을 작성해 보자 !
        // (현재 내 좌표도 랜덤으로 설정하도록 한다.)
        GasStation gs = new GasStation();

        gs.setLocation();
        gs.calcDistance();
        gs.insertSort();
        gs.printResult();
    }
}
