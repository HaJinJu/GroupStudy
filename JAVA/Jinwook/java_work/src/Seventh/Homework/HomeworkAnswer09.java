package Seventh.Homework;

public class HomeworkAnswer09 {
    public static void main(String[] args) {
        RandomAlloc ra = new RandomAlloc();

        ra.prepareEmployee(20);
        ra.setRandomNumber(ra.NONDUPLICATE);
        ra.printEmployee();
        ra.printPrice();
    }

}
