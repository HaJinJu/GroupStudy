package Eleventh;

class MyCar extends Vehicle {
    private String name;
    private int age;

    public MyCar(int speed, boolean drive, String name, int age) {
        super(speed, drive);
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "MyCar = {" +
                "'name=' " + name +
                "'age'= " + age +
                "'speed'= " + getSpeed() +
                "'drive'= " + isDrive() +
                "}";
    }

    public int getAge() {
        return age;
    }
}

class Airplane extends Vehicle{
    private boolean fly;

    public Airplane(int speed, boolean drive, boolean fly) {
        super(speed, drive);
        this.fly = fly;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "'speed'=" + getSpeed() +
                "'drive'=" + isDrive() +
                "'fly'=" + fly +
                '}';
    }
}

class Vehicle {
    private int speed;
    private boolean drive;

    public int getSpeed() {
        return speed;
    }

    public boolean isDrive() {
        return drive;
    }

    public Vehicle(int speed, boolean drive) {
        this.speed = speed;
        this.drive = drive;
    }


}

public class Homework2 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle(0, true);

        System.out.println(v.getSpeed());

        MyCar mc = new MyCar(50, true, "붕붕이", 3);

        System.out.println(mc);

        Airplane a = new Airplane(1000, true, true);

        System.out.println(a);
    }
}
