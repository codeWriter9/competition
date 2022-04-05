package org.competition.leetcode.recursive;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParenthesesTest {

    private Parentheses parentheses;

    @Before
    public void setUp() {
        parentheses = new Parentheses();
    }

    @Test
    public void testParentheses() {
        assertNotNull(parentheses);
        assertEquals("()", parentheses.parentheses(1));
        assertEquals("(())", parentheses.parentheses(2));
        assertEquals("((()))", parentheses.parentheses(3));
    }

    @Test
    public void testParenthesis() {
        assertNotNull(parentheses);
        assertEquals("()", parentheses.parenthesis(1));
        assertEquals("()(())()", parentheses.parenthesis(2));
        assertEquals("()(())()(()(())())()(())()", parentheses.parenthesis(3));
    }

    @After
    public void destroy() {
        parentheses = null;
    }

}
