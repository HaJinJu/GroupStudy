// 이전에 작성했던 예제중 스터디 팀을 만들기 위해
// 랜덤으로 사람 이름과 번호를 부여했던 프로그램이 있다.
// 당시에는 구현에 필요한 내용을 아직 배우지 않아 꼼수로 구현했다.
// 이번에는 배운 내용들을 활용하여 이 프로그램의 완성도를 높여보도록 한다.
// set hashset을 메소드로 만든다고 생각하기

/* HashSet 예제
HashSet<String> hs = new HashSet<>();

String[] sample = { "안녕", "하하", "호호", "크크", "키키", "켈켈" };

for (String s : sample) {
    if (!hs.add(s)) {
        System.out.println("중복");
    }
    System.out.println(hs.size() + "출력:" + hs);
}
*/
import java.util.ArrayList;
import java.util.HashSet;

class RandomTeam {
    int numOfPerson;
    int numOfTeam;

    public RandomTeam(int numOfPerson, int numOfTeam) {
        this.numOfPerson = numOfPerson;
        this.numOfTeam = numOfTeam;
    }

    public void allocRandNum() {
        HashSet<Integer> hs = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        int cnt = 1;

        while (hs.size() < numOfPerson) {
            int basicSize = hs.size();
            int randNum = (int) (Math.random() * numOfPerson);
            hs.add(randNum);
            if (basicSize < hs.size()) {
                list.add(randNum);
            }
        }

        for (int random : list) {
            System.out.printf("%3d", random);

            if (cnt % 4 == 0) {
                System.out.println("");
            }
            cnt++;
        }
    }
}

public class Hw {
    public static void main(String[] args) {
        RandomTeam randomTeam = new RandomTeam(16, 4);
        randomTeam.allocRandNum();
    }
}