package Eleventh;
//2) 동물은 사람인가 ? 사람은 동물인가 ?
//   사람은 동물입니다.
//   이를 표현하는 클래스를 작성해보세요.

class Animal {
    private String Species;
    private int age;

    public Animal(String Species, int age){
        this.Species = Species;
        this.age = age;
    }

    public String getSpecies() {
        return Species;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "Species='" + Species + '\'' +
                ", age=" + age +
                '}';
    }

}


class Human extends Animal {
    private String name;

    public Human(String Species, int age, String name) {
        super(Species, age);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}
public class Homework2 {
            public static void main(String[] args) {
                Human h = new Human("Mammalia",21,"Peter");
                System.out.println(h);

                Animal a = new Animal("Mammalia", 7);
                System.out.println(a);

            }
        }

