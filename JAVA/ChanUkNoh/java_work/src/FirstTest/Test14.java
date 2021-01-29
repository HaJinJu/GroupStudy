package FirstTest;

import java.util.ArrayList;

class NearestCoordinates {
    private int nearGasStationNum;

    private final int SIZE = 100;
    private final String[] ENTERPRISE = {
            "GS", "SK", "S-OIL"
    };

    ArrayList<String> gasStation_ID;

    private int myX;
    private int myY;

//    int[] gasStation_ID;
    private int[] gasStationX;
    private int[] gasStationY;

    private double[] powDistance;
    private double[] distance;

    public NearestCoordinates(int nearGasStationNum) {
        this.nearGasStationNum = nearGasStationNum;

        myX = (int)(Math.random() * SIZE);
        myY = (int)(Math.random() * SIZE);

        gasStation_ID = new ArrayList<String>();

        gasStationX = new int[nearGasStationNum];
        gasStationY = new int[nearGasStationNum];

        for (int i = 0; i < nearGasStationNum; i++) {
            int randNum = (int)(Math.random() * 3);
            gasStationX[i] = (int)(Math.random() * SIZE);
            gasStationY[i] = (int)(Math.random() * SIZE);
            gasStation_ID.add(ENTERPRISE[randNum]);
        }
    }

    public void calcDistance() {
        powDistance = new double[nearGasStationNum];
        distance = new double[nearGasStationNum];

        for (int i = 0; i < nearGasStationNum; i++) {
            powDistance[i] = Math.pow((myX - gasStationX[i]), 2) + Math.pow((myY - gasStationY[i]), 2);
            distance[i] = Math.sqrt(powDistance[i]);
        }
    }

    public void sortDistance() {
        double numKey;
        String gasStationKey;
        int i, j;

        for (i = 1; i < nearGasStationNum; i++) {
            numKey = distance[i];
            gasStationKey = gasStation_ID.get(i);

            for(j = i - 1; (j != -1) && (distance[j] > numKey); j--) {
                distance[j + 1] = distance[j];
                gasStation_ID.add((j + 1), gasStation_ID.get(j));
            }

            distance[j + 1] = numKey;
            gasStation_ID.add((j + 1), gasStationKey);
        }
    }

    public void printNearest() {

        for (int i = 0; i < nearGasStationNum; i++) {
            System.out.println("거리: " + distance[i]);
            System.out.println("주유소: " + gasStation_ID.get(i));

        }
        System.out.println("");
        System.out.println("가장 가까운 주유소: " + gasStation_ID.get(0));
    }
}

public class Test14 {
    public static void main(String[] args) {
        NearestCoordinates nc = new NearestCoordinates(3);

        nc.calcDistance();
        nc.sortDistance();
        nc.printNearest();
    }
}
