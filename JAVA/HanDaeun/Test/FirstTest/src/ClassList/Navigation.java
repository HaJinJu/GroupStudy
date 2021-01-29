package ClassList;

import java.util.HashMap;

public class Navigation {
    private final int GASSTATION = 5;
    private final int XYSTART = 1;
    private final int XYEND = 100;
    private final int ZERO = 0;
    private final int ONE = 1;
    private final String PRINTPERSONMSG = "당신의 현재 좌표는 ";
    private final String PRINTGSTAIONMSG1 = "주유소 ";
    private final String PRINTGSTAIONMSG2 = "의 현재 좌표는 ";
    private final String PRINTDISTANCEMSG = "와(과)의 거리는 ";
    private final String PRINTRESULTMSG1 = "따라서 가장 가까운 주유소는 ";
    private final String PRINTRESULTMSG2 = "이고 거리는 ";
    private final String PRINTLN = "\n";
    private final String PRINTXMSG = "X : ";
    private final String PRINTYMSG = "      Y : ";
    private int personX, personY;
    private int[] gasStationX;
    private int[] gasStationY;
    private Double[] distance;
    private int target;
    private int randX, randY;

    public Navigation() {
        setRandPersonCoordinate();
        setRandGStationCoordinate();
        distance = new Double[GASSTATION];
    }

    public void setRandCoordinate() {
        int range = XYEND - XYSTART + ONE;

        randX = (int)(Math.random() * range) + XYSTART;
        randY = (int)(Math.random() * range) + XYSTART;
    }

    public void setRandPersonCoordinate() {
        setRandCoordinate();

        personX = randX;
        personY = randY;
    }

    public void setRandGStationCoordinate() {
        gasStationX = new int[GASSTATION];
        gasStationY = new int[GASSTATION];

        for(int i = ZERO; i < GASSTATION; i++) {
            setRandCoordinate();
            gasStationX[i] = randX;
            gasStationY[i] = randY;
        }
    }

    public void calcDistance() {
        int temp, differenceX, differenceY;
        double tempDis;
        target = 0;

        for(int i = ZERO; i < GASSTATION; i++) {
            temp = personX - gasStationX[i];
            differenceX = (temp > 0) ? temp : (temp * -1);
            temp = personY - gasStationY[i];
            differenceY = (temp > 0) ? temp : (temp * -1);

            tempDis = Math.sqrt((Math.pow(differenceX, 2) + Math.pow(differenceY, 2)));
            distance[i] = Double.parseDouble(String.format("%.2f", tempDis));

            if(i >= ONE && distance[i] < distance[target]) {
                target = i;
            }
        }
    }

    public void printPersonCoordinate() {
        System.out.print(PRINTPERSONMSG);
        System.out.print(PRINTXMSG + personX);
        System.out.println(PRINTYMSG + personY + PRINTLN);
    }

    public void printGStationCoordinate() {
        for(int i = ZERO; i < GASSTATION; i++) {
            System.out.print(PRINTGSTAIONMSG1 + (i+1) + PRINTGSTAIONMSG2);
            System.out.print(PRINTXMSG + gasStationX[i]);
            System.out.println(PRINTYMSG + gasStationY[i]);

            if(i == GASSTATION - ONE) {
                System.out.print(PRINTLN);
            }
        }
    }

    public void printResult() {
        for(int i = ZERO; i < GASSTATION; i++) {
            System.out.println(PRINTGSTAIONMSG1 + (i+1) + PRINTDISTANCEMSG + distance[i]);

            if(i == GASSTATION - ONE) {
                System.out.print(PRINTLN);
            }
        }
        System.out.println(PRINTRESULTMSG1 + (target + ONE) + PRINTRESULTMSG2 + distance[target]);
    }
}