package org.competition.leetcode.miscellaneous;

import java.util.HashMap;
import java.util.Map;

public class TwoSum  {

	public int [] twoSum(int [] array, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int [] indices = new int[2];
		for(int index=0;index<array.length;index++) {
			if(map.containsKey(target - array[index])) { // we found the complement
				int complementIndex = map.get(target - array[index]);
				return new int [] { complementIndex, index};// return index of number and complement
			}
			else {
				map.put(array[index], index);// save number and index
			}
		}
		return indices;
	}
}


