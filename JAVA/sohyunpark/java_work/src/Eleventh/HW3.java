package Eleventh;

class Vehicle {
    private String species;
    private int personnumber;

    public Vehicle(String species, int personnumber) {
        this.species = species;
        this.personnumber = personnumber;
    }

    public String getSpecies() {
        return species;
    }

    public int getPersonnumber() {
        return personnumber;
    }

    @Override
    public String toString() {
        return "Vehicle {" +
                "species = '" + species + '\'' +
                ", personnumber = " + personnumber +
                '}';
    }
}

class Car extends Vehicle {
    private int carnum;
    private String carname;

    public Car(String species, int personnumber, int carnum, String carname) {
        super(species, personnumber);
        this.carnum = carnum;
        this.carname = carname;
    }

    @Override
    public String toString() {
        return "Car {" + "species = " + super.getSpecies() + ", personnumber = "
                + super.getPersonnumber() +  ", carnum = " + carnum +
                ", carname = '" + carname + '\'' +
                '}';
    }
}

class Plane extends Vehicle {
    private String airlinename;

    public Plane(String species, int personnumber, String airlinename) {
        super(species, personnumber);
        this.airlinename = airlinename;
    }

    @Override
    public String toString() {
        return "Plane {" + "species = " + super.getSpecies() + ", personnumber = "
                + super.getPersonnumber() + ", airlinename = '" + airlinename
                + '\'' + '}';
    }
}

public class HW3 {
    public static void main(String[] args) {
        // 자동차는 탈 것입니다.
        // 비행기는 탈 것입니다.
        // 이를 반영한 클래스를 작성해봅시다.
        Vehicle v = new Vehicle("BMW", 5);
        System.out.println(v);

        Car c = new Car("Car", 5, 5533, "Benz");
        System.out.println(c);

        Plane p = new Plane("plane", 200, "KOREANAIR");
        System.out.println(p);

    }
}
