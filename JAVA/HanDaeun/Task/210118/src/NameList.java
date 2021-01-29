import java.util.ArrayList;

// 각 팀으로 배정할 사람들의 이름을 저장하고 원하는 이름을 리턴해줌
public class NameList {
    // A 그룹
    private final String ONE = "최현정";
    private final String TWO = "장해솔";
    private final String THREE = "박재민";
    private final String FOUR = "고동영";
    private final String FIVE = "이정현";
    private final String SIX = "류슬기";
    private final String SEVEN = "조진형";
    private final String EIGHT = "한다은";
    private final String NINE = "오진욱";
    // B 그룹
    private final String TEN = "노찬욱";
    private final String ELEVEN = "박소현";
    private final String TWELVE = "박기범";
    private final String THIRTEEN = "최임식";
    private final String FOURTEEN = "탁성진";
    private final String FIFTEEN = "하진주";
    private final String SIXTEEN = "이승윤";
    private final String SEVENTEEN = "이범진";

    ArrayList<String> name;


    // 사람들의 이름을 ArrayList 에 저장해둠
    public void setName() {
        name = new ArrayList<>();

        name.add(ONE);
        name.add(TWO);
        name.add(THREE);
        name.add(FOUR);
        name.add(FIVE);
        name.add(SIX);
        name.add(SEVEN);
        name.add(EIGHT);
        name.add(NINE);

        name.add(TEN);
        name.add(ELEVEN);
        name.add(TWELVE);
        name.add(THIRTEEN);
        name.add(FOURTEEN);
        name.add(FIFTEEN);
        name.add(SIXTEEN);
        name.add(SEVENTEEN);
    }

    // 원하는 이름의 번호를 넘겨받으면 해당 이름을 리턴함
    public String getName(int nameNum) {
        return name.get(nameNum - 1);
    }
}