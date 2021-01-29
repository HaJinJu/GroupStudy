package Project0113;

class PersonOrAnimal {
    private String person;
    private String animal;

    public PersonOrAnimal(String person, String animal) {
        this.person = person;
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "PersonOrAnimal{" +
                "person='" + person + '\'' +
                ", animal='" + animal + '\'' +
                '}';
    }

    public String getPerson() {
        return person;
    }

    public String getAnimal() {
        return animal;
    }
}

class Human extends PersonOrAnimal {
    private String human;

    public Human(String person, String animal, String human) {
        super(person, animal);
        this.human = human;
    }

    @Override
    public String toString() {
        return "Human{" + "Person='"+ super.getPerson() + "' Animal="+ super.getAnimal() +
                " Human='"+ human + '\'' + '}';
    }
}

public class Homework1 {
    public static void main(String[] args) {
        PersonOrAnimal p = new PersonOrAnimal("사람", "동물");
        System.out.println(p);

        Human h = new Human("사람", "동물", "사람은 동물 입니다.");
        System.out.println(h);
    }
}


