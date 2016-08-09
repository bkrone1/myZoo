package MyZoo;

public class Swordfish extends Animal{

	private int howLongWasSword = 0;
	private boolean UnderWater = false;
	
	public Swordfish(String type, String gender, String name, int howLongWasSword, boolean underWater) {
		super(type, gender, name);
		this.howLongWasSword = howLongWasSword;
		UnderWater = underWater;
	}
	public int getHowLongWasSword() {
		return howLongWasSword;
	}
	public void setHowLongWasSword(int howLongWasSword) {
		this.howLongWasSword = howLongWasSword;
	}
	public boolean isUnderWater() {
		return UnderWater;
	}
	public void setUnderWater(boolean underWater) {
		UnderWater = underWater;
	}
	@Override
	public String toString() {
		return type + ". It was " + gender + " and it's name was " + name + ". His sword was " + howLongWasSword + "inches long and " +  UnderWater
				+ " that he lived underwater.";
	}
	
	
}
