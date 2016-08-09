package MyZoo;

public class Ostrich extends Animal {

	private int howFastDidItRun = 0;

	public Ostrich(String type, String gender, String name, int howFastDidItRun) {
		super(type, gender, name);
		this.howFastDidItRun = howFastDidItRun;
	}

	public int getHowFastDidItRun() {
		return howFastDidItRun;
	}

	public void setHowFastDidItRun(int howFastDidItRun) {
		this.howFastDidItRun = howFastDidItRun;
	}

	@Override
	public String toString() {
		return type + ". It was " + gender + " and his name was " + name + ". It can run " + howFastDidItRun + " mph!";

	}

}
