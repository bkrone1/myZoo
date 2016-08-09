package MyZoo;

public class Snake extends Animal {

	private boolean didItCoilJump = false;
	private boolean wasItFriendly = false;

	public Snake(String type, String gender, String name, boolean didItCoilJump, boolean wasItFriendly) {
		super(type, gender, name);
		this.didItCoilJump = didItCoilJump;
		this.wasItFriendly = wasItFriendly;
	}

	public boolean isDidItCoilJump() {
		return didItCoilJump;
	}

	public void setDidItCoilJump(boolean didItCoilJump) {
		this.didItCoilJump = didItCoilJump;
	}

	public boolean isWasItFriendly() {
		return wasItFriendly;
	}

	public void setWasItFriendly(boolean wasItFriendly) {
		this.wasItFriendly = wasItFriendly;
	}

	@Override
	public String toString() {
		return type + ". It was " + gender + " and his name was " + name + ". It is " + didItCoilJump
				+ " that he could coil up and jump and also" + wasItFriendly + " that he was very friendly.";
	}

}
