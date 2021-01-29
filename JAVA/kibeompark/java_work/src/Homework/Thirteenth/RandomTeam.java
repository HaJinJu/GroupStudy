package Homework.Thirteenth;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RandomTeam {
    private ArrayList<String> name;
    private ArrayList<Integer> randomNumber;
    private Set<String> s1, s2;
    private int count;

    public RandomTeam(ArrayList<String> name, int count) {
        s1 = new HashSet<String>();
        s2 = new HashSet<String>();
        randomNumber = new ArrayList<Integer>();

        this.name = name;
        this.count = count;
    }

    public void setTeam() {
        int randNum;
        int cnt = 1;

        while (true) {
            randNum = (int) (Math.random() * count);

            if (randomNumber.contains(randNum)) {
                continue;
            } else {
                randomNumber.add(randNum);

                if (cnt <= 4) {
                    s2.add(name.get(randNum));
                } else {
                    s1.add(name.get(randNum));
                }
                cnt++;
            }

            if ((s1.size() + s2.size()) == count) {
                break;
            }
        }
    }

    public void removeName() {
        // A조 두 팀의 인원 통합 (합집합)
        ArrayList<String> union = new ArrayList<>(s1);
        union.addAll(s2);

        // 전체 수강인원에서 A조 인원 제거 (차집합)
        name.removeAll(union);

//        for (int i = 0; i < count; i++) {
//            name.remove(0);
//        }
    }

    public void printTeam() {
        // 총원 출력 (기존 for 문 형식 이용)
        System.out.printf("총원 %d명 : ", count);
        for (int i = 0; i < count; i++) {
            System.out.printf("%s ", name.get(i));
        }
        System.out.println();

        // 1팀 출력 (Iterator 이용)
        String str1;
        Iterator e1 = s1.iterator();

        System.out.print("1팀 : ");
        while (e1.hasNext()) {
            str1 = (String) e1.next();
            System.out.printf("%s ", str1);
        }
        System.out.println();

        // 2팀 출력 (새로운 for 문 형식 이용)
        System.out.print("2팀 : ");
        for (String str2 : s2) {
            System.out.printf("%s ", str2);
        }
        System.out.println();
    }
}
