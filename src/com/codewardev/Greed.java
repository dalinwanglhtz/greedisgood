package com.codewardev;

// https://www.codewars.com/kata/greed-is-good/train/java

import java.util.Arrays;

public class Greed {

	public static int greedy(int[] dice) {
		int total=0;

		dice = Arrays.stream(dice).sorted().toArray();

		int count=0;
		for(int i=0; i<dice.length; i++) {
			if(i!=0 && dice[i]==dice[i-1]) {
				count++;
			}
			
			if(i!=0 && dice[i]!=dice[i-1]){
				count = 0;
			}
			
			if(count == 2) {
				if(dice[i] == 1) {
					total -= 200;
					total += 1000;
				} else
				if(dice[i] == 2) {
					total += 200;
				} else
				if(dice[i] == 3) {
					total += 300;
				} else
				if(dice[i] == 4) {
					total += 400;
				} else
				if(dice[i] == 5) {
					total -= 100;
					total += 500;
				} else
				if(dice[i] == 6) {
					total += 600;
				}
				count = i+1 != dice.length && dice[i] == dice[i+1] ? -1:0;
			} else
			if(count < 2 && dice[i] == 1) {
				total += 100;
			} else
			if(count < 2 && dice[i] == 5) {
				total += 50;
			}
			
		}

		return total;
	}

}
