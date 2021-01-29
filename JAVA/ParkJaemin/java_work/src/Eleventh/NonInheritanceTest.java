package Eleventh;
 class Student{
     String name;
     int age;
     String major;

     @Override
     public String toString() {
         return "Student{" +
                 "name='" + name + '\'' +
                 ", age=" + age +
                 ", majot='" + major + '\'' +
                 '}';
     }

     public Student(String name, int age, String majot) {
         this.name = name;
         this.age = age;
         this.major = majot;

     }
 }
 class Person {
    String name;
    int age;

     public Person(String name, int age) {
         this.name = name;
         this.age = age;
     }

     @Override
     public String toString() {
         return "Person{" +
                 "name='" + name + '\'' +
                 ", age=" + age +
                 '}';
     }
 }
public class NonInheritanceTest {
    public static void main(String[] args) {
        Person P = new Person("John", 20);
        System.out.println(P);

        Student S = new Student("David", 21, "Art");
        System.out.println(S);
    }
}
