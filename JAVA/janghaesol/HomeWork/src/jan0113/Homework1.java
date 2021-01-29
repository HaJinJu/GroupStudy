package jan0113;

class Animal{
    private String name;
    private String species;

    public Animal(String name, String species){
        this.name = name;
        this.species = species;
    }

    public String getName(){
        return name;
    }

    public String getSpecies(){
        return species;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", species='" + species + '\'' + "인Animal입니다." +
                '}';
    }
static class Human extends Animal{
        private int age;

        public Human(String name, int age, String species){
            super(name, species);
            this.age = age;
        }

        public void test(){
            System.out.println(super.getName());
        }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + super.getName() + '\'' +
                ", species='" + super.getSpecies() + '\'' +
                ", age=" + age +'\''+"Human이니다."+
                '}';
    }
}
public static class Homework1 {
    public static void main(String[] args){
        Animal p = new Animal("penguin","bird");
        System.out.println(p);

        Human s = new Human("ssol",30,"human");
        System.out.println(s);
    }

    }

}
