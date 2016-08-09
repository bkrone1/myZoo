package MyZoo;

public class Elephant extends Animal{

	private int howManyBarrellsWereThrown = 0;
	private boolean spitWater = false;
	public Elephant(String type, String gender, String name, int howManyBarrellsWereThrown, boolean spitWater) {
		super(type, gender, name);
		this.howManyBarrellsWereThrown = howManyBarrellsWereThrown;
		this.spitWater = spitWater;
	}
	public int getHowManyBarrellsWereThrown() {
		return howManyBarrellsWereThrown;
	}
	public void setHowManyBarrellsWereThrown(int howManyBarrellsWereThrown) {
		this.howManyBarrellsWereThrown = howManyBarrellsWereThrown;
	}
	public boolean isSpitWater() {
		return spitWater;
	}
	public void setSpitWater(boolean spitWater) {
		this.spitWater = spitWater;
	}
	@Override
	public String toString() {
		return type + ". It was " + gender + " and her name was " + name + ". It was able to suck barrells and threw " + howManyBarrellsWereThrown + " of them. It is also " +  spitWater
				+ " that she could spit water very far.";
	}
	
	
}
