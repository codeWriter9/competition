package org.competition.leetcode.recursive;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class NCharacterPasswordTest {

    private NCharacterPassword nCharacterPassword;

    @Before
    public void setUp() {
        nCharacterPassword = new NCharacterPassword();
    }

    @Test
    public void testNCharacterPassword() {
        assertNotNull(nCharacterPassword);
        System.out.println(nCharacterPassword.password("abc"));
        assertNotNull(nCharacterPassword.password("abc"));
    }

    @After
    public void destroy() {
        nCharacterPassword = null;
    }

}
