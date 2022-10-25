package com.blz.assignment.day4;

import java.util.Random;

public class SnakeLadder {
	public static void main(String[] args) {
		System.out.println("Displaying Snake and Ladder game");
		int position = 0;
		int count = 0;
		Random random = new Random();
		while (position >= 0 && position < 100) {
			int randomNum = random.nextInt(6) + 1;
			System.out.println("Dice generated " + randomNum);
			int option = random.nextInt(3);
			System.out.println("option = " + option);
			switch (option) {

			case 0:
				System.out.println("Player stays in the same position");
				break;

			case 1:
				position = position + randomNum;
				if (position > 100) {
					position -= randomNum;
				}
				System.out.println("Player moved at next position " + position);
				break;

			case 2:
				position -= randomNum;
				if (position < 0) {
					position = 0;
				}
				System.out.println("Player moved back " + position);

			}
			System.out.println();
		}
	}
}
