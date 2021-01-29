package hw_2021_01_13;

class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Human extends Animal {
    String job;

    public Human(String name, int age, String job) {
        super(name, age);
        this.job = job;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}

public class HW01 {
    public static void main(String[] args) {
        //   동물은 사람인가 ? 사람은 동물인가 ?
        //   사람은 동물입니다.
        //   이를 표현하는 클래스를 작성해보세요.
        Human h = new Human("Anna",20, "Elsa's sister");
        System.out.println(h);
    }
}
