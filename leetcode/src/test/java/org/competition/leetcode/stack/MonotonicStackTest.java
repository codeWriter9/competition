package org.competition.leetcode.stack;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MonotonicStackTest {

    private MonotonicStack monotonicStack;

    @Before
    public void setUp() {
        monotonicStack = new MonotonicStack();
    }

    @Test
    public void test() {
        int [] arr = new int[]{5, 4, 3, 2, 1};
        System.out.println(monotonicStack.minStack(arr));
    }

    @After
    public void tearDown() {
        monotonicStack = null;
    }
}
