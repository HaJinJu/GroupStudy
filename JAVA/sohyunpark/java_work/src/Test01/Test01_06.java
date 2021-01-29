package Test01;

class Electronics {
    private String name;
    private String type;

    public Electronics(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "name = '" + name + '\'' +
                ", type = '" + type + '\'' +
                '}';
    }
}

class CellPhone extends Electronics {
    private String companyName;

    public CellPhone(String name, String type, String companyName) {
        super(name, type);
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "CellPhone{" + "name = '" + super.getName() + "', type = '" +
                super.getType() + "', companyName = '" + companyName + '\'' +
                '}';
    }
}

public class Test01_06 {
    public static void main(String[] args) {
        // 휴대폰은 전자제품임을 표현하는 코드를 작성해보자
        Electronics e = new Electronics("냉장고", "가전제품");
        System.out.println(e);

        CellPhone c = new CellPhone("아이폰", "핸드폰", "애플");
        System.out.println(c);
    }
}
