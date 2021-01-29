package Eleventh;

class Animal{
    private String animal;  //동물 부여

    public Animal(String animal) {
        this.animal = animal;
    }

    public String getAnimal() {
        return animal;
    }

    @Override
    public String toString() {
        return "Animal{'" +animal+
                "'은(는) 사람이 아닙니다." + '\'' +
                '}';
    }
}

class Human extends Animal {
    String Human;

    public Human(String animal, String human) {
        super(animal);
        Human = human;
    }

    @Override
    public String toString() {
        return "Human{'" +  super.getAnimal() +"'은 사람이 아닙니다'" +Human+
                "'은 동물입니다.'" + '\'' +
                '}';
    }
}

    public class HomeWork1 {
    public static void main(String[] args) {
        Animal a = new Animal("고양이");
        System.out.println(a);
        Human h = new Human("cat","Human");
        System.out.println(h);
    }
}
