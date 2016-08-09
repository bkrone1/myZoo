package com.people;

public class Person {

	protected String name = null;
	protected int age = 0;
	protected String gender = null;
	protected float heigh = 0.0f;
	
	
	public Person(String name, int age, String gender, float heigh) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.heigh = heigh;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public float getHeigh() {
		return heigh;
	}


	public void setHeigh(float heigh) {
		this.heigh = heigh;
	}
	
	
	
}
