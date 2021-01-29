package hw_2021_01_15;

public class Tiger extends Mammal implements Behavior{
    private String color;

    public Tiger(int age, String food, String crying, int legs, String color) {
        super(age, food, crying, legs);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void eat() {
        System.out.printf("호랑이는 %s를 먹는다.\n",food);
    }

    @Override
    public void walk() {
        System.out.printf("호랑이는 %s를 뽐내며 걷는다.\n",color);
    }

    @Override
    public void speak() {
        System.out.printf("호랑이는 %s하고 운다.\n", speak);
    }
}