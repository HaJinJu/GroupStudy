package Eleventh;
//3) 자동차는 탈 것입니다.
//   비행기는 탈 것입니다.
//   이를 반영한 클래스를 작성해봅시다.
class Vehicle {
    private String Engine;
    private String Fuel;

    public Vehicle (String Engine, String Fuel) {
        this.Engine = Engine;
        this.Fuel = Fuel;
    }

    public String getEngine() {
        return Engine;
    }

    public String getFuel() {
        return Fuel;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "Engine=" + Engine +
                ", Fuel='" + Fuel + '\'' +
                '}';
    }
}


class Plane extends Vehicle {
    private int Wing;

    public Plane(String Engine, String Fuel, int Wing){
        super(Engine, Fuel);
        this.Wing = Wing;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "Wing='" + Wing + '\'' +
                "} " + super.toString();
    }
}

class Car extends Vehicle{
    private String Trunk;
    public Car(String Engine, String Fuel, String Trunk){
        super(Engine, Fuel);
        this.Trunk = Trunk;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Trunk='" + Trunk + '\'' +
                "} " + super.toString();
    }
}
public class Homework3 {
    public static void main(String[] args) {
        Plane p = new Plane("TurboEngine","JetFuel", 2 );
        System.out.println(p);

        Car c = new Car ("GasolineEngine", "Gasoline", "Exist");
        System.out.println(c);
    }
}
