package naruto;

import java.util.List;

public class Kakashi extends Sensei {
    private String specialTechnique;

    public Kakashi(String name, int age, Clan clan, Village village, List<Ninja> students, String specialTechnique) {
        super(name, age, clan, village, students);
        this.specialTechnique = specialTechnique;
    }

	public String getSpecialTechnique() {
        return specialTechnique;
    }

    public void setSpecialTechnique(String specialTechnique) {
        this.specialTechnique = specialTechnique;
    }
}
