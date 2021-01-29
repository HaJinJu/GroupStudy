class Person {
    String name;
    String major;
    int age;

    // 매소드 
    // public + dataType + name (입력받을 인자)
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int a){
        age =a;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
    // void 형식은 return이 없음
public class ClassBasic {
    public static void main(String[] args) {
        Person p = new Person();

        p.setName("seulgi");
        p.setAge(26);

        System.out.println("hello " + p.getName());
        System.out.println("age :" + p.getAge());
    }
}
