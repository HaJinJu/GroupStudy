package Class20210113;

class Vehicle{
    private String  Car ;
    private String Airplane ;


    public String getAirplane() {
        return Airplane;
    }

    public String getCar() {
        return Car;
    }

    public Vehicle(String  Car, String  Airplane){
        this.Car = Car;
        this.Airplane = Airplane;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "Car=" + Car +", Airplane=" + Airplane +'}';
    }
}
class Ex2 extends Vehicle{
    private String Bird;

    public Ex2(String Car, String Airplane , String Bird) {
        super(Car, Airplane);
        this.Bird = Bird;
    }

    @Override
    public String toString() {
        return "Ex2{" +
                "Car='"+ super.getCar() + "' Airplane="+ super.getAirplane() + " Bird='"+ Bird + '\'' +
                '}';
    }
}

public class Inheritancehomework2 {
    /*동물은 사람인가 ? 사람은 동물인가 ?
      사람은 동물입니다.
      이를 표현하는 클래스를 작성해보세요.*/
    public static void main(String[] args) {
        PersonAndAnimal pe = new PersonAndAnimal("사람입니다", "동물입니다");

        System.out.println(pe);

        Ex2 e = new Ex2("탈것입니다", "탈것입니다.", "못탑니다.");
        System.out.println(e);

    }
}
