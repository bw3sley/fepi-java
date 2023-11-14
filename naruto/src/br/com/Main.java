import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Village hiddenLeaf = new Village("Hidden Leaf");

        UzumakiClan uzumakiClan = new UzumakiClan("Uzumaki", "Red Spiral", Arrays.asList("Naruto", "Kushina", "Boruto"));
        UchihaClan uchihaClan = new UchihaClan("Uchiha", "Sharingan", Arrays.asList("Sasuke", "Itachi", "Madara"));

        Naruto naruto = new Naruto("Naruto", 20, uzumakiClan, hiddenLeaf, true);
        Sasuke sasuke = new Sasuke("Sasuke", 22, uchihaClan, hiddenLeaf, true);

        naruto.aprenderJutsu(new Jutsu("Rasengan", "Um poderoso jutsu de esfera giratória."));
        sasuke.aprenderJutsu(new Jutsu("Chidori", "Um jutsu que utiliza eletricidade."));

        Biju kyuubi = new Biju("Kyuubi", 9);
        naruto.setBiju(kyuubi);

        System.out.println("Informações de Naruto:");
        System.out.println("Nome: " + naruto.getName());
        System.out.println("Idade: " + naruto.getAge());
        System.out.println("Clan: " + naruto.getClan().getName());
        System.out.println("Vila: " + naruto.getVillage().getName());
        System.out.println("É Hokage? " + naruto.isHokage());
        System.out.println("Biju: " + naruto.getBiju().getName() + " - Tails: " + naruto.getBiju().getTails());
        System.out.println("Jutsus: " + naruto.getJutsu());

        System.out.println("\nInformações de Sasuke:");
        System.out.println("Nome: " + sasuke.getName());
        System.out.println("Idade: " + sasuke.getAge());
        System.out.println("Clan: " + sasuke.getClan().getName());
        System.out.println("Vila: " + sasuke.getVillage().getName());
        System.out.println("Possui Sharingan? " + sasuke.hasSharingan());
        System.out.println("Jutsus: " + sasuke.getJutsu());
    }
}
