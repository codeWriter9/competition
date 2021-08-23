package org.competition.leetcode.linkedlist;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.competition.leetcode.linkedlist.ListNode.list;
import static org.competition.leetcode.linkedlist.ListNode.print;
import static org.junit.Assert.assertNotNull;


public class ReverseLinkedTest {

    private ReverseLinked reverseLinked;

    @Before
    public void before() {
        reverseLinked = new ReverseLinked();
    }

    @Test
    public void test() {
        assertNotNull(reverseLinked);
        print(reverseLinked.reverse(list(1, 2, 3, 4, 5)));
    }

    @After
    public void after() {
        reverseLinked = null;
    }

}
