package Thirteenth;

public class Assassin extends Theif {

    int incantation;

    public Assassin(int atk, int def, int dex, int intellect, int con, int mental, float successRate, int incantation) {
        super(atk, def, dex, intellect, con, mental, successRate);

        this.incantation = incantation;
    }
}
