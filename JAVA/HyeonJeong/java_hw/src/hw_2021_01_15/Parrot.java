package hw_2021_01_15;

public class Parrot extends Bird implements Behavior{
    private String feather;

    public Parrot(int age, String food, String speak, int wing, String feather) {
        super(age, food, speak, wing);
        this.feather = feather;
    }

    public String getFeather() {
        return feather;
    }

    @Override
    public void eat() {
        System.out.printf("새는 %s를 먹는다.\n",food);
    }

    @Override
    public void walk() {
        System.out.printf("새는 날개 %d개로 하늘을 난다.\n", wings);
    }

    @Override
    public void speak() {
        System.out.printf("새는 %s하고 운다.\n", speak);
    }

    public void feather() {
        System.out.printf("앵무새 날개는 %s이다.\n",feather);
    }
}

