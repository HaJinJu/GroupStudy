package Homework.Eleventh;

class Animal {
    private String species;
    private String name;
    private int age;
    private String sex;

    public Animal(String species, String name, int age, String sex) {
        this.species = species;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getSpecies() {
        return species;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}

class Human extends Animal {
    private String job;

    public Human(String species, String name, int age, String sex, String job) {
        super(species, name, age, sex);
        this.job = job;
    }

    @Override
    public String toString() {
        return "Human{" + "species='" + super.getSpecies() +
                "', name='" + super.getName() +
                "', age=" + super.getAge() +
                ", sex='" + super.getSex() +
                "', job='" + job + '\'' +
                '}';
    }
}

public class Homework1 {
    public static void main(String[] args) {
        // 동물은 사람인가 ? 사람은 동물인가 ?
        // 사람은 동물입니다.
        // 이를 표현하는 클래스를 작성해보세요.

        Animal a = new Animal("개", "복숭아", 7, "암컷");
        System.out.println(a);

        Human h = new Human("Human", "Park", 28, "남성", "CEO");
        System.out.println(h);
    }
}
