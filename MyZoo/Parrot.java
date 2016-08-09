package MyZoo;

public class Parrot extends Animal{

	private boolean didItSpitCoconuts = false;
	private boolean didItHoldAFlashLight = false;
	
	
	public Parrot(String type, String gender, String name, boolean didItSpitCoconuts, boolean didItHoldAFlashLight) {
		super(type, gender, name);
		this.didItSpitCoconuts = didItSpitCoconuts;
		this.didItHoldAFlashLight = didItHoldAFlashLight;
	}

	public boolean isDidItSpitCoconuts() {
		return didItSpitCoconuts;
	}

	public void setDidItSpitCoconuts(boolean didItSpitCoconuts) {
		this.didItSpitCoconuts = didItSpitCoconuts;
	}

	public boolean isDidItHoldAFlashLight() {
		return didItHoldAFlashLight;
	}

	public void setDidItHoldAFlashLight(boolean didItHoldAFlashLight) {
		this.didItHoldAFlashLight = didItHoldAFlashLight;
	}

	@Override
	public String toString() {
		return type + ". He was " + gender + " and his name was " + name + ". It is " + didItSpitCoconuts + " that he could spit coconuts but " +  didItHoldAFlashLight
				+ " that he held a flashlight.";
	}
	
	
}
