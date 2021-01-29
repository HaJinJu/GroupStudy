package Thirteenth;

public class Warrior extends Adventurer {

    float anger;

    public Warrior(int atk, int def, int dex, int intellect, int con, int mental, float anger) {
        super(atk, def, dex, intellect, con, mental);

        this.anger = anger;
    }
}
