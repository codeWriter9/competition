package org.competition.leetcode.miscellaneous;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class LRUCacheTest {

    private LRUCache lruCache;

    @Before
    public void before() {
        lruCache = new LRUCache(2);
    }

    @Test
    public void test() {
        assertNotNull(lruCache);
        lruCache.put(1, 1);// cache is {1=1}
        lruCache.put(2, 2);// cache is {1=1, 2=2}
        assertEquals(1, lruCache.get(1));// return 1
        lruCache.put(3, 3);// LRU key was 2, evicts key 2, cache is {1=1, 3=3}
        assertEquals(-1, lruCache.get(2));// returns -1 (not found)
        lruCache.put(4, 4);// LRU key was 1, evicts key 1, cache is {4=4, 3=3}
        assertEquals(-1, lruCache.get(1));// returns -1 (not found)
        assertEquals(3, lruCache.get(3));
        assertEquals(4, lruCache.get(4));
    }

    @After
    public void after() {
        lruCache = null;
    }
}
