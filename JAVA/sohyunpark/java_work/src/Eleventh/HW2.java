package Eleventh;

class Animal {
    private String sex;
    private int age;

    public Animal(String sex, int age) {
        this.sex = sex;
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Animal {" +
                "Sex = '" + sex + '\'' +
                ", age = " + age +
                '}';
    }
}

class PersonHW extends Animal {
    private String name;

    public PersonHW(String sex, int age, String name) {
        super(sex, age);
        this.name = name;
    }

    @Override
    public String toString() {
        return "PersonHW {" + "sex = " + super.getSex() + ", age = " + super.getAge() +
                ", name = '" + name + '\'' +
                '}';
    }
}

public class HW2 {
    public static void main(String[] args) {
        // 사람은 동물이다. 이를 표현하는 클래스를 작성하라.
        Animal a = new Animal("Female", 10);
        System.out.println(a);

        PersonHW p = new PersonHW("Male", 20, "Steve");
        System.out.println(p);

    }
}
