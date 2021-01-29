package Eleventh.Homework;

class Animal {
    private String type;
    private String YesorNo;

    public Animal(String type, String YesorNo) {
        this.type = type;
        this.YesorNo = YesorNo;
    }

    public String getType() {
        return type;
    }

    public String getYesorNo() {
        return YesorNo;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", YesorNo=" + YesorNo +
                '}';
    }
}

class Human extends Animal {
    private String name;

    public Human(String type, String YesorNo, String name) {
        super(type, YesorNo);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Human{" + "type'" + super.getType() +
                "', YesorNo=" + super.getYesorNo() +
                "name='" + name + '\'' +
                '}';
    }

    public void test() {
        System.out.println(super.getType());


    }
}

public class homework1 {
    public static void main(String[] args) {
        Animal A = new Animal("동물이 사람인가?", "아니다");

        System.out.println(A);

        Human B = new Human("사람은 동물인가?", "그렇다. 사람은 동물이다! 이름이 무엇인가? ", "Stan");

        System.out.println(B);

    }

}
