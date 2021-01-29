/*
        < Question 8 >
어떤 임의의 공간 크기가 5만 ~ 10만이다.
이 공간에 어떤 물품을 4096 단위로 정렬하여 배치하고자 한다.
이를 프로그래밍 해보자!
*/


package Question8;

import ClassList.ArrangeFreight;

public class Question8 {
    public static void main(String[] args) {
        ArrangeFreight af = new ArrangeFreight();

        af.printStorageSize();
        af.calcFreightUnitNum();
        af.calcFreightCapacity();
        af.printFreightCapacity();
    }
}