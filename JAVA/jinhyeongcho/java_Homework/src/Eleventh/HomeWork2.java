package Eleventh;

class Vehicle{
    private String vehicle;  //탈것 지정

    public Vehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getVehicle() {
        return vehicle;
    }

    @Override
    public String toString() {
        return "Vehicle{'" +vehicle+
                "'은(는) 탈것입니다." + '\'' +
                '}';
    }
}

class Transportation extends Vehicle {
    String transportation;

    public Transportation(String vehicle, String transportation) {
        super(vehicle);
        this.transportation = transportation;
    }

    @Override
    public String toString() {
        return "Transportation{'" + super.getVehicle()+
                "' 및 '" + transportation + "'는 탈것입니다."+
                '}';
    }
}

public class HomeWork2 {
    public static void main(String[] args) {
        Transportation t = new Transportation("bus","taxi");
        System.out.println(t);
    }
}
