package org.competition.leetcode.array;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;

public class MoveZeroTest extends TestCase {

    private MoveZero moveZero;

    public MoveZeroTest(String testName) {
        super(testName);
        moveZero = new MoveZero();
    }

    public static Test suite() {
        return new TestSuite(MoveZeroTest.class);
    }

    public void testMoveZero() {
        Assert.assertNotNull(moveZero);
        Assert.assertArrayEquals(new int[]{1, 2, 3, 1, 0, 0, 0}, moveZero.moveZeroes(new int[]{1, 2, 3, 0, 0, 1, 0}));
        Assert.assertArrayEquals(new int[]{0}, moveZero.moveZeroes(new int[]{0}));
    }


}
