package Thirteenth.Homework;

import java.util.ArrayList;
import java.util.Iterator;

public class RandomStudyGroup {
    private int personNumber;
    private int numOfMembersA;
    private int numOfMembersB;
    private int[] personNumberArr;
    private int[] MembersArrA;
    private int[] MembersArrB;
    private ArrayList<Integer> personArrayList;
    private ArrayList<Integer> MembersArrayListA;
    private ArrayList<Integer> MembersArrayListB;

    public RandomStudyGroup(int personNumber, int numOfMembersA, int numOfMembersB) {
        this.personNumber = personNumber;
        this.numOfMembersA = numOfMembersA;
        this.numOfMembersB = numOfMembersB;
        personNumberArr = new int[17];
        MembersArrA = new int[9];
        MembersArrB = new int[8];
        personArrayList = new ArrayList<Integer>();
        MembersArrayListA = new ArrayList<Integer>();
        MembersArrayListB = new ArrayList<Integer>();


    }

    public int RandomPersonNumber() { // 사람의 번호 임의 할당
        boolean isDup = false; // 중복이면 false
        int randNum; // 난수

        do { // do-while 문 활용
            randNum = (int) (Math.random() * 17) + 1;

            if (personNumberArr[randNum] != 0) {
                isDup = true; // 중복이 아니라면 if문을 벗어난다.
            } else {
                isDup = false;
                personNumberArr[randNum] = 1;
            }
        } while (isDup);

        return randNum; // 중복이면 다시 번호 할당?
    }

//    public void RandomStudyGroupA() { // 사람의 번호 임의 할당
//        boolean isDup = false; // 중복이면 false
//        int randNum=0; // 난수
//
//        System.out.println("A조 입니다");
//
//        do { // do-while 문 활용
//            randNum = (int) (Math.random() * 9);
//
//            if (MembersArrA[randNum] != 0) {
//                isDup = true; // 중복이 아니라면 if문을 벗어난다.
//            } else {
//                isDup = false;
//                MembersArrA[randNum] = 1;
//            }
//        } while (isDup);
//
//    }
//
//
//    public int RandomStudyGroupB() { // 사람의 번호 임의 할당
//        boolean isDup = false; // 중복이면 false
//        int randNum; // 난수
//
//        System.out.println(" B조 입니다 ");
//        do { // do-while 문 활용
//            randNum = (int) (Math.random() * 8) + 1;
//
//            if (MembersArrB[randNum] != 0) {
//                isDup = true; // 중복이 아니라면 if문을 벗어난다.
//            } else {
//                isDup = false;
//                MembersArrB[randNum] = 1;
//            }
//        } while (isDup);
//
//        return randNum;
//    }
//
//    public void groupMembersA() {
//        int personNumber = 0;
//        for (int i = 0; i < numOfMembersA; i++) {
//            RandomStudyGroupA();
//            personArrayList.add(personNumber);
//        }
//    }
//
//
//    public void printMembersArrayList(int[] membersArrA) {
//        int cnt = 1; // 초기값 1
//        Integer memberNum;
//
//        Iterator e = personArrayList.iterator();
//
//        while (e.hasNext()) {// hasNext()를 통해 읽어올 요소가 있는지 확인
//            memberNum = (Integer) e.next();
//            System.out.printf("%3d", memberNum);
//            if (cnt % 5 == 0) { // 5명씩 출력 후 줄 바꿈
//                System.out.println("");
//            }
//            cnt++;
//
//        }
//
//    }
//
//    public void printmembersArr(int[] personNumberArr) {
//        int cnt = 1;
//
//        for (int i = 0; i < personNumberArr.length; i++) {
//            System.out.printf("%3d", personNumberArr[i] + 1);
//
//            if (cnt % 5 == 0) {
//                System.out.println("");
//            }
//
//            cnt++;
//        }
//    }
//
//    public int[] getMembersArrA() {
//        return MembersArrA;
//    }
//
//    public int[] getMembersArrB() {
//        return MembersArrB;
//    }
//
//
}