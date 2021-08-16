package org.competition.leetcode.array;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;

import static java.util.Arrays.asList;

public class PaginationTest extends TestCase {

    private Page pages;

    public PaginationTest(String testName) {
        super(testName);
        pages = new Page();
    }

    public static Test suite() {
        return new TestSuite(PaginationTest.class);
    }

    public void testPaginationArray() {
        Assert.assertNotNull(pages);
        Assert.assertArrayEquals(new int[]{1, 2}, pages.pagination(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, 2, 1));
        Assert.assertArrayEquals(new int[]{3, 4}, pages.pagination(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, 2, 2));
        Assert.assertArrayEquals(new int[]{5, 6}, pages.pagination(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, 2, 3));
    }

    public void testPaginationList() {
        Assert.assertNotNull(pages);
        Assert.assertEquals(asList(1, 2), pages.pagination(asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0), 2, 1));
        Assert.assertEquals(asList(3, 4), pages.pagination(asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0), 2, 2));
        Assert.assertEquals(asList(5, 6), pages.pagination(asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0), 2, 3));
    }
}
