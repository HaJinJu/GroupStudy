// 자동차는 탈 것입니다.  
// 비행기는 탈 것입니다.  
// 이를 반영한 클래스를 작성해봅시다.  

class Vehicle {
    private String type;

    public Vehicle(String type) {
        this.type = type;
    }

    public String getType() {
		return this.type;
	}

}

class Car extends Vehicle{

    String model;

    public Car(String type, String model) {
        super(type);
        this.model = model;
    }

    @Override
    public String toString() {
        return "{" +
            " 탈것 type ='" + super.getType() + "'" +
            " model='" + model + "'" +
            "}";
    }
    
}

class Airplane extends Vehicle{

    int speed;

    public Airplane(String type, int speed) {
        super(type);
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "{" +
            " 탈것 type ='" + super.getType() + "'" +
            " speed='" + speed + "km'" +
            "}";
    }
}

public class Q2{
    public static void main(String[] args) {
        
        Car car = new Car("자동차", "bmw 520d");
        System.out.println(car);

        Airplane airplane = new Airplane("비행기", 700);
        System.out.println(airplane);
    }
}
