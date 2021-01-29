package SeventhHomeWork;

public class HomeWork11 {
    public static void main(String[] args) {
        Arraysetting ra = new Arraysetting();
        ra.prepareArray();
        ra.setRandomarray();
        ra.printArray();

        System.out.println("");
        System.out.println(
                "짝수의 개수는 = " + ra.getArrayEvenNumberCount());
    }
}
