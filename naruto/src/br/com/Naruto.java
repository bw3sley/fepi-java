import java.util.List;

public class Naruto extends Ninja {
    private boolean isHokage;

    public Naruto(String name, int age, Clan clan, Village village, boolean isHokage) {
        super(name, age, clan, village);
        this.isHokage = isHokage;
        this.learnJutsu(new Jutsu("Rasengan", "Um poderoso jutsu de esfera giratória."));
    }

    public boolean isHokage() {
        return isHokage;
    }

    public void setHokage(boolean hokage) {
        isHokage = hokage;
    }
}
