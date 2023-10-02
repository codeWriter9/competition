package org.competition.leetcode.miscellaneous;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyHashSetTest {

    private MyHashSet myHashSet;

    @Before
    public void before() {
        myHashSet = new MyHashSet();
    }

    @Test
    public void testHashSet() {
        assertNotNull(myHashSet);
        MyHashSet myHashSet = new MyHashSet();
        myHashSet.add(1);      // set = [1]
        myHashSet.add(2);      // set = [1, 2]
        assertTrue(myHashSet.contains(1)); // return True
        assertFalse(myHashSet.contains(3)); // return False, (not found)
        myHashSet.add(2);      // set = [1, 2]
        assertTrue(myHashSet.contains(2)); // return True
        myHashSet.remove(2);   // set = [1]
        assertFalse(myHashSet.contains(2)); // return False, (already removed)
    }

    @After
    public void after() {
        myHashSet = null;
    }
}
