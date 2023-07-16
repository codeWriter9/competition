package org.competition.leetcode.array;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

public class KeyboardRowTest {

    private KeyBoardRow keyBoardRow;

    @Before
    public void before() {
        keyBoardRow = new KeyBoardRow();
    }

    @Test
    public void testKeyBoardRow() {
        assertNotNull(keyBoardRow);
        assertArrayEquals(new String[]{"Alaska", "Dad"}, keyBoardRow.findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"}));
        assertArrayEquals(new String[]{}, keyBoardRow.findWords(new String[]{"omk"}));
        assertArrayEquals(new String[]{"adsdf", "sfd"}, keyBoardRow.findWords(new String[]{"adsdf", "sfd"}));
    }

    @After
    public void after() {
        keyBoardRow = null;
    }
}
