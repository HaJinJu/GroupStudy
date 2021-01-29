package Project0113;

class Transportation {
    private String car;
    private String airplane;


    public String getAirplane() {
        return airplane;
    }

    public String getCar() {
        return car;
    }

    public Transportation(String Car, String Airplane) {
        this.car = Car;
        this.airplane = Airplane;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "Car=" + car + ", Airplane=" + airplane + '}';
    }
}

class Bird extends Transportation {
    private String bird;

    public Bird(String Car, String Airplane, String Bird) {
        super(Car, Airplane);
        this.bird = Bird;
    }

    @Override
    public String toString() {
        return "Ex2{" +
                "Car='" + super.getCar() + "" + "' Airplane=" + super.getAirplane() +
                " Bird='" + bird + '\'' + '}';
    }
}

public class Homework2 {
    public static void main(String[] args) {

        Bird b = new Bird("차는 탈 수 있습니다.", "비행기도 탈 수 있습니다.", "새는 못타요~");
        System.out.println(b);
    }
}


