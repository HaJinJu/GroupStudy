class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Human extends Animal {
    private String job;

    public Human(String name, int age, String job) {
        // 부모 클래스 생성자 사용
        super(name, age);
        this.job = job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        // 부모 클래스 Getter 매서드 사용
        return "Human{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", job='" + job + '\'' +
                '}';
    }
}

public class EleventhTask1 {
    public static void main(String[] args) {
        Human h = new Human("철수", 10, "영희 심부름꾼");
        System.out.println(h);

        // 부모 클래스 Setter 매서드 사용
        h.setName("영희");
        h.setAge(12);
        h.setJob("철수 놀리기");
        System.out.println(h);
    }
}