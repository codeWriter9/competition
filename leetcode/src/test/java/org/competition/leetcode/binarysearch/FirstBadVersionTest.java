package org.competition.leetcode.binarysearch;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstBadVersionTest {

    private FirstBadVersion firstBadVersion;

    @Before
    public void setUp() {
        firstBadVersion = new FirstBadVersion() {

            @Override
            boolean isBadVersion(int version) {
                return version >= 4;
            }
        };
    }

    @Test
    public void testFirstBadVersion() {
        assertEquals(4, firstBadVersion.firstBadVersion(5));
        firstBadVersion = new FirstBadVersion() {

            @Override
            boolean isBadVersion(int version) {
                return version >= 1;
            }
        };
        assertEquals(1, firstBadVersion.firstBadVersion(1));
        firstBadVersion = new FirstBadVersion() {

            @Override
            boolean isBadVersion(int version) {
                return version >= 90;
            }
        };

        assertEquals(90, firstBadVersion.firstBadVersion(100));
    }

    @After
    public void tearDown() {
        firstBadVersion = null;
    }
}
