package com.tiy.objectDesign;

public class PlayerTeamInfo extends Player {

	protected String playerName = null;
	protected String teamName = null;
	protected int jerseyNumber = 0;

	public PlayerTeamInfo(int age, float height, int weight, float wingSpan, String nationality, String hometown,
			String college, int draftYear, int yearsPro, boolean freeAgent, String playerName, String teamName,
			int jerseyNumber) {
		super(age, height, weight, wingSpan, nationality, hometown, college, draftYear, yearsPro, freeAgent);
		this.playerName = playerName;
		this.teamName = teamName;
		this.jerseyNumber = jerseyNumber;
	}

	public PlayerTeamInfo(int age, float height, int weight, float wingSpan, String nationality, String hometown,
			String college, int draftYear, int yearsPro, boolean freeAgent) {
		super(age, height, weight, wingSpan, nationality, hometown, college, draftYear, yearsPro, freeAgent);
	}

	public PlayerTeamInfo() {
		return;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getJerseyNumber() {
		return jerseyNumber;
	}

	public void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}

	@Override
	public String toString() {
		return playerName + "'s baisc player info is:" + " team name " + teamName + " and jersey number is "
				+ jerseyNumber + ".\n" + playerName + "'s attributes are age " + age + " years old, a height of "
				+ height + " feet, a weight of " + weight + "lbs, a wing span of " + "\n" + wingSpan
				+ " feet, a nationality of " + nationality + ", a hometown of " + hometown + ", went to college at "
				+ college + ", was drafted in " + draftYear + ", \n" + "has been a pro for " + yearsPro
				+ " years and, is currently a free agent " + freeAgent + ".";
	}

}
