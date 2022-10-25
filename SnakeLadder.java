package com.blz.assignment.day4;

import java.util.Random;

public class SnakeLadder {
	public static void main(String[] args) {
	System.out.println("Displaying Snake and Ladder game");
	int position = 0;
	int count = 0;
	Random random = new Random();
	int randomNum = random.nextInt(6) + 1;
	System.out.println("Dice generated " +randomNum);
	}
}
