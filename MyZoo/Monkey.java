package MyZoo;

public class Monkey extends Animal {

	private boolean ateBananas = false;
	private boolean threwPoop = false;

	public Monkey(String type, String gender, String name, boolean ateBananas, boolean threwPoop) {
		super(type, gender, name);
		this.ateBananas = ateBananas;
		this.threwPoop = threwPoop;
	}

	public boolean isAteBananas() {
		return ateBananas;
	}

	public void setAteBananas(boolean ateBananas) {
		this.ateBananas = ateBananas;
	}

	public boolean isThrewPoop() {
		return threwPoop;
	}

	public void setThrewPoop(boolean threwPoop) {
		this.threwPoop = threwPoop;
	}

	@Override
	public String toString() {
		return type + ". It was " + gender + " and his name was " + name + ". It is " + ateBananas
				+ " that he ate bananas and " + threwPoop + " that he threw poop.";
	}

}
