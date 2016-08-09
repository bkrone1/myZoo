package MyZoo;

public class Beaver extends Animal {

	private boolean didItHaveBigTeeth = false;
	private boolean wasAnyWoodEaten = false;

	public Beaver(String type, String gender, String name, boolean didItHaveBigTeeth, boolean wasAnyWoodEaten) {
		super(type, gender, name);
		this.didItHaveBigTeeth = didItHaveBigTeeth;
		this.wasAnyWoodEaten = wasAnyWoodEaten;
	}

	public boolean isDidItHaveBigTeeth() {
		return didItHaveBigTeeth;
	}

	public void setDidItHaveBigTeeth(boolean didItHaveBigTeeth) {
		this.didItHaveBigTeeth = didItHaveBigTeeth;
	}

	public boolean isWasAnyWoodEaten() {
		return wasAnyWoodEaten;
	}

	public void setWasAnyWoodEaten(boolean wasAnyWoodEaten) {
		this.wasAnyWoodEaten = wasAnyWoodEaten;
	}

	@Override
	public String toString() {
		return type + ". It was " + gender + " and his name was " + name + ". It is " + didItHaveBigTeeth
				+ " that he had big teeth and " + wasAnyWoodEaten + " that he ate any wood.";
	}

}
