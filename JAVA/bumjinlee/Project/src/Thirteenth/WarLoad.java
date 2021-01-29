package Thirteenth;

public class WarLoad extends Warrior {

    int intention;


    public WarLoad(int atk, int def, int dex, int intellect, int con, int mental, float anger, int intention) {
        super(atk, def, dex, intellect, con, mental, anger);

        this.intention = intention;
    }
}
