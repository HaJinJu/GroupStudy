import java.util.ArrayList;
import java.util.Iterator;

// 랜덤으로 팀 정하기

class CreateTeam1 {
    int ApersonNum;
    int BpersonNum;
    int teamNum;

    ArrayList<String> AteamArrayList;
    ArrayList<String> BteamArrayList;

    String[] AteamArr;
    String[] BteamArr;

    public CreateTeam1(String[] arrA, String[] arrB, final int TEAMNUMBER) {
        AteamArr = arrA;
        BteamArr = arrB;

        ApersonNum = arrA.length;
        BpersonNum = arrB.length;

        teamNum = TEAMNUMBER;

        AteamArrayList = new ArrayList<String>();
        BteamArrayList = new ArrayList<String>();
    }

    public ArrayList<String> getAteamArrayList() {
        return this.AteamArrayList;
    }

    public ArrayList<String> getBteamArrayList() {
        return this.BteamArrayList;
    }

    // 중복되는 코드를 메소드로 만듦
    // 랜덤으로 출력하기 위함
    public void allocArrayList(ArrayList<String> al, String[] arr, int loopNum) {
        boolean isDup = false;

        for (int i = 0; i < loopNum; i++) {
            do {
                int randomNum = (int) (Math.random() * loopNum);

                // A팀 배열리스트에 A팀 배열의 randomNum이 포함되어 있다면
                if (al.contains(arr[randomNum])) {
                    // 중복
                    isDup = true;
                    continue;
                } else {
                    isDup = false;
                }
                // A팀 배열리스트에 A팀 배열의 randomNum 추가
                al.add(arr[randomNum]);
            } while (isDup);
        }
    }

    public void allocRandomTeam() {
        allocArrayList(AteamArrayList, AteamArr, ApersonNum);
        allocArrayList(BteamArrayList, BteamArr, BpersonNum);
    }

    public void printArrList(ArrayList<String> al) {
        // 4랑 5 둘 다 나오게 됨
        int cnt = 1;
        String name;
        // 초기화 해주기
        int randValue = 0;
        int quot = al.size() / teamNum;
        int remain = al.size() % teamNum;
        // 배열 사이즈를 인원수로 나눠서 나머지가 있다면 true, 아니라면 false
        boolean needException = (remain > 0) ? true : false;
        Iterator<String> personName = al.iterator();

        while (personName.hasNext()) {
            name = (String) personName.next();
            // %s 문자열 출력
            System.out.printf("%s", name);

            // 예외 상황을 만들어줘야함
            if (needException) {
                // 5,4 가 될지 4,5가 될지 정해주기 위함
                randValue = (int) (Math.random() * 2);
                // 초기화
                needException = false;
            }

            System.out.printf("cnt = %d, quot + randValue = %d\n", cnt, quot + randValue);
            // quot + randValue 4 or 5
            if (cnt % ((quot) + randValue) == 0) {
                if (cnt == 4) {
                    randValue = 1;
                } else {
                    randValue = 0;
                }
                cnt = 0;
            }
            cnt++;
        }
        System.out.println("");
    }
}

public class Review {
    public static void main(String[] args) {

        final int TEAMNUMBER = 2;
        String[] nameA = { "고동영", "장해솔", "류슬기", "박재민", "한다은", "최현정", "오진욱", "조진형", "이정현" };
        String[] nameB = { "이범진", "박소현", "탁성진", "노찬욱", "박기범", "하진주", "이승윤", "최임식" };
        CreateTeam1 createTeam = new CreateTeam1(nameA, nameB, TEAMNUMBER);
        createTeam.allocRandomTeam();
        createTeam.printArrList(createTeam.getAteamArrayList());
        createTeam.printArrList(createTeam.getBteamArrayList());
    }
}
