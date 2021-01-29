package Test01;

import java.util.Scanner;

class GasStation {
    private int numX, numY;
    private int[] mapX, mapY;
    private int gasstaionNum;
    private Scanner scan;
    private int[] gasstation;
    private double[] res;
    private double min;

    public GasStation() {
        scan = new Scanner(System.in);

        System.out.printf("주유소가 몇 개인가요? : ");
        gasstaionNum = scan.nextInt(); // 주유소 개수 설정

        gasstation = new int[gasstaionNum]; // 주유소 개수
        mapX = new int[gasstaionNum]; // n개 주유소의 x 좌표
        mapY = new int[gasstaionNum]; // n개 주유소의 y 좌표

        numX = (int) (Math.random() * 10); // 나의 x 좌표
        numY = (int) (Math.random() * 10); // 나의 y 좌표
        System.out.printf("나 (%3d, %3d)\n", numX, numY); // 나의 위치(x, y)
        res = new double[gasstaionNum]; // 두 점 사이 거리
    }

    public void numGasStation() {

        for (int i = 0; i < gasstaionNum; i++) { // 주유소 x 좌표
            mapX[i] = (int) (Math.random() * 10);
        }

        for (int i = 0; i < gasstaionNum; i++) { // 주유소 y 좌표
            mapY[i] = (int) (Math.random() * 10);
        }

        for (int i = 0; i < gasstaionNum; i++) {
            System.out.printf("주유소 %d(%3d, %3d)\n", i + 1, mapX[i], mapY[i]);
        }
    }

    public void goGasStation() {
        boolean check = true;

        for (int i = 0; i < gasstaionNum; i++) {
            res[i] = Math.sqrt(Math.pow(numX - mapX[i], 2)
                    + Math.pow(numY - mapY[i], 2));
//            res[i] = Math.round(((Math.sqrt(Math.pow(numX - mapX[i], 2)
//                    + Math.pow(numY - mapY[i], 2)))*100)/100);
            //res[i] = Math.sqrt((numX - mapX[i]) + (numY - mapY[i]));
            System.out.printf("주유소 %d 거리 : %.5f\n", i + 1, res[i]);

            if (check) {
                min = res[i];
                //System.out.println(min);
                check = false;
            }

            if (min > res[i]) {
                min = res[i];
            }
        }
        //System.out.println(min);

        for (int i = 0; i < gasstaionNum; i++) {
            if (min == res[i]) {
                System.out.printf("가장 가까운 주유소 : %d\n", i + 1);
            }
        }

    }
}

public class Test01_14 {
    public static void main(String[] args) {
        // 현재 차량을 타고 운전 중이다.
        // 기름이 떨어져서 주유소에 들려야 한다.
        // 우리가 사는 세계가 아닌 다른 4차원의 세계다.
        // 지도상에 주유소의 x좌표, y좌표가 랜덤하게 출력된다.
        // 한 번 나타난 좌표는 사라지지 않는다.
        // 이 정보를 기반으로 가장 가까운 거리의 주유소를 찾도록 프로그램을 작성해보자!
        // (현재 내 좌표도 랜덤으로 설정하도록 한다)
        GasStation gs = new GasStation();

        gs.numGasStation();
        gs.goGasStation();
    }
}
