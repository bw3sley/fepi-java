import java.util.List;

public class Sensei {
    private String name;
    private int age;
    private Clan clan;
    private Village village;
    private List<Ninja> students;

    public Sensei(String name, int age, Clan clan, Village village, List<Ninja> students) {
        this.name = name;
        this.age = age;
        this.clan = clan;
        this.village = village;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Clan getClan() {
        return clan;
    }

    public Village getVillage() {
        return village;
    }

    public List<Ninja> getStudents() {
        return students;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setClan(Clan clan) {
        this.clan = clan;
    }

    public void setVillage(Village village) {
        this.village = village;
    }

    public void addNewStudent(Jutsu jutsu) {
        students.add(jutsu);
    }

    public void displayJutsus() {
        System.out.println("Students of " + name + ":");

        for (Ninja student : students) {
            System.out.println("Name: " + students.getName() + ", Description: " + students.getDescription());
        }
    }
}