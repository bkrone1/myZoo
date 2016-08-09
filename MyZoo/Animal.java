package MyZoo;

public class Animal {
	
	protected String type = null;
	protected String gender = null;
	protected String name = null;
	
	public Animal(String type, String gender, String name) {
		super();
		this.type = type;
		this.gender = gender;
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	
	

}
