import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        UzumakiClan uzumakiClan = new UzumakiClan("Uzumaki", "Red Spiral", Arrays.asList("Naruto", "Kushina", "Boruto"));
        UchihaClan uchihaClan = new UchihaClan("Uchiha", "Sharingan", Arrays.asList("Sasuke", "Itachi", "Madara"));
        SandClan sandClan = new SandClan("Sand", "Desert", Arrays.asList("Gaara", "Temari", "Kankuro"));

        Naruto naruto = new Naruto("Naruto", 20, uzumakiClan, Village.HIDDEN_LEAF, true);
        Sasuke sasuke = new Sasuke("Sasuke", 22, uchihaClan, Village.HIDDEN_LEAF, true);
        Gaara gaara = new Gaara("Gaara", 18, sandClan, Village.HIDDEN_SAND, true);

        naruto.aprenderJutsu(new Jutsu("Rasengan", "Um poderoso jutsu de esfera giratória."));
        sasuke.aprenderJutsu(new Jutsu("Chidori", "Um jutsu que utiliza eletricidade."));
        gaara.aprenderJutsu(new Jutsu("Sabaku Kyu", "Uma técnica que aprisiona o inimigo em uma esfera de areia."));

        System.out.println("Informações de Naruto:");
        System.out.println("Nome: " + naruto.getName());
        System.out.println("Idade: " + naruto.getAge());
        System.out.println("Clã: " + naruto.getClan().getName());
        System.out.println("Vila: " + naruto.getVillage());
        System.out.println("É Hokage? " + naruto.isHokage());
        System.out.println("Jutsus: " + naruto.getJutsu());

        System.out.println("\nInformações de Sasuke:");
        System.out.println("Nome: " + sasuke.getName());
        System.out.println("Idade: " + sasuke.getAge());
        System.out.println("Clã: " + sasuke.getClan().getName());
        System.out.println("Vila: " + sasuke.getVillage());
        System.out.println("Possui Sharingan? " + sasuke.hasSharingan());
        System.out.println("Jutsus: " + sasuke.getJutsu());

        System.out.println("\nInformações de Gaara:");
        System.out.println("Nome: " + gaara.getName());
        System.out.println("Idade: " + gaara.getAge());
        System.out.println("Clã: " + gaara.getClan().getName());
        System.out.println("Vila: " + gaara.getVillage());
        System.out.println("Possui Shukaku? " + gaara.hasShukaku());
        System.out.println("Jutsus: " + gaara.getJutsu());
        
        Kakashi kakashi = new Kakashi("Kakashi Hatake", 40, uchihaClan, Village.HIDDEN_LEAF, Arrays.asList(sasuke), "Raikiri");

        System.out.println("\nInformações do Sensei Kakashi:");
        System.out.println("Nome: " + kakashi.getName());
        System.out.println("Idade: " + kakashi.getAge());
        System.out.println("Vila: " + kakashi.getVillage());
        System.out.println("Estudantes: " + kakashi.getStudents());
        System.out.println("Técnica Especial: " + kakashi.getSpecialTechnique());
    }
}
