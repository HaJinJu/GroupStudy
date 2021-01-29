package Class20210113;

class PersonAndAnimal{
     private String  Person ;
     private String Animal ;


    public String getAnimal() {
        return Animal;
    }

    public String getPerson() {
        return Person;
    }

    public PersonAndAnimal(String  Person, String  Animal){
        this.Person = Person;
        this.Animal = Animal;
    }

    @Override
    public String toString() {
        return "PersonAndAnimal{" +
                "Person=" + Person +", Animal=" + Animal +'}';
    }
}
class Ex1 extends PersonAndAnimal{
    private String Human;

    public Ex1(String Person, String Animal , String Human) {
        super(Person, Animal);
        this.Human = Human;
    }

    @Override
    public String toString() {
        return "Ex1{" +
                "Person='"+ super.getPerson() + "' Animal="+ super.getAnimal() + " Human='"+ Human + '\'' +
                '}';
    }
}

public class Inheritancehomework {
  /*동물은 사람인가 ? 사람은 동물인가 ?
    사람은 동물입니다.
    이를 표현하는 클래스를 작성해보세요.*/
  public static void main(String[] args) {
      PersonAndAnimal pe = new PersonAndAnimal("사람입니다", "동물입니다");

      System.out.println(pe);

      Ex1 e = new Ex1("사람입니다", "동물입니다.", "동물이면서사람입니다.");
      System.out.println(e);

  }
}
