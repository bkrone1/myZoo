package MyZoo;

public class Alligator extends Animal {

	private int howManyTeeth = 0;
	private boolean eatenAnyPeople = false;

	public Alligator(String type, String gender, String name, int howManyTeeth, boolean eatenAnyPeople) {
		super(type, gender, name);
		this.howManyTeeth = howManyTeeth;
		this.eatenAnyPeople = eatenAnyPeople;
	}

	public int getHowManyTeeth() {
		return howManyTeeth;
	}

	public void setHowManyTeeth(int howManyTeeth) {
		this.howManyTeeth = howManyTeeth;
	}

	public boolean isEatenAnyPeople() {
		return eatenAnyPeople;
	}

	public void setEatenAnyPeople(boolean eatenAnyPeople) {
		this.eatenAnyPeople = eatenAnyPeople;
	}

	@Override
	public String toString() {
		return type + ". It was " + gender + " and his name was " + name + ". He had " + howManyTeeth
				+ " teetch and it's " + eatenAnyPeople + " that he has eaten people.";
	}

}
