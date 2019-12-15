package com.codewardev;

// https://www.codewars.com/kata/greed-is-good/train/java

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Greed {

	public static int greedy(int[] dice) {
		int total=0;
		Map<Integer, Integer> numbers = new HashMap<Integer, Integer>();
		for(int x: dice) {
			if(numbers.containsKey(x)) {
				numbers.put(x, numbers.get(x)+1);
			} else {
				numbers.put(x, 1);
			}
		}
		Iterator it = numbers.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<Integer, Integer> elem = (Entry<Integer, Integer>) it.next();
			if(elem.getKey() == 1 && elem.getValue() >= 3) {
				total += 1000;
			}
		}
		
		int numOne = (int) Arrays.stream(dice).filter(x->x==1).count();

		System.out.println("Num 1s: "+numOne);
		return total;
	}

}
