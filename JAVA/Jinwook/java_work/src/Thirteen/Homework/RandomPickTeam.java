package Thirteen.Homework;
//add(" ")는 ArrayList에 값을 추가
//
//add(index, " ") 를 할 경우, ArrayList 인덱스 위치에 새로운 값을 넣고 원래 있던 값은 뒤로 밀려남
//
//get(index)    ArrayList 의 인덱스를 통해 값을 확인하는 것
//
//size()    ArrayList의 길이를 확인
//
//
//set(index , " " )    add랑 다르게 해당 위치 값을 지정된 값으로 바꾸어버림
//
//remove(index)      해당 인덱스에 있는 값을 지움과 동시에 공간 자체를 삭제. 사이즈가 줄어든다
//
//clear()               모든 값을 삭제함과 동시에  사이즈를 0으로 만들어버린다.

import Thirteen.InteratorTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RandomPickTeam {
    private int numOfPerson;
    private int numOfteam;
    private ArrayList<String> personArrayListA;
    private ArrayList<String> personArrayListB;
    private int [] teams;


    public RandomPickTeam(int numOfteam, int numOfPerson) {
        this.numOfPerson = numOfPerson;
        personArrayListA = new ArrayList<String>();
        personArrayListB = new ArrayList<String>();
        Set<String> s1 = new HashSet<String>();


        String[] name = {
                "최현정", "장해솔", "박재민", "고동영", "이정현", "류슬기",
                "조진형", "한다은", "오진욱",
        };
        String[] name2 = {
                "노찬욱", "박소현", "박기범",
                "최임식", "탁성진", "하진주", "이승윤", "이범진"
        };

        for (int i = 0; i < name.length; i++) {
            personArrayListA.add(name[i]);
        }

        for (int i = 0; i < name2.length; i++) {
            personArrayListB.add(name2[i]);
        }
    }


    public void ArraylistRandTestA() {
        int randNum;
        int cnt = 1;
        ArrayList<String> rand = new ArrayList<String>();
        System.out.println("A조");
        while (personArrayListA.size() != 0) {
//            System.out.println(personArrayListA.size());
            randNum = (int) (Math.random() * personArrayListA.size());
            rand.add(personArrayListA.get(randNum));
            personArrayListA.remove(randNum);
        }
        for (String s : rand) {
            System.out.println(s);

        }

    }

    public void ArraylistRandTestB() {
        int randNum;
        ArrayList<String> rand1 = new ArrayList<>();
        System.out.println("\nB조");
        while (personArrayListB.size() != 0) {
//            System.out.println(personArrayListB.size());
            randNum = (int) (Math.random() * personArrayListB.size());
            rand1.add(personArrayListB.get(randNum));
            personArrayListB.remove(randNum);

        }
        for (String s : rand1) {

            System.out.println(s);

        }


    }

}




