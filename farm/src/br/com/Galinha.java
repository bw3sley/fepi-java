package br.com;

public class Galinha extends Animal {
    private boolean isLayingEggs;

    public Galinha(String name, int age) {
        super(name, age);

        this.isLayingEggs = false;
    }

    public boolean getIsLayingEggsStatus() {
        return isLayingEggs;
    }

    public void layEggs() {
        System.out.println("A galinha está botando um ovo.");

        this.isLayingEggs = true;
    }
}