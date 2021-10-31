package org.competition.leetcode.recursive;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GenerateParenthesesTest {

    private GenerateParentheses generateParentheses;

    @Before
    public void before() {
        generateParentheses = new GenerateParentheses();
    }

    @Test
    public void testGenerateParenthesesNotNull() {
        assertNotNull(generateParentheses);
    }

    @Test
    public void testGenerateParentheses() {
        assertEquals(asList("()"), generateParentheses.generateParenthesis(1));
        assertEquals(asList("(())", "()()"), generateParentheses.generateParenthesis(2));
        assertEquals(asList("((()))", "(()())","(())()", "()(())", "()()()"), generateParentheses.generateParenthesis(3));
    }

    @After
    public void after() {
        generateParentheses = null;
    }
}