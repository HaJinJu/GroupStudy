package Homework.Eleventh;

class Vehicle {
    private String type;
    private String Company;
    private String model;
    private String color;

    public Vehicle(String type, String company, String model, String color) {
        this.type = type;
        Company = company;
        this.model = model;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public String getCompany() {
        return Company;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "type='" + type + '\'' +
                ", Company='" + Company + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

class Car extends Vehicle {
    private String gearShift;
    private String displacement;

    public Car(String type, String company, String model, String color,
               String gearShift, String displacement) {
        super(type, company, model, color);
        this.gearShift = gearShift;
        this.displacement = displacement;
    }

    @Override
    public String toString() {
        return "Car{" + "type='" + super.getType() +
                "', Company='" + super.getCompany() +
                "', model='" + super.getModel() +
                "', color='" + super.getColor() +
                "', gearShift='" + gearShift +
                "', displacement='" + displacement + '\'' +
                '}';
    }
}

class Airplane extends Vehicle {
    private String capacity;

    public Airplane(String type, String company, String model, String color, String capacity) {
        super(type, company, model, color);
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Airplane{" + "type='" + super.getType() +
                "', Company='" + super.getCompany() +
                "', model='" + super.getModel() +
                "', color='" + super.getColor() +
                "', capacity='" + capacity + '\'' +
                '}';
    }
}

public class Homework2 {
    public static void main(String[] args) {
        // 자동차는 탈 것입니다.
        // 비행기는 탈 것입니다.
        // 이를 반영한 클래스를 작성해 봅시다.

        Vehicle v = new Vehicle("자전거", "삼천리자전거", "전기 자전거", "검정색");
        System.out.println(v);

        Car c = new Car("대형 세단", "벤츠", "S500", "검정색", "칼럼 시프트", "2996cc");
        System.out.println(c);

        Airplane a = new Airplane("상용 비행기", "에어버스", "A380", "흰색", "550명");
        System.out.println(a);
    }
}
