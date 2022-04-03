package org.competition.leetcode.miscellaneous;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class TwoSumTest {


	private TwoSum twoSum;


	@Before
	public void before() {
		twoSum = new TwoSum();
	}

	@Test
	public void testTwoSum() {
		assertNotNull(twoSum);
		int target = 9; // target sum 
		int [] nums = {2, 7, 13, 52};// input array 
		int [] expected = {0, 1};// indices of the numbers whose sum equals the target
		
		int [] actual = twoSum.twoSum(nums, target);
		for(int index=0;index<expected.length;index++) {
			//assert expected[index] == actual[index];
		}

	}

	@After
	public void after() {
		twoSum = null;
	}
}
