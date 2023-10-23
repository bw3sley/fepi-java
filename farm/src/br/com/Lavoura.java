package br.com;

public class Lavoura extends Area {
    private int amountOfVegetables;

    public Lavoura(double title, String type, int amountOfVegetables) {
        super(title, type);

        this.amountOfVegetables = amountOfVegetables;
    }

    public int getAmountOfVegetables() {
        return amountOfVegetables;
    }

	public void setAmountOfVegetables(int amountOfVegetables) {
		this.amountOfVegetables = amountOfVegetables;
	}
}