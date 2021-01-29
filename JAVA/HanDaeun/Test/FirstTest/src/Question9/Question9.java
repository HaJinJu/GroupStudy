/*
        < Question 9 >
위의 문제에서 낭비되는 공간은 얼마인지 파악해보자!
또한 배치된 물품에서 물건을 꺼낼 경우 어떤식으로 공간을 관리할지
전략을 구성하여 해당 전략에 대해 프로그래밍 해보도록 한다.
*/


package Question9;

import ClassList.ArrangeFreight;

public class Question9 {
    public static void main(String[] args) {
        ArrangeFreight af = new ArrangeFreight();

        af.printStorageSize();
        af.calcFreightUnitNum();
        af.calcStorageRemain();

        af.printFreightCapacity();
        af.printStorageRemain();

        af.pullFreight();
        af.calcStorageRemain();
        af.printPullFreightNum();
        af.printFreightCapacity();
        af.printStorageRemain();
    }
}