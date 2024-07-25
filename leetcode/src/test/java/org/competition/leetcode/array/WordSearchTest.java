package org.competition.leetcode.array;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordSearchTest {

    private WordSearch wordSearch;

    @Before
    public void setUp() throws Exception {
        wordSearch = new WordSearch();
    }

    @Test
    public void test() {
        assertNotNull(wordSearch);
        assertTrue(wordSearch.exist(new char[][]{{'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}}, "ABCCED"));
        assertTrue(wordSearch.exist(new char[][]{{'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}}, "SEE"));
        assertFalse(wordSearch.exist(new char[][]{{'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}}, "ABCB"));
    }

    @After
    public void tearDown() throws Exception {
        wordSearch = null;
    }
}
