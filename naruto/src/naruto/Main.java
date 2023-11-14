package naruto;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Village hiddenLeaf = new Village("Hidden Leaf");
 
        UzumakiClan uzumakiClan = new UzumakiClan("Uzumaki", "Red Spiral", Arrays.asList("Naruto", "Kushina", "Boruto"));
        UchihaClan uchihaClan = new UchihaClan("Uchiha", "Sharingan", Arrays.asList("Sasuke", "Itachi", "Madara"));
        HatakeClan hatakeClan = new HatakeClan("Hatake", "White Chidori", Arrays.asList("Kakashi", "Sakumo"));
 
        Naruto naruto = new Naruto("Naruto", 20, uzumakiClan, hiddenLeaf, true);
        Sasuke sasuke = new Sasuke("Sasuke", 22, uchihaClan, hiddenLeaf, true);
 
        Kakashi kakashi = new Kakashi("Kakashi", 30, hatakeClan, hiddenLeaf, Arrays.asList(naruto, sasuke), "Sharingan");
 
        naruto.learnNewJutsu(new Jutsu("Rasengan", "Um poderoso jutsu de esfera giratória."));
        sasuke.learnNewJutsu(new Jutsu("Chidori", "Um jutsu que utiliza eletricidade."));

        System.out.println("Informações de Naruto:");
        System.out.println("Nome: " + naruto.getName());
        System.out.println("Clã: " + naruto.getClan().getName());
        System.out.println("Vila: " + naruto.getVillage().getName());
        System.out.println("É Hokage? " + naruto.getIsHokage());
        naruto.displayJutsus();
 
        System.out.println("\nInformações de Sasuke:");
        System.out.println("Nome: " + sasuke.getName());
        System.out.println("Clã: " + sasuke.getClan().getName());
        System.out.println("Vila: " + sasuke.getVillage().getName());
        System.out.println("Possui Sharingan? " + sasuke.hasSharingan());
        sasuke.displayJutsus();
 
        System.out.println("\nInformações do Sensei Kakashi:");
        System.out.println("Nome: " + kakashi.getName());
        System.out.println("Clã: " + kakashi.getClan().getName());
        System.out.println("Vila: " + kakashi.getVillage().getName());
        System.out.println("Técnica especial: " + kakashi.getSpecialTechnique());
        kakashi.displayStudents();
    }
}
 
