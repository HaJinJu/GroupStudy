package FirstTest;

class ElectronicGoods {
    String energy;

    public ElectronicGoods(String energy) {
        this.energy = "전기";
    }
}

class Mobile extends ElectronicGoods {
    boolean isAvailableCalc;
    boolean isAvailableCall;
    boolean isAvailablePlayGame;


    public Mobile(boolean isAvailableCalc, boolean isAvailableCall,
                  boolean isAvailablePlayGame, String energy) {
        super(energy);

        this.isAvailableCalc = isAvailableCalc;
        this.isAvailableCall = isAvailableCall;
        this.isAvailablePlayGame = isAvailablePlayGame;
    }
}

public class Test6 {
}
