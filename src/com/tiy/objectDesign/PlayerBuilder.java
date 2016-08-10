package com.tiy.objectDesign;

import java.util.Scanner;

import org.omg.CORBA.FREE_MEM;

public class PlayerBuilder {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		String userInput = null;

		int numChckr = 0;
		float numChckr2 = 0;

		boolean invalidInput = false;

		PlayerTeamInfo plyrInfo = new PlayerTeamInfo();

		System.out.println("Welcome to the player builder.\n" + "Here you will enter player attributes.");

		System.out.println("Enter the player's name:");
		userInput = keyboard.nextLine();
		plyrInfo.setPlayerName(userInput);

		System.out.println("Enter the player's team name:");
		userInput = keyboard.nextLine();
		plyrInfo.setTeamName(userInput);

		do {
			invalidInput = false;

			System.out.println("What is the player's jersey number?");

			userInput = keyboard.nextLine();

			invalidInput = validNumInt(userInput);

		} while (invalidInput);

		numChckr = Integer.parseInt(userInput);

		plyrInfo.setJerseyNumber(numChckr);

		do {
			invalidInput = false;

			System.out.println("What is the player's age?");

			userInput = keyboard.nextLine();

			invalidInput = validNumInt(userInput);

		} while (invalidInput);

		numChckr = Integer.parseInt(userInput);

		plyrInfo.setAge(numChckr);

		do {
			invalidInput = false;

			System.out.println("What is the player's height?");

			userInput = keyboard.nextLine();

			invalidInput = validNumFloat(userInput);

		} while (invalidInput);

		numChckr2 = Float.parseFloat(userInput);

		plyrInfo.setHeight(numChckr2);

		do {
			invalidInput = false;

			System.out.println("What is the player's weight?");

			userInput = keyboard.nextLine();

			invalidInput = validNumInt(userInput);

		} while (invalidInput);

		numChckr = Integer.parseInt(userInput);

		plyrInfo.setWeight(numChckr);

		do {
			invalidInput = false;

			System.out.println("What is the player's wing span?");

			userInput = keyboard.nextLine();

			invalidInput = validNumFloat(userInput);

		} while (invalidInput);

		numChckr2 = Float.parseFloat(userInput);

		plyrInfo.setWingSpan(numChckr2);

		System.out.println("What is the player's hometown?");
		userInput = keyboard.nextLine();
		plyrInfo.setHometown(userInput);

		System.out.println("What is the player's nationality?");
		userInput = keyboard.nextLine();
		plyrInfo.setNationality(userInput);

		System.out.println("What college did you attend?");
		userInput = keyboard.nextLine();
		plyrInfo.setCollege(userInput);

		do {
			invalidInput = false;

			System.out.println("What is the year your player was drafted?");

			userInput = keyboard.nextLine();

			invalidInput = validNumInt(userInput);

		} while (invalidInput);

		numChckr = Integer.parseInt(userInput);

		plyrInfo.setDraftYear(numChckr);

		do {
			invalidInput = false;

			System.out.println("How long your player's been a pro?");

			userInput = keyboard.nextLine();

			invalidInput = validNumInt(userInput);

		} while (invalidInput);

		numChckr = Integer.parseInt(userInput);

		plyrInfo.setYearsPro(numChckr);

		do {
			System.out.println("Is your player a free agent?" + "\n" + "Enter y for yes and n for no:");
			userInput = keyboard.next();

			switch (userInput.toLowerCase().charAt(0)) {
			case 'y':
				plyrInfo.setFreeAgent(true);
				break;
			case 'n':
				plyrInfo.setFreeAgent(false);
				break;
			default:
				break;
			}
		} while (!(userInput.equals("y") || userInput.equals("n")));

		System.out.println(plyrInfo.toString());

	}

	public static boolean validNumInt(String input) {

		try {
			int aNum = Integer.parseInt(input);
			return false;
		} catch (NumberFormatException e) {
			return true;
		}

	}

	public static boolean validNumFloat(String input) {

		try {
			float aNum = Float.parseFloat(input);
			return false;
		} catch (NumberFormatException e) {
			return true;
		}

	}

}
