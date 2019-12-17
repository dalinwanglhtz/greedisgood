package com.codewardev;

// https://www.codewars.com/kata/greed-is-good/train/java

public class Greed {

	public static int greedy(int[] dice) {
		int total=0;

		int[] diceOccur = {0,0,0,0,0,0,0};
		for(int j: dice) {
			diceOccur[j]++;
		}
		
		total += (diceOccur[1] > 2? 1000+(diceOccur[1]-3)*100: diceOccur[1]*100);
		total += (diceOccur[2] > 2? 200: 0);
		total += (diceOccur[3] > 2? 300: 0);
		total += (diceOccur[4] > 2? 400: 0);
		total += (diceOccur[5] > 2? 500+(diceOccur[5]-3)*50: diceOccur[5]*50);
		total += (diceOccur[6] > 2? 600: 0);

		return total;
	}

}
