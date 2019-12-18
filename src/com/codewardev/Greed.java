package com.codewardev;

// https://www.codewars.com/kata/greed-is-good/train/java

public class Greed {

	public static int greedy(int[] dice) {
		int total=0;

		int[] diceOccur = {0,0,0,0,0,0,0};
		for(int j: dice) diceOccur[j]++;
		
		for(int i=1; i<diceOccur.length; i++) {
			if(i==1) {
				total += (diceOccur[i] > 2? 1000+(diceOccur[1]-3)*100: diceOccur[1]*100);
			} else
			if(i==5) {
				total += (diceOccur[i] > 2? 500+(diceOccur[5]-3)*50: diceOccur[5]*50);
			} else {
				total += (diceOccur[i] > 2? i*100: 0);
			}
		}

		return total;
	}

}
