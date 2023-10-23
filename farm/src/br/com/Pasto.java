package br.com;

public class Pasto extends Area {
    private int amountOfAnimalsOnMe;

    public Pasto(double title, String type, int amountOfAnimalsOnMe) {
        super(title, type);

        this.amountOfAnimalsOnMe = amountOfAnimalsOnMe;
    }

    public int getAmountOfAnimalsOnMe() {
        return amountOfAnimalsOnMe;
    }

	public void setAmountOfAnimalsOnMe(int amountOfAnimalsOnMe) {
		this.amountOfAnimalsOnMe = amountOfAnimalsOnMe;
	}
}