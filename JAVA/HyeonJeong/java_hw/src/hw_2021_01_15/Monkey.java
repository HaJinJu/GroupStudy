package hw_2021_01_15;

public class Monkey extends Mammal implements Behavior{
    private String hip;

    public Monkey(int age, String food, String crying, int legs, String hip) {
        super(age, food, crying, legs);
        this.hip = hip;
    }

    public String getHip() {
        return hip;
    }

    @Override
    public void eat() {
        System.out.printf("원숭이는 %s를 먹는다.\n",food);

    }

    @Override
    public void walk() {
        System.out.printf("원숭이는 유연한 %d개의 다리로 나무를 올랐다.\n",legs);
    }

    @Override
    public void speak() {
        System.out.printf("원숭이가 %s하며 운다.\n", speak);

    }

    public void hip() {
        System.out.printf("원숭이는 엉덩이는 빨간색이다.\n",hip);
    }
}
