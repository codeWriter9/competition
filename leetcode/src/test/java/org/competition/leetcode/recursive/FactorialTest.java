package org.competition.leetcode.recursive;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;

public class FactorialTest extends TestCase {

    private Factorial factorial;

    public FactorialTest(String name) {
        super(name);
        factorial = new Factorial();
    }

    public static Test suite() {
        return new TestSuite(FactorialTest.class);
    }

    public void testFactorial() {
        Assert.assertNotNull(factorial);
        Assert.assertEquals(120, factorial.factorial(5));
        Assert.assertEquals(720, factorial.factorial(6));
        Assert.assertEquals(5040, factorial.factorial(7));
        Assert.assertEquals(40320, factorial.factorial(8));
    }
}
