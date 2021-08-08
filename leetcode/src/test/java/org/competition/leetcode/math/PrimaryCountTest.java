package org.competition.leetcode.math;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class PrimaryCountTest extends TestCase {

    private PrimaryCount primaryCount;

    public PrimaryCountTest( String testName )
    {
        super( testName );
        primaryCount = new PrimaryCount();
    }

    public static Test suite()
    {
        return new TestSuite( PrimaryCountTest.class );
    }

    public void testPrimaryCount()
    {
        assertEquals( 0, primaryCount.countPrimes(0)    );
        assertEquals( 4, primaryCount.countPrimes(10)    );
    }
}
