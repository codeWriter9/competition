package org.competition.leetcode.linkedlist;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.competition.leetcode.linkedlist.ListNode.list;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ReversePrintLinkListTest {

    private ReversePrintLinkList reversePrintLinkList;

    @Before
    public void before() {
        reversePrintLinkList = new ReversePrintLinkList();
    }

    @Test
    public void test() {
        assertNotNull(reversePrintLinkList);
        assertEquals("54321", reversePrintLinkList.reversePrint(list(1, 2, 3, 4, 5)));
    }

    @After
    public void after() {
        reversePrintLinkList = null;
    }
}
