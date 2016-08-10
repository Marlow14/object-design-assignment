package com.tiy.objectDesign;

public class Player extends BasketballPlayer {
	
	public int age = 0;
	public float height = 0.0f;
	public int weight = 0;
	public float wingSpan = 0.0f;
	public String nationality = null;
	public String hometown = null;
	public String college = null;
	public int draftYear = 0;
	public int yearsPro = 0;
	public boolean freeAgent = false;
	
	public Player(int age, float height, int weight, float wingSpan, String nationality, String hometown,
			String college, int draftYear, int yearsPro, boolean freeAgent) {
		super();
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.wingSpan = wingSpan;
		this.nationality = nationality;
		this.hometown = hometown;
		this.college = college;
		this.draftYear = draftYear;
		this.yearsPro = yearsPro;
		this.freeAgent = freeAgent;
	}
	public Player() {
		super();
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public float getWingSpan() {
		return wingSpan;
	}
	public void setWingSpan(float wingSpan) {
		this.wingSpan = wingSpan;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getHometown() {
		return hometown;
	}
	public void setHometown(String hometown) {
		this.hometown = hometown;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public int getDraftYear() {
		return draftYear;
	}
	public void setDraftYear(int draftYear) {
		this.draftYear = draftYear;
	}
	public int getYearsPro() {
		return yearsPro;
	}
	public void setYearsPro(int yearsPro) {
		this.yearsPro = yearsPro;
	}
	public boolean isFreeAgent() {
		return freeAgent;
	}
	public void setFreeAgent(boolean freeAgent) {
		this.freeAgent = freeAgent;
	}
	
	@Override
	public String toString() {
		return "This player's attributes are age " + age + "years old, a height of " + height + " feet, a weight of " + weight + "lbs, a wing span of " + "\n" + wingSpan
				+ " feet, a nationality of " + nationality + ", a hometown of " + hometown + ", went to college at " + college + ", was drafted in "
				+ draftYear + ", \n" + "has been a pro for " + yearsPro + " years and, is currently a free agent " + freeAgent + ".";
	}
	@Override
	public void playingBasketball() {
		// TODO Auto-generated method stub
		
	}
	
	

}
