package hw_2021_01_15;

public class Bird extends Animal{
    protected int wings;

    public Bird(int age, String food, String crying, int wings) {
        super(age, food, crying);
        this.wings = wings;
    }
}