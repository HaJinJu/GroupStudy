package hw_2021_01_15;

public class Mammal extends Animal{
    protected int legs;

    public Mammal(int age, String food, String crying, int legs) {
        super(age, food, crying);
        this.legs = legs;
    }
}
