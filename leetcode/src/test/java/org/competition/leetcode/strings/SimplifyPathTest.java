package org.competition.leetcode.strings;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimplifyPathTest {

    private SimplifyPath simplifyPath;

    @Before
    public void setUp() {
        simplifyPath = new SimplifyPath();
    }

    @Test
    public void test() {
        assertEquals("/home", simplifyPath.simplifyPath("/home/"));
        assertEquals("/home/foo", simplifyPath.simplifyPath("/home//foo/"));
    }

    @After
    public void tearDown() {
        simplifyPath = null;
    }
}
