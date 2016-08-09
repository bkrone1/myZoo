package MyZoo;

public class Frog extends Animal {

	private int howHighDidItJump = 0;
	private boolean didItEatAnyFlies = false;

	public Frog(String type, String gender, String name, int howHighDidItJump, boolean didItEatAnyFlies) {
		super(type, gender, name);
		this.howHighDidItJump = howHighDidItJump;
		this.didItEatAnyFlies = didItEatAnyFlies;
	}

	public int getHowHighDidItJump() {
		return howHighDidItJump;
	}

	public void setHowHighDidItJump(int howHighDidItJump) {
		this.howHighDidItJump = howHighDidItJump;
	}

	public boolean isDidItEatAnyFlies() {
		return didItEatAnyFlies;
	}

	public void setDidItEatAnyFlies(boolean didItEatAnyFlies) {
		this.didItEatAnyFlies = didItEatAnyFlies;
	}

	@Override
	public String toString() {
		return type + ". It was " + gender + " and his name was " + name + ". It hopped " + howHighDidItJump
				+ " feet in the air! And it's " + didItEatAnyFlies + " that he ate flies.";
	}

}
