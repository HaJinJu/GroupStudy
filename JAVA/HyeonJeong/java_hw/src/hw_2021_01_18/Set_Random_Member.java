package hw_2021_01_18;

import java.util.ArrayList;

public class Set_Random_Member {
    private ArrayList<String> jo_A_arraylist;
    private ArrayList<String> jo_B_arraylist;

    private String[] jo_A_array;
    private String[] jo_B_array;

    private int jo_A_person_number;
    private int jo_B_person_number;

    private int number_of_teams;

    public Set_Random_Member(String[] jo_A, String[] jo_B, final int NUMBER_OF_TEAMS) {
        jo_A_array = jo_A;
        jo_A_person_number = jo_A.length;
        jo_A_arraylist = new ArrayList<String>();

        jo_B_array = jo_B;
        jo_B_person_number = jo_B.length;
        jo_B_arraylist = new ArrayList<String>();

        number_of_teams = NUMBER_OF_TEAMS;
    }

    public void set_Random_jo() {
        set_arraylist(jo_A_arraylist, jo_A_array, jo_A_person_number);
        set_arraylist(jo_B_arraylist, jo_B_array, jo_B_person_number);
    }

    public void set_arraylist(
            ArrayList<String> jo_arraylist,
            String[] jo_array, int repeat_number) {

        boolean is_repeat_number;

        for (int i = 0; i < repeat_number; i++) {
            is_repeat_number = true;

            while (is_repeat_number) {
                int random_number = (int) (Math.random() * repeat_number);

                if (jo_arraylist.contains(jo_array[random_number])) {
                    continue;
                } else {
                    is_repeat_number = false;
                }
                jo_arraylist.add(jo_array[random_number]);
            }
        }
    }

    public void print_arraylist(ArrayList<String> jo_arraylist) {
        String[] name_of_jo =
                jo_arraylist.toArray(new String[jo_arraylist.size()]);
        // 최적화를 위해 ArrayList를 Array로 변환

        int people_of_jo = name_of_jo.length;

        int number_of_members = // 한 팀에 들어가는 멤버의 수
                (people_of_jo / number_of_teams);

        if (number_of_members == 0) {
            System.out.printf("ㅍㅅㅍ? %d 팀? %d 명으로?\n", number_of_teams, people_of_jo);
            // 팀을 나눌 수 없을 경우 출력 되는 메세지
           return;
        }

        int team_No = 0;
        int id = 0;

        while (true) {
            if (id > people_of_jo - 1) {
            // id는 인덱스임으로 0부터 시작
            // people_of_jo는 1부터 시작하기 때문에 -1
                break;
            }

            team_No = id / number_of_members;

            if (team_No > number_of_teams - 1) {
            // 위와 같은 이유이다.
                break;
            }

            System.out.printf("[%s]", name_of_jo[id]);

            if (id % number_of_members == number_of_members - 1) {
            // 출력결과를 편하게 보기 위한 코드
                System.out.println("");
                System.out.println("");
            }
            id++;
        }

        System.out.println("<< 남은사람들 >>\n");

        team_No = 0;
        int remained = people_of_jo - id;
        // 전체 사람 수에서 팀을 결성한 사람을 뺀 남은 사람
        while (remained-- > 0) {
            System.out.printf("[%s] %d팀 \n",name_of_jo[id], team_No+1);
            // 남은 사람들을 팀에 한명씩 넣어준다.
            id++;
            team_No++;
        }
        System.out.println("--------------------------\n");
    }

    public ArrayList<String> getJo_A_arraylist() {
        return jo_A_arraylist;
    }

    public ArrayList<String> getJo_B_arraylist() {
        return jo_B_arraylist;
    }
}






