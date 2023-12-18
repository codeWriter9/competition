package org.competition.leetcode.array;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

/**
 *
 *
 * TODO: Complete This
 *
 */
public class InsertIntervalTest {

    private InsertInterval insertInterval;

    @Before
    public void setUp() throws Exception {
        insertInterval = new InsertInterval();
    }

    @Test
    public void test() {
        assertNotNull(insertInterval);
//        assertArrayEquals(new int[][]{{1, 2}, {3, 10}, {12, 16}},
//                insertInterval.insert(
//                        new int[][]{{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}},
//                        new int[]{4, 8}));
//        assertArrayEquals(new int[][]{{1, 5}, {6, 9}},
//                insertInterval.insert(
//                        new int[][]{{1, 3}, {6, 9}},
//                        new int[]{2, 5}));

    }

    @After
    public void tearDown() throws Exception {
        insertInterval = null;
    }
}
