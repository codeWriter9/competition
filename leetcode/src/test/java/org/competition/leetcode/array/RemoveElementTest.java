package org.competition.leetcode.array;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class RemoveElementTest {

    private RemoveElement removeElement;

    @Before
    public void before() {
        removeElement = new RemoveElement();
    }

    @Test
    public void testDeleteElement() {
        assertNotNull(removeElement);
        assertEquals(2, removeElement.removeElement(new int[]{3, 2, 2, 3}, 3));
        assertEquals(5, removeElement.removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));

    }

    @After
    public void after() {
        removeElement = null;
    }

}