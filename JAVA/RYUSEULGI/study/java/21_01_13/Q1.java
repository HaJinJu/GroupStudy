// 동물은 사람인가 ? 사람은 동물인가 ?  
// 사람은 동물입니다.  
// 이를 표현하는 클래스를 작성해보세요.  

class Animal {
    private String type;
    private String name;

    public Animal(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "{" + "동물 type='" + getType() + "'" + ", name='" + getName() + "'" + "}";
    }

}

class Person extends Animal {

    public Person(String type, String name) {
        super(type, name);
    }

    @Override
    public String toString() {
        return "{" + "동물 type ='" + super.getType() + "'" + ", name='" + super.getName() + "'" + "}";
    }
}

public class Q1 {
    public static void main(String[] args) {

        System.out.println("동물은 사람인가? 사람은 동물인가?");

        Animal animal = new Animal("동물", "야옹이");
        System.out.println(animal);

        Person person = new Person("사람", "Jay");
        System.out.println(person);
    }
}
