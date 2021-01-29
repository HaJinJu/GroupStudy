package Test;

class ElectronicProduct {
    private String manufacturer;
    private String product;
    private String color;

    public ElectronicProduct(String manufacturer, String product, String color) {
        this.manufacturer = manufacturer;
        this.product = product;
        this.color = color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getProduct() {
        return product;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "ElectronicProduct{" +
                "manufacturer='" + manufacturer + '\'' +
                ", product='" + product + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

class CellPhone extends ElectronicProduct{
    private String model;
    private int numOfCamera;

    public CellPhone(
            String manufacturer, String product, String color,
            String model, int numOfCamera) {
        super(manufacturer, product, color);
        this.model = model;
        this.numOfCamera = numOfCamera;
    }

    @Override
    public String toString() {
        return "CellPhone{" +
                "manufacturer='" + super.getManufacturer() + '\'' +
                ", product='" + super.getProduct() + '\'' +
                ", color='" + super.getColor() + '\'' +
                ", model='" + model + '\'' +
                ", numOfCamera=" + numOfCamera +
                '}';
    }
}

public class Test6 {
    public static void main(String[] args) {
        // 휴대폰은 전자제품임을 표현하는 코드를 작성해 보자 !
        ElectronicProduct ep = new ElectronicProduct
                ("애플", "맥북 프로", "스페이스 그레이");
        CellPhone cp = new CellPhone
                ("삼성", "스마트폰", "팬텀 실버",
                        "갤럭시 S21 울트라", 4);

        System.out.println(ep);
        System.out.println(cp);
    }
}
