package naruto;

public class Naruto extends Ninja {
    private boolean isHokage;
    private Biju biju;

    public Naruto(String name, int age, Clan clan, Village village, boolean isHokage) {
        super(name, age, clan, village);
        this.isHokage = isHokage;
        this.learnNewJutsu(new Jutsu("Rasengan", "Um poderoso jutsu de esfera giratória."));
    }

    public boolean getIsHokage() {
        return isHokage;
    }

    public void setHokage(boolean hokage) {
        isHokage = hokage;
    }

    public Biju getBiju() {
        return biju;
    }

    public void setBiju(Biju biju) {
        this.biju = biju;
    }
}
