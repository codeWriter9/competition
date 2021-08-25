package org.competition.leetcode.linkedlist;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeLinkedListTest {

    private PalindromeLinkedList palindromeLinkedList;

    @Before
    public void before() {
        palindromeLinkedList = new PalindromeLinkedList();
    }

    @Test
    public void testPalindrome() {
        long start = System.currentTimeMillis();
        assertNotNull(palindromeLinkedList);
        assertFalse(palindromeLinkedList.isPalindrome(ListNode.list(1, 2, 3, 4, 5)));
        assertTrue(palindromeLinkedList.isPalindrome(ListNode.list(1, 2, 3, 2, 1)));
        long end = System.currentTimeMillis();
        System.out.println("Time Taken:" + (end - start));
    }

    @After
    public void after() {
        palindromeLinkedList = null;
    }

}