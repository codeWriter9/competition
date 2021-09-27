package org.competition.leetcode.array;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidParenthesesTest {

    private ValidParentheses validParentheses;

    @Before
    public void before() {
        validParentheses = new ValidParentheses();
    }

    @Test
    public void testValidParentheses() {
        assertNotNull(validParentheses);
        assertTrue(validParentheses.isValid("()"));
        assertTrue(validParentheses.isValid("{}"));
        assertTrue(validParentheses.isValid("[]"));
        assertFalse(validParentheses.isValid("("));
        assertFalse(validParentheses.isValid("{"));
        assertFalse(validParentheses.isValid("["));
        assertFalse(validParentheses.isValid("(("));
        assertFalse(validParentheses.isValid("{{"));
        assertFalse(validParentheses.isValid("[["));
        assertFalse(validParentheses.isValid(")"));
        assertFalse(validParentheses.isValid("}"));
        assertFalse(validParentheses.isValid("]"));
        assertFalse(validParentheses.isValid("))"));
        assertFalse(validParentheses.isValid("}}"));
        assertFalse(validParentheses.isValid("]]"));
    }

    @After
    public void after() {
        validParentheses = null;
    }
}
