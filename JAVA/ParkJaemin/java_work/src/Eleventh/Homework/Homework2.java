package Eleventh.Homework;

class Vehicle{
    private String Question;


    public Vehicle(String Question) {
        this.Question = Question;

    }

    @Override
    public String toString() {
        return "Vehicle {" +
                "Question = '" + Question + '\'' +
                '}';
    }

    public String getQuestion() {
        return Question;
    }

    static class CarAirplane extends Vehicle{

        private String 특징;
        private String 속도;
        private String 기름값;

        public CarAirplane(String Answer, String 속도, String 기름값, String 특징) {
            super(Answer);
            this.특징 = 특징;
            this.속도 = 속도;
            this.기름값 = 기름값;
        }

        @Override
        public String toString() {
            return "CarAirplane {" + "Answer = '" + super.getQuestion()+
                    ", 특징 = '" + 특징 + '\'' +
                    ", 속도 = '" + 속도 +
                    ", 기름값 = '" + 기름값 + '\'' +
                    '}';
        }
    }

}





public class Homework2 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("자동차랑 비행기는 탈 것인가?");

        System.out.println(v);

        Vehicle.CarAirplane c = new Vehicle.CarAirplane
                ("자동차랑 비행기는 탈 것이다.'",
                        "자동차 : 100Km/h / 비행기 : 300km/h",
                        "자동차 = 3만원 / 비행기 = 30만원",
                        "비행기랑 자동차는 사람이 타고 운전한다."  );

        System.out.println(c);
    }
}
