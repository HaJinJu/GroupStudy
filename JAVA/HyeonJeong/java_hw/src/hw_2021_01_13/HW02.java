package hw_2021_01_13;

class Vehicle {
    private String name;
    private String horn;

    public Vehicle(String name, String horn){
        this.name = name;
        this.horn = horn;
    }

    public void horn() {

        System.out.println(name+"가 " + horn + " 하고 지나갔다\n");
    }

    public void fly() {

        System.out.print(name+"가" + " 하늘을 날았다");
    }

    public void speed_up() {

        System.out.print(name+"가" + " 속도를 올렸다");
    }
}

class Car extends Vehicle {
    String car_speed_up = "빠르게";

    public Car(String name, String horn) {

        super(name, horn);
    }

    @Override
    public void speed_up() {
        super.speed_up();

        System.out.println(", " + car_speed_up);
    }
}

class Plane extends Vehicle {
    String plane_fly = "높게";

    public Plane(String name, String horn){

        super(name, horn);
    }

    @Override
    public void fly() {
        super.fly();

        System.out.println(", " + plane_fly);
    }
}

public class HW02 {
    public static void main(String[] args) {
        Car c = new Car("자동차", "빵빵!");
        c.horn();
        c.speed_up();
        System.out.println("");

        Plane p = new Plane("비행기","슈우우웅~");
        p.horn();
        p.fly();
    }
}
