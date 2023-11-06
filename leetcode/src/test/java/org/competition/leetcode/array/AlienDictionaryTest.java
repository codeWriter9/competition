package org.competition.leetcode.array;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlienDictionaryTest {

    private AlienDictionary alienDictionary;

    @Before
    public void setUp() throws Exception {
        alienDictionary = new AlienDictionary();
    }

    @Test
    public void testAlienDictionary() {
        assertNotNull(alienDictionary);
        assertTrue(alienDictionary.isAlienSorted(new String[]{"hello",
                "leetcode"}, "hlabcdefgijkmnopqrstuvwxyz"));
        assertFalse(alienDictionary.isAlienSorted(new String[]{"word", "world", "row"},
                "worldabcefghijkmnpqstuvxyz"));
        assertFalse(alienDictionary.isAlienSorted(new String[]{"apple", "app"},
                "abcdefghijklmnopqrstuvwxyz"));
    }

    @After
    public void destroy() throws Exception {
        alienDictionary = null;
    }
}
