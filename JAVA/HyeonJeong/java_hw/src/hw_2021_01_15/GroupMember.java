package hw_2021_01_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class GroupMember {
    private String[] names = {"최현정", "장해솔", "박재민", "고동영",
                              "이정현", "류슬기", "조진형", "한다은",
                              "오진욱", "노찬욱", "박소현", "박기범",
                              "최임식", "탁성진", "하진주", "이승윤", "이범진"};

    private ArrayList<String> groupMember;
    private ArrayList<String> studentName;
    private int numOfStudents;

    public GroupMember(int numOfStudents) { // 생성자 (학생수 입력)
        this.numOfStudents = numOfStudents;
        groupMember = new ArrayList<String>();
        studentName = new ArrayList<String>(Arrays.asList(names));
        // studentName.addAll(Arrays.asList(studentsName));
        // studentName 초기화하고 String[] names 대입
    }

    public void setGroupMember() {
        int randomNum;
        int count = 1;
        Iterator<String> iter_students = studentName.iterator();
        // studentName의 반복자를 사용하기 위한 초기화
        for (int i = 0; i < numOfStudents; i++) {
            // numOfStudents = 17;
            while(iter_students.hasNext()) {
                //studentName에 존재하는 값을 String타입으로 저장
                randomNum = (int) (Math.random() * numOfStudents);
                // 0 ~ 16 까지의 랜덤
                groupMember.add(i, studentName.get(randomNum));
                // groupMember[0] = studentName[랜덤번호]

                System.out.print(" [ " + studentName.get(randomNum) + " ] ");
                if (count % 4 == 0) {
                    System.out.println("");
                }
                count++;

                if(count == 17) {
                    break;
                }
                break;
            }

        }

    }

    public String[] getNames() {
        return names;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public ArrayList<String> getGroupMember() {
        return groupMember;
    }

    public ArrayList<String> getStudentName() {
        return studentName;
    }
}
