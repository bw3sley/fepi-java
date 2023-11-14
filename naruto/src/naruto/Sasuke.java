package naruto;

public class Sasuke extends Ninja {
    private boolean hasSharingan;

    public Sasuke(String name, int age, Clan clan, Village village, boolean hasSharingan) {
        super(name, age, clan, village);
        this.hasSharingan = hasSharingan;
    }

    public boolean hasSharingan() {
        return hasSharingan;
    }

    public void setSharingan(boolean sharingan) {
        hasSharingan = sharingan;
    }
}