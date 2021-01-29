package Thirteenth;

public class Theif extends Adventurer {
    float successRate;

    public Theif(int atk, int def, int dex, int intellect, int con, int mental, float successRate) {
        super(atk, def, dex, intellect, con, mental);
        this.successRate = successRate;
    }
}
