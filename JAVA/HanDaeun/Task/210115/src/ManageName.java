// 그룹 멤버들의 이름을 저장하고 원하는 이름을 알려줌
public class ManageName {
    private final String ONE = "최현정";
    private final String TWO = "장해솔";
    private final String THREE = "박재민";
    private final String FOUR = "고동영";
    private final String FIVE = "이정현";
    private final String SIX = "류슬기";
    private final String SEVEN = "조진형";
    private final String EIGHT = "한다은";
    private final String NINE = "오진욱";

    private final String TEN = "노찬욱";
    private final String ELEVEN = "박소현";
    private final String TWELVE = "박기범";
    private final String THIRTEEN = "최임식";
    private final String FOURTEEN = "탁성진";
    private final String FIFTEEN = "하진주";
    private final String SIXTEEN = "이승윤";
    private final String SEVENTEEN = "이범진";
    private String name;

    public void setName(int nameNum) {
        switch (nameNum) {
            case 1:
                name = ONE;
                break;
            case 2:
                name = TWO;
                break;
            case 3:
                name = THREE;
                break;
            case 4:
                name = FOUR;
                break;
            case 5:
                name = FIVE;
                break;
            case 6:
                name = SIX;
                break;
            case 7:
                name = SEVEN;
                break;
            case 8:
                name = EIGHT;
                break;
            case 9:
                name = NINE;
                break;
            case 10:
                name = TEN;
                break;
            case 11:
                name = ELEVEN;
                break;
            case 12:
                name = TWELVE;
                break;
            case 13:
                name = THIRTEEN;
                break;
            case 14:
                name = FOURTEEN;
                break;
            case 15:
                name = FIFTEEN;
                break;
            case 16:
                name = SIXTEEN;
                break;
            case 17:
                name = SEVENTEEN;
                break;
        }
    }

    public String getName() {
        return name;
    }
}