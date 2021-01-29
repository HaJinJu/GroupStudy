package Test;

import java.util.ArrayList;
import java.util.Scanner;

class ContainerManager {
    private int base, start, range;
    private int space, product, container, maxProduct, maxContainer, remainSpace, remainProduct;
    private int removeProduct, addContainer, minRemainSpace;
    private ArrayList<Integer> listOfContainer;
    private int check;

    private Scanner scan;

    public ContainerManager(int base, int start, int range) {
        this.base = base;
        this.start = start;
        this.range = range;

        scan = new Scanner(System.in);
        listOfContainer = new ArrayList<>();
        check = 0;

        // 공간 크기
        space = (int) (Math.random() * range) + start;
        // 물품 개수
        product = (int) (Math.random() * space);
    }

    public int manageContainer(int num) {
        return num & ~(base - 1);
    }

    public void arraylistContainer() {
        // 묶음 수 만큼 base 추가
        for (int i = 0; i < container; i++) {
            listOfContainer.add(base);
        }
        // 묶음 처리 하고 남은 물품 개수 추가
        listOfContainer.add(remainProduct);
        // 마지막 인덱스에는 남는 공간
        listOfContainer.add(remainSpace);
    }

    public void printInfo() {
        System.out.printf("현재 물품의 총 개수 : %d개\n", product);
        System.out.printf("현재 묶음의 총 개수 : %d개\n", container);
        System.out.printf("묶음 처리 후 남은 개수 : %d개 \n", remainProduct);
        System.out.printf("남는 공간 : %d\n", remainSpace);
        System.out.println("공간 정보 (마지막은 남는 공간)\n" + listOfContainer);
        System.out.println();

        if (check == 1) {
            System.out.printf("추가로 넣을 수 있는 묶음 개수 : %d개\n", addContainer);
            System.out.printf("묶음을 최대로 넣었을 때 남는 공간 : %d개\n", minRemainSpace);
        }
    }

    public void countOfContainer() {
        // 최대로 담을 수 있는 물품 개수
        maxProduct = manageContainer(space);
        // 최대로 담을 수 있는 묶음 개수
        maxContainer = maxProduct / base;
        // 남는 공간
        remainSpace = space - product;
        // 현재 물품 개수로 가능한 묶음 개수
        container = manageContainer(product) / base;
        // 현재 물품 개수에서 묶음 처리 한 뒤 남은 개수
        remainProduct = product - manageContainer(product);

        arraylistContainer();

        System.out.printf("공간 크기 : %d\n", space);
        System.out.printf("%d개 단위로 배치 가능한 물품의 묶음 개수 : %d개, 물건 개수 : %d개\n\n",
                base, maxContainer, maxProduct);

        printInfo();
    }
    // 어떤 임의의 공간 크기가 5만 ~ 10만 이다.
    // 이 공간에 어떤 물품을 4096 단위로 정렬하여 배치하고자 한다.
    // 이를 프로그래밍해 보자 !
    // 위의 문제에서 낭비되는 공간은 얼마인지 파악해 보자 !
    // 또한 배치된 물품에서 물건을 꺼낼 경우
    // 어떤 식으로 공간을 관리할지 전략을 구성하여
    // 해당 전략에 대해 프로그래밍해 보도록 한다.

    public void takeoutProduct() {
        check = 1;

        // 총 물품 개수 범위 내에서 뺄 물건 개수 입력
        do {
            System.out.print("물건을 몇 개 꺼내시겠습니까 ? ");
            removeProduct = scan.nextInt();
        } while(removeProduct > product);
        System.out.println(removeProduct + "개 물건을 뺐습니다.\n");

        // 물건을 빼면서 줄어든 물건 개수
        product -= removeProduct;
        // 물건을 빼면서 줄어든 묶음 개수
        container = manageContainer(product) / base;
        // 현재 물품 개수에서 묶음 처리 한 뒤 남은 개수
        remainProduct = product - manageContainer(product);
        // 물건을 빼면서 늘어난 공간 크기
        remainSpace += removeProduct;
        // 추가로 넣을 수 있는 묶음 개수
        addContainer = manageContainer(remainSpace) / base;
        // 묶음을 최대로 넣었을 때 남는 공간
        minRemainSpace = space - manageContainer(remainSpace);

        listOfContainer.clear();

        arraylistContainer();
        printInfo();

        /*
        // 뺄 물건 개수, 뺄 묶음 개수, 뺄 물건 나머지
        int removeProduct, removeContainer, removeRemain;
        // 빼고 난 뒤 묶음 개수, 빼고 난 뒤 나머지
        int changedContainer, changedRemain;

        // 총 물품 개수 범위 내에서 뺄 물건 개수 입력
        do {
            System.out.print("물건을 몇 개 꺼내시겠습니까 ? ");
            removeProduct = scan.nextInt();
        } while(removeProduct > space);
        System.out.println(removeProduct + "개 물건을 뺐습니다.");

        // 꺼낼 물건이 4096 보다 크면
        if (removeProduct > base) {
            // 뺄 묶음 개수 정의
            removeContainer = manageContainer(removeProduct) / base;
            // 묶음으로 나눈 후 나머지
            removeRemain = removeProduct - manageContainer(removeProduct);
            // 빼고 난 뒤 묶음 개수 정의
            changedContainer = container - removeContainer;

            // 바뀐 묶음 개수만큼 리스트에 4096 추가
            for (int i = 0; i < changedContainer; i++) {
                listOfContainer.add(base);
            }

            System.out.printf("빠질 물건 중 나머지 물품 개수 : %d개\n", removeRemain);

            // 뺄 물건의 나머지가 기존 나머지보다 크면
            if (removeRemain > remain) {
                // 묶음 개수 1 감소
                changedContainer -= 1;
                // 기존 나머지에 4096을 더한 뒤 뺄 물건의 나머지를 뺀다.
                changedRemain = remain + base - removeRemain;

                // 리스트에서 마지막 묶음을 빼고 새로운 나머지를 추가
                listOfContainer.remove(changedContainer - 1);
                listOfContainer.add(changedRemain);
            // 작으면
            } else {
                // 기존 나머지에서 뺄 물건의 나머지를 뺀다.
                changedRemain = remain - removeRemain;

                // 리스트에 새로운 나머지 추가
                listOfContainer.add(changedRemain);
            }

            System.out.printf("묶음 개수 : %d개\n", changedContainer);
            System.out.printf("나머지 물품 개수 : %d개\n", changedRemain);
            System.out.println("재정렬된 물품 묶음\n" + listOfContainer);
        // 4096 보다 작거나 같으면
        } else {
            // 변수에 값 대입
            changedContainer = container;

            // 묶음 개수만큼 리스트에 4096 추가
            for (int i = 0; i < container; i++) {
                listOfContainer.add(base);
            }

            // 뺄 물건 개수가 기존 나머지보다 크면
            if (removeProduct > remain) {
                // 묶음 개수 1 감소
                changedContainer -= 1;
                // 기존 나머지에 4096을 더한 뒤 뺄 물건의 나머지를 뺀다.
                changedRemain = remain + base - removeProduct;

                // 리스트에서 마지막 묶음을 빼고 새로운 나머지를 추가
                listOfContainer.remove(changedContainer);
                listOfContainer.add(changedRemain);
            // 작으면
            } else if (removeProduct < remain) {
                // 기존 나머지에서 뺄 물건 개수를 뺀다.
                changedRemain = remain - removeProduct;

                // 리스트에 새로운 나머지 추가
                listOfContainer.add(changedRemain);
            // 같으면 (윗줄에서 새로운 나머지 추가할 때 0이 추가되는 것을 방지)
            } else {
                changedRemain = 0;
            }

            System.out.printf("묶음 개수 : %d개\n", changedContainer);
            System.out.printf("나머지 물품 개수 : %d개\n", changedRemain);
            System.out.println("재정렬된 물품 묶음\n" + listOfContainer);
        }
        */
    }
}

public class Test8to9 {
    public static void main(String[] args) {
        // 어떤 임의의 공간 크기가 5만 ~ 10만 이다.
        // 이 공간에 어떤 물품을 4096 단위로 정렬하여 배치하고자 한다.
        // 이를 프로그래밍해 보자 !
        // 위의 문제에서 낭비되는 공간은 얼마인지 파악해 보자 !
        // 또한 배치된 물품에서 물건을 꺼낼 경우
        // 어떤 식으로 공간을 관리할지 전략을 구성하여
        // 해당 전략에 대해 프로그래밍해 보도록 한다.
        ContainerManager cm = new ContainerManager(4096, 50000, 50001);

        cm.countOfContainer();
        cm.takeoutProduct();
    }
}
