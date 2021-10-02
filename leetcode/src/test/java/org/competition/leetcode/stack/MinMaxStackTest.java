package org.competition.leetcode.stack;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MinMaxStackTest {

    private MinMaxStack minMaxStack;

    @Before
    public void before() {
        minMaxStack = new MinMaxStack();
    }

    @Test
    public void testMinMaxStack() {
        assertNotNull(minMaxStack);
        minMaxStack.push(5);
        assertEquals(5, minMaxStack.getMax());
        assertEquals(5, minMaxStack.getMin());
        minMaxStack.push(6);
        assertEquals(6, minMaxStack.getMax());
        assertEquals(5, minMaxStack.getMin());
        minMaxStack.push(1);
        assertEquals(6, minMaxStack.getMax());
        assertEquals(1, minMaxStack.getMin());
        minMaxStack.pop();
        assertEquals(6, minMaxStack.getMax());
        assertEquals(5, minMaxStack.getMin());
        minMaxStack.pop();
        assertEquals(5, minMaxStack.getMax());
        assertEquals(5, minMaxStack.getMin());
    }

    @Test
    public void testMinMaxStack2() {
        assertNotNull(minMaxStack);
        minMaxStack.push(5);
        assertEquals(5, minMaxStack.getMax());
        assertEquals(5, minMaxStack.getMin());
        minMaxStack.push(5);
        assertEquals(5, minMaxStack.getMax());
        assertEquals(5, minMaxStack.getMin());
        minMaxStack.push(6);
        assertEquals(6, minMaxStack.getMax());
        assertEquals(5, minMaxStack.getMin());
        minMaxStack.push(6);
        assertEquals(6, minMaxStack.getMax());
        assertEquals(5, minMaxStack.getMin());
        minMaxStack.push(1);
        assertEquals(6, minMaxStack.getMax());
        assertEquals(1, minMaxStack.getMin());

        minMaxStack.pop();
        assertEquals(6, minMaxStack.getMax());
        assertEquals(5, minMaxStack.getMin());
        minMaxStack.pop();
        assertEquals(6, minMaxStack.getMax());
        assertEquals(5, minMaxStack.getMin());
        minMaxStack.pop();
        assertEquals(5, minMaxStack.getMax());
        assertEquals(5, minMaxStack.getMin());
    }

    @Test
    public void testMinMaxStack3() {
        minMaxStack.push(-10);
        minMaxStack.push(14);
        assertEquals(-10, minMaxStack.getMin());
        assertEquals(-10, minMaxStack.getMin());
        minMaxStack.push(-20);
        assertEquals(-20, minMaxStack.getMin());
        assertEquals(-20, minMaxStack.getMin());
        assertEquals(-20, minMaxStack.top());
        assertEquals(-20, minMaxStack.getMin());
        minMaxStack.pop();
        minMaxStack.push(10);
        minMaxStack.push(-7);
        assertEquals(-10, minMaxStack.getMin());
    }

    @After
    public void after() {
        minMaxStack = null;
    }

}
