package Eleventh;

class Human extends Animal{
    private boolean isThinking;
    private boolean isWorking;

    public Human(int age, String gender, boolean isThinking, boolean isWorking) {
        super(age, gender);
        this.isThinking = isThinking;
        this.isWorking = isWorking;
    }

    @Override
    public String toString() {
        return "Human{" +
                "gender='" + gender + '\'' +
                '}';
    }
}

class Animal {
    private int age = 3;
    String gender = "male";

    public Animal(int age, String gender) {
        this.age = age;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}

public class Homework1 {
    public static void main(String[] args) {
        Human h = new Human(23, "male", true, true);

        System.out.println(h);
        System.out.println(h.getAge());
    }
}
