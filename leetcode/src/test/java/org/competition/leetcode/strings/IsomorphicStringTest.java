package org.competition.leetcode.strings;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsomorphicStringTest {

    private IsomorphicString isomorphicString;

    @Before
    public void before() {
        isomorphicString = new IsomorphicString();
    }

    @Test
    public void testIsomorphicStringNotNull() {
        assertNotNull(isomorphicString);
    }

    @Test
    public void testIsomorphicString1() {
        assertFalse(isomorphicString.isIsomorphic("foo", "bar"));
    }

    @Test
    public void testIsomorphicString2() {
        assertTrue(isomorphicString.isIsomorphic("egg", "add"));
    }

    @Test
    public void testIsomorphicString3() {
        assertTrue(isomorphicString.isIsomorphic("paper", "title"));
    }

    @Test
    public void testIsomorphicString4() {
        assertFalse(isomorphicString.isIsomorphic("badc", "baba"));
    }

    @After
    public void after() {
        isomorphicString = null;
    }
}