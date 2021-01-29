class Vehicle {
    private String type;
    private int speed;

    public Vehicle(String type, int speed) {
        this.type = type;
        this.speed = speed;
    }

    public String getType() {
        return type;
    }

    public int getSpeed() {
        return speed;
    }
}

class Car extends Vehicle {
    private String color;

    public Car(String type, int speed, String color) {
        super(type, speed);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + super.getType() + '\'' +
                ", speed=" + super.getSpeed() + "km/h" +
                ", color='" + color + '\'' +
                '}';
    }
}

class Airplane extends Vehicle {
    private int capacity;

    public Airplane(String type, int speed, int capacity) {
        super(type, speed);
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "type='" + super.getType() + '\'' +
                ", speed=" + super.getSpeed() + "km/h" +
                ", capacity=" + capacity + "명" +
                '}';
    }
}

public class EleventhTask2 {
    public static void main(String[] args) {
        Car car = new Car("K5", 75, "Black");
        System.out.println(car);

        Airplane plane = new Airplane("B787", 850, 420);
        System.out.println(plane);
    }
}