package hw_2021_01_15;

public class Animal {
    protected int age;
    protected String food, speak;

    public Animal(int age, String food, String speak){
        this.age = age;
        this.food = food;
        this.speak = speak;
    }

    public static void main(String[] args) {
        Parrot pa = new Parrot(
                2, "모이", "짹짹", 2, "무지개색");

        pa.eat();
        pa.speak();
        pa.walk();
        pa.feather();

        Tiger ti = new Tiger(5,"고기","어흥",4,"줄무늬");

        ti.eat();
        ti.speak();
        ti.walk();

        Monkey mo = new Monkey(
                12, "바나나", "우끼끼", 4, "빨간색");

        mo.eat();
        mo.speak();
        mo.walk();
        mo.hip();
    }

}
