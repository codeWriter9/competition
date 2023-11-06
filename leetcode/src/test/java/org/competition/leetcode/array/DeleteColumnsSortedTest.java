package org.competition.leetcode.array;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DeleteColumnsSortedTest {

    private DeleteColumnsSorted deleteColumnsSorted;

    @Before
    public void setUp() throws Exception {
        deleteColumnsSorted = new DeleteColumnsSorted();
    }

    @Test
    public void testMinDeletionSize() {
        assertNotNull(deleteColumnsSorted);
        assertEquals(1, deleteColumnsSorted.minDeletionSize(new String[]{"cba", "daf", "ghi"}));
        assertEquals(0, deleteColumnsSorted.minDeletionSize(new String[]{"a", "b"}));
        assertEquals(3, deleteColumnsSorted.minDeletionSize(new String[]{"zyx", "wvu", "tsr"}));
    }

    @After
    public void destroy() {
        deleteColumnsSorted = null;
    }
}
