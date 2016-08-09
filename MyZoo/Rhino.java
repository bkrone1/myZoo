package MyZoo;

public class Rhino extends Animal {

	private boolean didItHaveAHorn = false;
	private boolean didItChargeAtYou = false;

	public Rhino(String type, String gender, String name, boolean didItHaveAHorn, boolean didItChargeAtYou) {
		super(type, gender, name);
		this.didItHaveAHorn = didItHaveAHorn;
		this.didItChargeAtYou = didItChargeAtYou;
	}

	public boolean isDidItHaveAHorn() {
		return didItHaveAHorn;
	}

	public void setDidItHaveAHorn(boolean didItHaveAHorn) {
		this.didItHaveAHorn = didItHaveAHorn;
	}

	public boolean isDidItChargeAtYou() {
		return didItChargeAtYou;
	}

	public void setDidItChargeAtYou(boolean didItChargeAtYou) {
		this.didItChargeAtYou = didItChargeAtYou;
	}

	@Override
	public String toString() {
		return type + ". It was " + gender + " and his name was " + name + ". It is " + didItHaveAHorn
				+ " that he had a horn and " + didItChargeAtYou + " that he charged at me.";
	}

}
