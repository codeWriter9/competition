package org.competition.leetcode.strings;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ReverseOnlyLettersTest {

    private ReverseOnlyLetters reverseOnlyLetters;

    @Before
    public void before() {
        reverseOnlyLetters = new ReverseOnlyLetters();
    }

    @Test
    public void testReverseOnlyLetters() {
        assertNotNull(reverseOnlyLetters);
        assertEquals("dc-ba", reverseOnlyLetters.reverseOnlyLetters("ab-cd"));
        assertEquals("j-Ih-gfE-dCba", reverseOnlyLetters.reverseOnlyLetters("a-bC-dEf-ghIj"));
        assertEquals("Qedo1ct-eeLg=ntse-T!", reverseOnlyLetters.reverseOnlyLetters("Test1ng-Leet=code-Q!"));
    }

    @After
    public void after() {
        reverseOnlyLetters = null;
    }
}
