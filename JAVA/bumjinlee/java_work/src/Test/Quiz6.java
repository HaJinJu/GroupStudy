package Test;

// 휴대폰은 전자제품임을 표현하는 코드 작성

class Electronics {
    private String companyName;
    private String product;

    public Electronics(String companyName, String product) {
        this.companyName = companyName;
        this.product = product;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return "Electronics\n" +
                "{" + "companyName='" + companyName + '\'' +
                ", product='" + product + '\'' +
                '}';
    }
}

class cellPhone extends Electronics {
    private String phoneFunction;
    private String rechargeable;

    public cellPhone(String companyName, String product, String phoneFunction, String rechargeable) {
        super(companyName, product);
        this.phoneFunction = phoneFunction;
        this.rechargeable = rechargeable;
    }

    @Override
    public String toString() {
        return "cellPhone\n" +
                "{" + "companyName = " + super.getCompanyName()
                + ", product = " + super.getProduct()
                + ", phoneFunction = " + phoneFunction
                + ", rechargeable = " + rechargeable +
                '}';
    }

}

public class Quiz6 {
    // 문제 6. 휴대폰은 전자제품임을 표현하는 코드를 작성
    public static void main(String[] args) {

        cellPhone cp = new cellPhone("apple", "iphone SE2", "가능", "충전식");
        System.out.println(cp);
    }
}