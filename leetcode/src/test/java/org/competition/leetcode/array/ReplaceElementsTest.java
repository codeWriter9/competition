package org.competition.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

public class ReplaceElementsTest {

    private ReplaceElements replaceElements;

    @Before
    public void before() {
        replaceElements = new ReplaceElements();
    }

    @Test
    public void testReplaceElements() {
        assertNotNull(replaceElements);
        int [] array = {17,18,5,4,6,1};
        assertArrayEquals(new int[]{18,6,6,6,1,-1}, replaceElements.replaceElements(array));
    }

    @Test
    public void testReplaceElements2() {
        assertNotNull(replaceElements);
        int [] array = {400};
        assertArrayEquals(new int[]{-1}, replaceElements.replaceElements(array));
    }

    @After
    public void after() {
        replaceElements = null;
    }

}
