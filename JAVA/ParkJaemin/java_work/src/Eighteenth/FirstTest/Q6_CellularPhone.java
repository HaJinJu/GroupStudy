package Eighteenth.FirstTest;

class electronic {
    private String Brand;
    private String type;

    public electronic(String brand, String type) {
        this.Brand = brand;
        this.type = type;
    }

    public String getBrand() {
        return Brand;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "electronic{" +
                "Brand='" + Brand + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

class MobilePhone extends electronic {
    private String name;
    private String cpu;
    private String ram;
    private int weight;

    public MobilePhone(String type, String brand, String name, String cpu, String ram, int weight) {
        super(brand, type);
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "MobilePhone{" + "brand= '" + super.getBrand() +
                "name='" + name + '\'' +
                ", cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", weight=" + weight +
                '}';
    }
}

public class Q6_CellularPhone {
    public static void main(String[] args) {
        electronic E = new electronic("삼성, LG", "핸드폰, 청소기, TV, 냉장고, 세탁기");

        System.out.println(E);

        MobilePhone M = new MobilePhone
                ("핸드폰", "삼성", "갤럭시노트", "Hexa-core", "16GB", 150);

        System.out.println(M);
    }
}
