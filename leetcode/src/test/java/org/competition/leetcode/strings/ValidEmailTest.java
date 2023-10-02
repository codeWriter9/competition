package org.competition.leetcode.strings;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ValidEmailTest {

    private ValidEmail validEmail;

    @Before
    public void setUp() throws Exception {
        validEmail = new ValidEmail();
    }

    @Test
    public void testValidEmail() {
        assertNotNull(validEmail);
        assertEquals(2,
                validEmail.numUniqueEmails(new String[]{
                        "test.email+alex@leetcode.com",
                        "test.e.mail+bob.cathy@leetcode.com",
                        "testemail+david@lee.tcode.com"
                }));
        assertEquals(3,
                validEmail.numUniqueEmails(new String[]{
                        "a@leetcode.com", "b@leetcode.com", "c@leetcode.com"
                }));
    }

    @After
    public void destroy() throws Exception {
        validEmail = null;
    }
}
