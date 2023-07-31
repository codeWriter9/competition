package org.competition.leetcode.strings;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class StringIteratorTest {

    private StringIterator stringIterator;

    @Before
    public void before() {
        stringIterator = new StringIterator("L1e2t1C1o1d1e1");
    }

    @Test
    public void testStringIterator() {
        assertNotNull(stringIterator);
        assertEquals('L', stringIterator.next());
        assertEquals('e', stringIterator.next());
        assertEquals('e', stringIterator.next());
        assertEquals('t', stringIterator.next());
        assertEquals('C', stringIterator.next());
        assertEquals('o', stringIterator.next());
        assertEquals(true, stringIterator.hasNext());
        assertEquals('d', stringIterator.next());
        assertEquals(true, stringIterator.hasNext());
    }

    @After
    public void after() {
        stringIterator = null;
    }
}
