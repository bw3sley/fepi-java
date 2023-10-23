package br.com;

import java.util.ArrayList;

public class Fazenda {
    private ArrayList<Area> areas;
    private ArrayList<Animal> animals;

    public Fazenda() {
        this.areas = new ArrayList<>();
        this.animals= new ArrayList<>();
    }

    public void addNewArea(Area area) {
        areas.add(area);
    }

    public void addNewAnimal(Animal animal) {
        animals.add(animal);
    }

    public void getAreas() {
        System.out.println("Lista de Áreas:");

        for (Area area : areas) {
            System.out.println("Tipo: " + area.getType() + ", Tamanho: " + area.getSize());
        }
    }

    public void getAnimals() {
        System.out.println("Lista de Animais:");

        for (Animal animal : animals) {
            System.out.println("Nome: " + animal.getName() + ", Idade: " + animal.getAge());
        }
    }
}